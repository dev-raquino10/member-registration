package br.com.raquino.memberregistration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/member")
public class MemberController {

    @GetMapping
    public String getBook() {
        return "API test!";
    }

}
