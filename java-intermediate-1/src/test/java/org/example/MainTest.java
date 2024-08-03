package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    public void test(){
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = "hello";

        System.out.println(str1 == str3); //false
        System.out.println(str2 == str3); //false
        System.out.println(str3 == str4); //true
    }
}