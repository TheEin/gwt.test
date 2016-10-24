package com.test.gwt.shared.domain;


/**
 * Специальная роль в системе. Её никому нельзя редактировать. Должна быть только в одном экземпляре. 
 */
public final class AdminRole extends Role {

	@Override
	public final boolean hasAction(Action action) {
		return true;
	}

}
