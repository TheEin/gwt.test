package com.test.gwt.shared.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Тип контакта используемого в программе.
 */
@Entity
public class ContactType implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    /**
     * Название типа контакта (например: телефон, email, skype, icq и т.д.). Не
     * может быть null. Уникальное значение.
     */
    @NotNull
    @Column(unique = true)
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
