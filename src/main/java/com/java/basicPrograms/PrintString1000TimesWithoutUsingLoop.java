package com.java.basicPrograms;

public class PrintString1000TimesWithoutUsingLoop {

//    public static void printString(){
//        int n=10;
//        if(n>0) {
//            System.out.println("Mallesh");
//            n = n + 1;
//            printString();
//        }
//    }
//
    public static void main(String[] args) {
       String name= "Mallesh";
       String s="k";
       s=s.replaceAll("k","kkkkkkkkkk"); //10times
        s=s.replaceAll("k","kkkkkkkkkk");//10X10=100 times
        s=s.replaceAll("k","kkkkkkkkkk");//100X10=1000 times
        s=s.replaceAll("k",name+"\n");
        System.out.println(s);

    }

}
