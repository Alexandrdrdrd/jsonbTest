package com.sasha.sandbox.jsonbTest;

import com.sasha.sandbox.jsonbTest.model.Role;
import com.sasha.sandbox.jsonbTest.model.User;
import com.sasha.sandbox.jsonbTest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Test {

    @Autowired
    UserRepository userRepository;


    public void creatAndSaveUser() {
        User user = new User("sasha");
        Role role = new Role("USER");
        user.addRoleToUser(role);
        userRepository.save(user);
    }


}
