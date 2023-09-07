package com.yasin.spring5jokesappv2.controllers;

import com.yasin.spring5jokesappv2.model.Joke;
import com.yasin.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }


    @RequestMapping("/")
    String getJokes(Model model) {

        String randomJoke = jokeService.getQuote();
        Joke j = new Joke();
        j.setJoke(randomJoke);
        model.addAttribute("joke", j);
        model.addAttribute("joke2", randomJoke);
        return "index";
    }
}
