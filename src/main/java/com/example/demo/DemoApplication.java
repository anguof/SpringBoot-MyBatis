package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        int [] arrays = {1, 2,3, 5,6};
        for (int array : arrays) {
            System.out.println(array);
        }
    }
}
