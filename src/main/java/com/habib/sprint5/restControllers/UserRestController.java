package com.habib.sprint5.restControllers;

import java.util.List;

import com.habib.sprint5.entities.User;
import com.habib.sprint5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
    @Autowired
    UserService userService;
    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }
}
