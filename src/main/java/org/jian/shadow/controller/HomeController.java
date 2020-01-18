package org.jian.shadow.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    @PreAuthorize("hasAnyRole(ROLE_USER,ROLE_ADMIN)")
    public String index(){
        return "a authorization server based springboot ,springsecurity and oauth2.0";
    }
}
