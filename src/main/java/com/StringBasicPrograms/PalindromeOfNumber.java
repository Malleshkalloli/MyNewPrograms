package com.StringBasicPrograms;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        int n=454;
        int r=0;
        int sum=0;
       int temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
         if(temp==sum){
             System.out.println(temp+" is palindrome");
         }else{
             System.out.println(temp+" is not palindrome");
         }
    }
}
