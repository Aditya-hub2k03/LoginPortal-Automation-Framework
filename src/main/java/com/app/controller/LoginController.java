package com.app.controller;

import com.app.model.User;
import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String validateUser(@RequestParam("email") String email,
                               @RequestParam("password") String password,
                               Model model) {

        User user = userService.validateUser(email, password);

        if (user != null) {
            model.addAttribute("name", user.getName());
            return "success";
        } else {
            model.addAttribute("error", "Invalid credentials!");
            return "error";
        }
    }
}
