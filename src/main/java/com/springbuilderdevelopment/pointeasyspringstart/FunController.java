package com.springbuilderdevelopment.pointeasyspringstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

    @RequestMapping
    public String showing(){
        return "pass" ;

    }


}
