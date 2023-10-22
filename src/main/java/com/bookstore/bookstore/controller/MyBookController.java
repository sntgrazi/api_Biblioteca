package com.bookstore.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.bookstore.service.MyBookService;

@Controller
public class MyBookController {
    
    @Autowired
    private MyBookService service;

    @RequestMapping("/delete/{id}")
    public String deleteMyList(@PathVariable("id") int id){
        service.deleteById(id);
        return "redirect:/my_books";
    }

}
