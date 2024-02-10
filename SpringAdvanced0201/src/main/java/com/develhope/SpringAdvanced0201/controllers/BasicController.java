package com.develhope.SpringAdvanced0201.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class BasicController {

    @GetMapping("/devname")
    public @ResponseBody String myName() {
        return "Luca Di Grigoli";
    }

}
