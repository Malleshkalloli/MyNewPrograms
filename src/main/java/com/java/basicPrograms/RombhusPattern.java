package com.java.basicPrograms;

public class RombhusPattern {
    public static void main(String[] args) {
       int j,i;
       for(i=1;i<=5;i++){
           for(j=2;j<=i;j++){
               System.out.print(" ");
           }
           for(j=1;j<=5;j++){
               System.out.print("*"+" ");
           }
           System.out.println();
       }
    }
}
