package com.test.gwt.shared.domain;

/**
 * Пользовательская роль. Настраивается пользователями с доступом EDIT_ROLES. 
 */
public class CustomRole extends Role {

	@Override
	public boolean hasAction(Action action) {
		// TODO please, write it for me
		return false;
	}

}
