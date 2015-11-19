package com.emreverim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    String message  = "that's you";
    String message2 = "hohoho";
    @RequestMapping("/hello/hiya/{username}")
    public ModelAndView showMessage(@PathVariable("username") String username,
            @RequestParam(value = "name", required = false, defaultValue = "World") String name,
           @RequestParam(value = "surname") String surname)

    {

        System.out.println("in controller");
        ModelAndView mv = new ModelAndView("helloworld");
        //mv.addObject("message",message2);
        mv.addObject("message",message );
        mv.addObject("name",username);
        //mv.addObject("surname",surname);


        return mv;

    }

}
