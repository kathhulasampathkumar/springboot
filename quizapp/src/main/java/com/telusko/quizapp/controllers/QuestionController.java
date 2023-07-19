package com.telusko.quizapp.controllers;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.quizapp.services.QuestionService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public String getAllQuestions(){
        // return QuestionService.getAllQuestions();
        return "<h1> Welcome to Spring Boot Framework.";

    }
    
}
