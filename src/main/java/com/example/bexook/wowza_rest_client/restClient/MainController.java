package com.example.bexook.wowza_rest_client.restClient;

import com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserEntity.User;
import com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserEntity.UserService;
import com.example.bexook.wowza_rest_client.restClient.SecurityConfig.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private RestClientWowzaStreaming restClientWowzaStreaming;

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;




    @GetMapping("/login")
    public void getData(){
        restClientWowzaStreaming.getDataFromService();
    }




    @PostMapping("/register_user")
    public User registerUser(@RequestBody User user){
        user.setPassword(passwordEncoder.getPasswordEncoder().encode(user.getPassword()));
        userService.setNewUser(user);
        return user;
    }

}
