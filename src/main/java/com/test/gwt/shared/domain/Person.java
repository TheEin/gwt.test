package com.test.gwt.shared.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 * Класс Персона - содержит в себе личные данные персоны.
 */
@Entity
public class Person implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    /**
     * Учетные данные пользователя. Может быть пустым.
     */
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    private User user;

    /**
     * Имя персоны. Не может быть null.
     */
    @NotNull
    private String name;

    /**
     * Фамилия персоны. Не может быть null.
     */
    @NotNull
    private String surname;

    /**
     * Отчество персоны. Может быть null.
     */
    private String patronymic;

    /**
     * Фото персоны. Не больше 2-х мегабайт. Может быть null.
     */
    private byte[] photo;

    /**
     * Список контактов персоны. Может быть пустым. Не может быть двух поностью
     * совпадающих контактов.
     */
    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "person")
    private final Set<Contact> contacts = new HashSet<>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

}
