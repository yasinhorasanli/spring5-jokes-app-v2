package com.yasin.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService implements GenericService {

    @Override
    public String getQuote() {

        ChuckNorrisQuotes cnQuotes = new ChuckNorrisQuotes();
        return cnQuotes.getRandomQuote();
    }
}
