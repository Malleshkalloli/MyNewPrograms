package com.StringBasicPrograms;

import javax.swing.text.html.StyleSheet;
import java.util.Arrays;

public class RemovingDuplicateCharactersFromString {
    public static void main(String[] args) {
         String m1= "MalleshKallolih";
         char m1Array[]=m1.toCharArray();
         int index=0;
//         for(int i=0;i<m1.length();i++){
//        int j=0;
//             for(j=0;j<i;j++){
//                 if(m1Array[i]==m1Array[j]){
//                     break;
//                 }
//             }
//             if(i==j){
//                 m1Array[index++]=m1Array[i];
//             }
//         }
//         String m="";
//         for(int i=0;i<m1Array.length;i++){
//                  m=m+m1Array[i];
//         }
//        System.out.println(m);
//         System.out.println("string is "+String.valueOf(Arrays.copyOf(m1Array, index)));



        // Traversing character array
        for (int i = 0; i < m1.length(); i++)
        {

            // Check whether str[i] is present before or not
            int j;
            for (j = 0; j < i; j++)
            {
                if (m1Array[i] == m1Array[j])
                {
                    break;
                }
            }

            // If the character is not present before, add it to resulting string
            if (j == i)
            {
                m1Array[index++] = m1Array[i];
            }
        }
        String m="";
        for(int i=0;i< m1Array.length;i++){
            m=m+m1Array[i];
        }
        System.out.println("m1Array is "+m);
        System.out.println(String.valueOf(Arrays.copyOf(m1Array, index)));
    }
}
