package com.challenges.codeWars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CodeWarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeWarsApplication.class, args);
    }

    public static String[] solution(String s) {
        String[] pairs;
        boolean isOdd = s.length() % 2 == 0;
        pairs = s.split("(?<=\\G..)");
        if (isOdd) {
            return pairs;
        }
        pairs[pairs.length - 1] += "_";
        return pairs;
    }
}
