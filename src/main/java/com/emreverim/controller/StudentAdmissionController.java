package com.emreverim.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

    @RequestMapping(value="/admissionForm.html" , method= RequestMethod.GET)
    public ModelAndView getAdmissionForm(){

        ModelAndView mv = new ModelAndView("admissionForm");
        return mv;
    }

    @ModelAttribute
    public void addObjects(Model mymodel){

        mymodel.addAttribute("headerMessage","ogrencimiz COOK zekidir");
    }

    @RequestMapping(value="/submitAdmissionForm" , method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@ModelAttribute("mystudent") Student mystudent, BindingResult result){
        // @RequestParam("studentName") String name, @RequestParam("studentHobby") String hobby

        /*Student mystudent = new Student();
        mystudent.setName(name);
        mystudent.setHobby(hobby); */

        if(result.hasErrors()){
            ModelAndView mv = new ModelAndView("admissionForm");
            return mv;

        }

        ModelAndView mv = new ModelAndView("admissionSuccess");

        //mv.addObject("msg","submitted data are "+name+" and hobby is "+hobby);
       // mv.addObject("headerMessage","ogrencimiz cok caliskandir");
       // mv.addObject("ogrencimiz",mystudent);
        return mv;
    }
}
