package com.quizapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    // 1. Login Page dikhane ke liye (localhost:8080/login)
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    // 2. Login check karne ke liye
    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        
        // Tere naye credentials:
        // Username: LITTLE789
        // Password: HELLO@4589..
        
        if ("LITTLE789".equals(username) && "HELLO@4589..".equals(password)) {
            return "redirect:/quiz"; // Sahi password pe Quiz par bhej dega
        } else {
            model.addAttribute("error", "Wrong Details.");
            return "login"; // Galat password pe wapas login page
        }
    }
}