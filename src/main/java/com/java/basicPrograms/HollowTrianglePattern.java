package com.java.basicPrograms;

public class HollowTrianglePattern {
    public static void main(String[] args) {
        for (int i=1;i<=6;i++){

            for(int j=6;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                if(k==1|| k==(2*i-1) || i==6){
                System.out.print("&");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
