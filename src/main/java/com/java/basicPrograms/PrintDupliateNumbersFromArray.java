package com.java.basicPrograms;

public class PrintDupliateNumbersFromArray
{
    public static void main(String[] args) {
        int a1[]={5,4,3,2,1,8};  //asked In bottomline technology
        int a2[]={4,3,1,7,9,0};
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    System.out.println(a1[i]);
                }
            }
        }
    }
}
