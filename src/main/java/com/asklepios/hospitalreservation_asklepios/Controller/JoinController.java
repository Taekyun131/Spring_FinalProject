package com.asklepios.hospitalreservation_asklepios.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoinController {

    @GetMapping("/agreement")
    public String agreement() {
        return "home";
    }
}
