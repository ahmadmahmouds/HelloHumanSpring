package com.hellohuman.java.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
    @RequestMapping("")
    public String getFirstLastName(@RequestParam(value="fname") String fname,@RequestParam(value="lname" ,required=false) String lname){
        if (lname!=null)
            return  "Hello " +fname +" "+ lname;
        return "Hello "+fname;
    }
}
