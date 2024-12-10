package com.ll.basic.domain.home.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shjung
 * @since 24. 12. 10.
 */
@Controller
public class HomeController {


    @GetMapping("/")
    @ResponseBody
    public String showMain(){
        return "안녕하세요";
    }
}
