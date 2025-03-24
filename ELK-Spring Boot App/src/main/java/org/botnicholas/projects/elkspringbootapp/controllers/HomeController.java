package org.botnicholas.projects.elkspringbootapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@Slf4j
public class HomeController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/hello-info")
    public String helloInfo(@RequestParam(value = "userName", defaultValue = "User") String userName) {
        log.info("Application {} says hello to {}", appName,  userName);
        return "Hello " + userName;
    }

    @GetMapping("/hello-warn")
    public String helloWarn(@RequestParam(value = "userName", defaultValue = "User") String userName) {
        log.warn("Application {} says hello to {}", appName,  userName);
        return "Hello " + userName;
    }

    @GetMapping("/hello-error")
    public String helloError(@RequestParam(value = "userName", defaultValue = "User") String userName) {
        log.error("Application {} says hello to {}", appName,  userName);
        return "Hello " + userName;
    }
}
