package com.test.gwt.shared.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import org.hibernate.annotations.DiscriminatorFormula;

/**
 * Класс Роль - держит в себе список доступных данной роли действий. Доступ
 * EDIT_OWN_PERSON_DATA должен быть у любой роли по умолчанию. В последствии он
 * может быть забран пользователем с доступом EDIT_ROLES.
 */
@Entity(name = "ARole")
@Inheritance
@DiscriminatorFormula("case when id > 0 then 'ADMIN' else 'CUSTOM' end")
public abstract class Role implements Serializable {

    public static final String ADMIN_ROLE = "ADMIN";

    public static final String CUSTOM_ROLE = "CUSTOM";

    @Id
    @GeneratedValue
    private Integer id;

    /**
     * Имя роли. Уникальное значение.
     */
    @Column(unique = true)
    private String name;

    public abstract boolean hasAction(Action action);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
