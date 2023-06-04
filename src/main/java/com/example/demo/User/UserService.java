package com.example.demo.User;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    public List<User> getUsers() {
        return List.of(
                new User(1L, "Jawel", "jawel@gmail.com", "1234", false, false),
                new User(2L, "Pawel", "Pawel@gmail.com", "1das", false, false)
        );
    }
}
