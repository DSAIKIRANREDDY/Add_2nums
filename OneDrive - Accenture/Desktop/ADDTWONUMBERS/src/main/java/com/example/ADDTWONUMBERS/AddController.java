package com.example.ADDTWONUMBERS;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {

    @GetMapping("/")
    public String showForm() {
        return "add";
    }

    @PostMapping("/add")
    public String addNumbers(@RequestParam int num1, @RequestParam int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("sum", sum);
        return "result";
    }
}
