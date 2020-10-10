package com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserEntity.UserRolesService;

import com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserEntity.User;
import org.springframework.security.core.GrantedAuthority;

public class UserRolesServiceClass implements GrantedAuthority {

    private User user;

    public UserRolesServiceClass(User user) {
        this.user = user;
    }

    @Override
    public String getAuthority() {
        return user.getRole().name();
    }
}
