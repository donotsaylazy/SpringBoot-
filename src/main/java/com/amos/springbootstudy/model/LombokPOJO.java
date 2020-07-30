package com.amos.springbootstudy.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
public class LombokPOJO {


    private String name;
    private Integer age;
}
