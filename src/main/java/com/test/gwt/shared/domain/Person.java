package com.test.gwt.shared.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Персона - содержит в себе личные данные персоны.
 *
 */
public class Person {

	/**
	 * Учетные данные пользователя. Может быть пустым. Не может содержать двух одинаковых
	 * учеток.
	 */
	private List<User> user;
	/**
	 * Имя персоны. Не может быть null.
	 */
	private String name;
	/**
	 * Фамилия персоны. Не может быть null.
	 */
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
	private final List<Contact> contacts = new ArrayList<Contact>();

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
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

	public List<Contact> getContacts() {
		return contacts;
	}

}
