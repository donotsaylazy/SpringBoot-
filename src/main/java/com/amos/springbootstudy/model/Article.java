package com.amos.springbootstudy.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Article {

    private long id;
    private String author;
    private String content;
    private Date creatTime;
    private String title;

}
