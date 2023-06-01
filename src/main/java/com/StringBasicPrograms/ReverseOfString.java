package com.StringBasicPrograms;

public class ReverseOfString {
    public static void main(String[] args) {
        String m1="MalleshKalloli";
        String reverseString="";

        for(int i=m1.length()-1;i>=0;i--){
            reverseString=reverseString+m1.charAt(i);
        }

        System.out.println("revverse String is "+reverseString);
    }
}
