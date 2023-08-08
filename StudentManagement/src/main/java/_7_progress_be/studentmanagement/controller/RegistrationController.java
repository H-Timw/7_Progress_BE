package _7_progress_be.studentmanagement.controller;

import _7_progress_be.studentmanagement.model.User;
import _7_progress_be.studentmanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RegistrationController {
    private final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String addUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return "Registration Successfully";
    }
}
