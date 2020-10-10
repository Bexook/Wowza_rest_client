package com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserEntity;


import com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserEntity.UserRolesService.USER_ROLES;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wowza_application_user")
public class User {

    @Id
    @Column(name = "application_user_id")
    private Long id;

    @Column(name = "application_user_name")
    private String name;


    @Column(name = "application_user_password")
    private String password;

    @Column(name = "application_user_role")
    private USER_ROLES role;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public USER_ROLES getRole() {
        return role;
    }

    public void setRole(USER_ROLES role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
