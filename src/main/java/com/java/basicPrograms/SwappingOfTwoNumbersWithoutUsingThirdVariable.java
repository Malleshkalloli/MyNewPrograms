package com.java.basicPrograms;

public class SwappingOfTwoNumbersWithoutUsingThirdVariable {

    public static void main(String[] args) {
        int a=83;
        int b=91;

        a=a+b;
        b=a-b;
        System.out.println(b);
        a=a-b;
        System.out.println(a);   //asked in bottomline technology
    }
}
