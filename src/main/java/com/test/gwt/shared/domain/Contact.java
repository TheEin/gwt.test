package com.test.gwt.shared.domain;

/**
 * Контакт пользователя. Для одного и того же пользователя нельзя добавлять два контакта с
 * одновременно одинаковыми type и contact.
 *
 */
public class Contact {

	/**
	 * Тип контакта из справочника. Не может быть null. 
	 */
	private ContactType type;
	/**
	 * Значение контакта (номер телефона, имя в скайпе, и т.д.). Не может быть null. 
	 */
	private String contact;

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
