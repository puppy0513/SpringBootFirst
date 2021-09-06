package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j      //로깅을 위한 @(annotation)
public class ArticleController {
    @Autowired          // Spring Boot가 미리 생성해놓은 객체를 가져다가 자동 연결!
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    // Post 방식으로 던졌기 때문에 PostMapping으로 받아야 한다.
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){            // 데이터를 받으려면 파라미터로 dto를 넣어줘야 한다.
        log.info(form.toString());
        // System.out.println(form.toString()); --> 이거를 Logging으로 대체해보자
        //1. dto를 Entity로 변환해야한다.
        Article article = form.toEntity();
        log.info(article.toString());


        //2. Repository 에게 Entity를 DB안에 저장하게 함.
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        return "";
    }


}
