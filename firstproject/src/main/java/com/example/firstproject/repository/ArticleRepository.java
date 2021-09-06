package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

// CrudRepository<관리대상 Entity, Entity의 대표값의 타입>
public interface ArticleRepository extends CrudRepository<Article, Long> {

}
