package com.practice.streams;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> n1 =new ArrayList<String>();
        n1.add("mallesh");
        n1.add("kalloli");
        n1.add("priya");
        n1.add("Divya");
        n1.add("Kar");
        n1.add("mallu");

       long count =n1.stream().filter(s->s.startsWith("m")).count();
       System.out.println("Hi Count "+count);

       n1.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

       n1.stream().filter(s->s.endsWith("a")).map(n3->n3.toUpperCase()).forEach(b->System.out.println(b));
       n1.stream().filter(s->s.startsWith("m")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

       List<String> names1= Arrays.asList("Kallya","Mallya","Sangya","balya");
       Stream<String> concatedStream=Stream.concat(n1.stream(),names1.stream());

       boolean flag=concatedStream.anyMatch(s->s.equalsIgnoreCase("kallya"));
       System.out.println("Flag 1"+flag);
        Assert.assertTrue(flag);

        List<Integer> ilist=Arrays.asList(2,2,4,5,6,2,4,8,7,4,3,9,10);
        ilist.stream().distinct().forEach(s->System.out.println(s));

    }
}
