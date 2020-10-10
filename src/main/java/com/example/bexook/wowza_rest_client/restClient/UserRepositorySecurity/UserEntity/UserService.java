package com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserEntity;

import com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserDBConnection.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public User getUserByName(String name){
        return userRepository.getByName(name);
    }


    public void setNewUser(User user){
        userRepository.save(user);
    }

}
