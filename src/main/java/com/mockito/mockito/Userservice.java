package com.mockito.mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {

    @Autowired
    Userrepo userrepo;

    public User addUser(User user) {
        return userrepo.save(user);
    }
}
