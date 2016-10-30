package com.test.gwt.shared.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

/**
 * Контакт пользователя. Для одного и того же пользователя нельзя добавлять два
 * контакта с одновременно одинаковыми type и contact.
 */
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "TYPE_ID", "CONTACT" }))
public class Contact implements Serializable {

    @Id
    @ManyToOne(optional = false)
    @NotNull
    private Person person;

    /**
     * Тип контакта из справочника. Не может быть null.
     */
    @Id
    @ManyToOne(optional = false)
    @NotNull
    private ContactType type;

    /**
     * Значение контакта (номер телефона, имя в скайпе, и т.д.). Не может быть
     * null.
     */
    @NotNull
    private String contact;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ContactType getType() {
        return type;
    }

    public void setType(ContactType type) {
        this.type = type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}
