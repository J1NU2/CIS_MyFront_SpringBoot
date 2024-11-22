package com.cis.project.controller;

import com.cis.project.dto.TestDTO;
import com.cis.project.service.IF_TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//@RequiredArgsConstructor
public class TestController {

    @Autowired
    IF_TestService testService;

    @GetMapping(value = "test")
    public String test() {
        return "test/test";
    }

    // 등록 테스트
    @GetMapping(value = "test_insert")
    public String test_insert() {
        return "test/test_insert";
    }
    @PostMapping(value = "data_insert")
    public String data_insert(@ModelAttribute TestDTO testdto) throws Exception {
        System.out.println(testdto.toString());
        testService.insertTest(testdto);
        return "redirect:test_insert";
    }

}
