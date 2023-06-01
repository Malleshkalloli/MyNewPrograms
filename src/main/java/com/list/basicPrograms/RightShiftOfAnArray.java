package com.list.basicPrograms;

import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.util.ArrayList;
import java.util.List;

public class RightShiftOfAnArray {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
System.out.print("Hi "+list.size());
        for(int i=1;i<=4;i++){

            int temp = list.get(5);

            // traverse the list and move elements to right
            for (int j = 5; j > 0; j--) {
                list.set(j, list.get(j - 1));
            }
            list.set(0, temp);
        }
        System.out.print("elemets "+list);
    }
}
