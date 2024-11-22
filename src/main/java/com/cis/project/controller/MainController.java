package com.cis.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = "emp_main")
    public String empMain() {
        return "emp_main";
    }

    @GetMapping(value = "manager_main")
    public String managerMain() {
        return "manager_main";
    }

}
