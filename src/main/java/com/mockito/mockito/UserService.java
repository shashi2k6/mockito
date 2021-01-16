package com.mockito.mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository UserRepository;

    public User addUser(User user) {
        return UserRepository.save(user);
    }
}
