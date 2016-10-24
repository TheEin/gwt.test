package com.test.gwt.shared.domain;

/**
 * Набор возможных доступов в приложение.
 */
public enum Action {

	/**
	 * Можно ли просматривать список всех зарегестрированных пользователей. Если роль
	 * обладает таким доступом, то доступен пункт меню "Список пользователей".
	 */
	BROWSE_USERS,
	/**
	 * Можно ли редактировать справочник типов контактов. Если роль обладает таким
	 * доступом, то доступен пункт меню "Справочник типов контактов".
	 */
	EDIT_CONTACT_TYPES,
	/**
	 * Можно ли редактировать справочник ролей системы. Если роль обладает таким доступом,
	 * то доступен пункт меню "Справочник ролей". Роли можно
	 * создавать/удалять/редактировать (все кроме AdminRole).
	 */
	EDIT_ROLES,
	/**
	 * Можно ли редактировать собственные личные данные персоны.
	 */
	EDIT_OWN_PERSON_DATA,
	/**
	 * Можно ли редактировать личные данные любой видимой персоны.
	 */
	EDIT_ANY_PERSON_DATA;

}