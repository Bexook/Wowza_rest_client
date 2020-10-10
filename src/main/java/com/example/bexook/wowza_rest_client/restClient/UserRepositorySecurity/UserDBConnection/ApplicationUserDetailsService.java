package com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserDBConnection;

import com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserEntity.User;
import com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserEntity.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new ApplicationUserDetails(getUserByName(s));
    }

    private User getUserByName(String name){
        return userService.getUserByName(name);
    }

}
