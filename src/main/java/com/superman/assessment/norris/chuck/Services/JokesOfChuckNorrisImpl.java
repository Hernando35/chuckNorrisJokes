package com.superman.assessment.norris.chuck.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesOfChuckNorrisImpl implements JokesOfChuckNorris {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesOfChuckNorrisImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJokes(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
