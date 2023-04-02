package com.example.spring;

//Write a REST application that has 1 endpoint that returns the number but as a parameter + 1
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/greetings")
public class GreetingsController {
    @GetMapping(path = "/number/{nr}")
    public int number(@PathVariable int nr)
    {
        return nr+1;
    }
}
