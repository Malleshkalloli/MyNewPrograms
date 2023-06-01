package com.practice.PublicSapient;

public class RemovingRepeatedCharacters {
    public static void main(String[] args) {
//        char nonChar=' ';
        String s="Mallesh";
//        for(int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            for(int j=i+1;j<s.length();j++){
//                if(c==s.charAt(j)){
//                    break;
//                }else{
//                    nonChar=s.charAt(i);
//                }
//            }
//            System.out.println("nonChar is "+nonChar);
//        }
//
//    }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        System.out.println("val is "+result.toString());
    }
}
