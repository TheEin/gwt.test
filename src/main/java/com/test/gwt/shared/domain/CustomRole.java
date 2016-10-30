package com.test.gwt.shared.domain;

import static com.test.gwt.shared.domain.Role.CUSTOM_ROLE;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

/**
 * Пользовательская роль. Настраивается пользователями с доступом EDIT_ROLES.
 */
@Entity
@DiscriminatorValue(CUSTOM_ROLE)
public class CustomRole extends Role {

    /**
     * Список доступных данной роли действий.
     */
    @ElementCollection
    @JoinTable(name = "ROLE_ACTIONS", joinColumns = @JoinColumn(name = "ROLE_ID"))
    @Column(name = "ROLE_ACTION", nullable = false)
    @Enumerated(EnumType.STRING)
    private final Set<Action> actions = new HashSet<>();

    public Set<Action> getActions() {
        return actions;
    }

    @Override
    public boolean hasAction(Action action) {
        return actions.contains(action);
    }

}
