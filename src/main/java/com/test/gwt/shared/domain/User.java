package com.test.gwt.shared.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Учетка пользователя. У одной персоны может быть только одна учетка, или не
 * быть ее вообще (такие персоны не могут залогинится в приложение).
 */
@Entity(name = "AUser")
public class User implements Serializable {

    @Id
    private Integer id;

    /**
     * Персона к которой привязана учетка. Не может быть null.
     */
    @OneToOne(optional = false)
    @JoinColumn(name = "ID")
    @MapsId
    @NotNull
    private Person person;

    /**
     * Имя пользователя. Не может быть null.
     */
    @NotNull
    private String login;

    /**
     * Пароль пользователя. Не может быть null.
     */
    @NotNull
    private String password;

    /**
     * Роли текущей учетки. Список не может быть пустым.
     */
    @ManyToMany
    @NotNull
    @Size(min = 1)
    private Set<Role> roles;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

}
