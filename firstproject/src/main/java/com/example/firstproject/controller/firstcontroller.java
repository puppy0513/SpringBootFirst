package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller    // Controller라고 선언
public class firstcontroller {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute( "username", "jun hyun");
        return "greetings";                // templates/greetings.mustache -> 브라우저로 전송
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","jun hyun");
        return "Goodbye";
    }


}
