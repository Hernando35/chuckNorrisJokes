package com.superman.assessment.norris.chuck.Controller;

import com.superman.assessment.norris.chuck.Services.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Jokes {
    //private ChuckNorrisQuotes chuckNorrisQuotes;
    private String joke;

    @RequestMapping(value = "/index")
    public String getRandomQuote(@RequestParam(name="joke", required=false, defaultValue="Jokes") String joke, Model model){
        model.addAttribute( "joke", joke );
        return "index";
    }
}
