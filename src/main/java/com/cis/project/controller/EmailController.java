package com.cis.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {

    @GetMapping(value = "email")
    public String email() {
        return "email/mail";
    }

    @GetMapping(value = "email_delete")
    public String emailDelete() {
        return "redirect:email";
    }

    @GetMapping(value = "mail_send")
    public String mailSend() {
        return "email/mail_send";
    }

    @PostMapping(value = "mail_insert")
    public String mailInsert() {
        return "redirect:email";
    }

    @GetMapping(value = "mail_detail")
    public String mailDetail() {
        return "email/mail_detail";
    }

}
