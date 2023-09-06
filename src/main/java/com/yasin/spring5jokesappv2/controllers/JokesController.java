package com.yasin.spring5jokesappv2.controllers;

import com.yasin.spring5jokesappv2.model.Joke;
import com.yasin.spring5jokesappv2.services.GenericService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final GenericService genericService;

    public JokesController(GenericService genericService) {
        this.genericService = genericService;
    }


    @RequestMapping("/")
    String getJokes(Model model) {

        String randomJoke = genericService.getQuote();
        Joke j = new Joke();
        j.setJoke(randomJoke);
        model.addAttribute("joke", j);
        model.addAttribute("joke2", randomJoke);
        return "index";
    }
}
