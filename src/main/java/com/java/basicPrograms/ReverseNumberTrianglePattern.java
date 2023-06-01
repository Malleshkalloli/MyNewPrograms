package com.java.basicPrograms;

public class ReverseNumberTrianglePattern {
    public static void main(String[] args) {
        for (int i=1;i<=6;i++){
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=6;k++){
                System.out.print(k+" ");

            }
            System.out.println();
        }
    }
}
