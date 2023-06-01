package com.StringBasicPrograms;

public class FindDuplicateNumberInArray {

    public static void main(String[] args) {
        int arr[] ={1,2,5,3,5,4,1,6,7};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }

        }
    }
}
