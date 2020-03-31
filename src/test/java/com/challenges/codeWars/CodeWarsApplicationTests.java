package com.challenges.codeWars;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static com.challenges.codeWars.CodeWarsApplication.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodeWarsApplicationTests {

    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("[ab, cd, ef]", Arrays.toString(solution(s)));
        assertEquals("[He, ll, oW, or, ld]", Arrays.toString(solution(s1)));
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("[ab, cd, e_]", Arrays.toString(solution(s)));
        assertEquals("[Lo, ve, Pi, zz, a_]", Arrays.toString(solution(s1)));
    }
}
