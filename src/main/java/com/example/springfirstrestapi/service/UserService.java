package com.example.springfirstrestapi.service;

import com.example.springfirstrestapi.api.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Ida", 32, "ida@mail.com");
        User user2 = new User(2,"Hans")
    }
    public User getUser(Integer id) {
    }
}
