package com.example.portfolio_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String showHomePage() {
        return "New"; // maps to home.html
    }

    @GetMapping("/about")
    public String showAboutPage() {
        return "about"; // maps to about.html
    }

    @GetMapping("/projects")
    public String showProjectsPage() {
        return "projects"; // maps to projects.html
    }

    @GetMapping("/contact")
    public String showContactPage() {
        return "contact"; // maps to contact.html
    }
    @GetMapping("/education")
    public String showEducationPage() {
        return "education"; // maps to education.html
    }

}
