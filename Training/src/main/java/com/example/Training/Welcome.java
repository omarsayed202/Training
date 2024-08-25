package com.example.Training;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Welcome {

    @RequestMapping("/")
    @ResponseBody
    public String welcome()
    {
        return "Welcome";
    }


}
