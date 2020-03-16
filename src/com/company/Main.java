package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        char c = '*';
        System.out.println(c);
        char c1 = 51;
        System.out.println(c1);
        int i = 259;
        byte b = (byte) i;//потеря точности, из 259 получилось 3
        System.out.println(b);
    }

}
