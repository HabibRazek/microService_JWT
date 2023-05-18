package com.habib.sprint5.service;

import com.habib.sprint5.entities.Role;
import com.habib.sprint5.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);

    List<User> findAllUsers();
}
