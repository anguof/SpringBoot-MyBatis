package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private int id;
    private String name;
    private String pwd;
}
