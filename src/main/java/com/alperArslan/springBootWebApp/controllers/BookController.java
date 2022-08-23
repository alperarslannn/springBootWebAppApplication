package com.alperArslan.springBootWebApp.controllers;

import com.alperArslan.springBootWebApp.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("booksInModel", bookRepository.findAll());

        //books/list indicates the directory
        return "books/list";
    }
}
