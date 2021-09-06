package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity     // DB가 해당 객체를 인식가능하게 한다.
@AllArgsConstructor      // 모든 변수에 대한 생성자를 생성해주는 lombok 코드
@ToString   // 모든 변수에 대한 toString()을 만들어주는 annotation
public class Article {

    @Id         // primary key
    @GeneratedValue     // 자동으로 Primary key값 설정
    private  Long id;

    // DB에서 알아볼 수 있게 Column이라고 해준다.
    @Column
    private String title;

    @Column
    private String content;
}
