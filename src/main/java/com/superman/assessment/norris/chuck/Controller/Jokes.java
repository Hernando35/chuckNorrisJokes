package com.superman.assessment.norris.chuck.Controller;

import com.superman.assessment.norris.chuck.Services.JokesOfChuckNorris;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Jokes {
    private JokesOfChuckNorris jokesOfChuckNorris;

    public Jokes(JokesOfChuckNorris jokesOfChuckNorris){
        this.jokesOfChuckNorris = jokesOfChuckNorris;
    }

    @RequestMapping({"/", ""})
    public String getRandomQuote(Model model){
        model.addAttribute( "joke", jokesOfChuckNorris.getJokes());
        return "index";
    }
}
