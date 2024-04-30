package com.example.project1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/signup")
    public String getRegisterPage() {
        return "signup"; // Retourne le nom de la vue sans extension
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login"; // Retourne le nom de la vue sans extension
    }
}
