package org.example.function.tp.enonce;

import java.util.Arrays;
import java.util.List;

public class MenuAccess {

    public void setAuthorizationsInEachMenus(
            List<MenuItem> menuItems, Role[] roles) {
        if(roles == null)
            return;

        menuItems.forEach(
                menuItem -> setAccessForMenuItem(menuItem, roles));
    }

    private void setAccessForMenuItem(MenuItem menuItem, Role[] roles) {
        if (doesUserHaveTheRole(roles, menuItem.getReadAccessRole())) {
            menuItem.setAccess(Constants.READ);
            menuItem.setVisible(true);
        }

        if(doesUserHaveTheRole(roles, menuItem.getWriteAccessRole())) {
            menuItem.setAccess(Constants.WRITE);
            menuItem.setVisible(true);
        }
    }

    private boolean doesUserHaveTheRole(Role[] roles, String roleToCheckFor) {
        return Arrays.stream(roles)
                .anyMatch(role -> role.getName().equals(roleToCheckFor));
    }
}
