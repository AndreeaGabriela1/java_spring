package com.launchlibrary.libraryspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("hello")
public class LibraryController
{
    @GetMapping
    public String index()
    {
        return "index";
    }
}
