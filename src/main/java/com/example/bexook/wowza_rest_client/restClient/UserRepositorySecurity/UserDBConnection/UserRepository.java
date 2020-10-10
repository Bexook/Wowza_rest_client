package com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserDBConnection;

import com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

     User getByName(String name);

}
