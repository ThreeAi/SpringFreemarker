package com.petproject.SpringFreemarker.controllers;

import com.petproject.SpringFreemarker.models.User;
import com.petproject.SpringFreemarker.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/registration")
    public String createUser(User user, Model model) {
        if (!userService.createUser(user)) {
            model.addAttribute("errorMessage", "User with email: " + user.getEmail() + " already exist");
            return "registration";
        }
        return "redirect:/login";
    }

    @GetMapping("/hello")
    public String securityUrl() {
        return "hello";
    }
}
