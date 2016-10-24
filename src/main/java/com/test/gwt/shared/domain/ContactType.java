package com.test.gwt.shared.domain;


/**
 * Тип контакта используемого в программе. 
 *
 */
public class ContactType {
	
	/**
	 * Название типа контакта (например: телефон, email, skype, icq и т.д.). Не может быть null. 
	 * Уникальное значение. 
	 */
	private String typeName;

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
