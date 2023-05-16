package com.food.go.controller;

import com.food.go.dto.UserDTO;
import com.food.go.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")   //
    public String home(Model model) {
        return "view";   // WEB-INF/pages/main.jsp 를 찾아간다 => application.properties에 선언해줘서 가능
    }
}