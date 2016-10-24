package com.test.gwt.shared.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Роль - держит в себе список доступных данной роли действий. Доступ
 * EDIT_OWN_PERSON_DATA должен быть у любой роли по умолчанию. В последствии он может быть
 * забран пользователем с доступом EDIT_ROLES. 
 */
public abstract class Role {

	/**
	 * Имя роли. Уникальное значение. 
	 */
	private String name;
	/**
	 * Список доступных данной роли действий.
	 */
	private final List<Action> actions = new ArrayList<Action>();

	public abstract boolean hasAction(Action action);

	public List<Action> getActions() {
		return actions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
