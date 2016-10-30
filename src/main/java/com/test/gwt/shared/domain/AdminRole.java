package com.test.gwt.shared.domain;

import static com.test.gwt.shared.domain.Role.ADMIN_ROLE;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Специальная роль в системе. Её никому нельзя редактировать. Должна быть
 * только в одном экземпляре.
 */
@Entity
@DiscriminatorValue(ADMIN_ROLE)
public class AdminRole extends Role {

    @Override
    public final boolean hasAction(Action action) {
        return true;
    }

}
