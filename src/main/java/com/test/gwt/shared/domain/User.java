package com.test.gwt.shared.domain;

import java.util.List;

/**
 * Учетка пользователя. У одной персоны может быть несколько учеток. Но у одной учетки
 * должена быть только одна учетка.
 *
 */
public class User {

	/**
	 * Персона к которой привязана учетка. Не может быть null.
	 */
	private Person person;
	/**
	 * Имя пользователя. Не может быть null.
	 */
	private String login;
	/**
	 * Пароль пользователя. Не может быть null.
	 */
	private String password;
	/**
	 * Роли текущей учетки. Список не может быть пустым.
	 */
	private List<Role> roles;

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

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
