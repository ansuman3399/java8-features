package com.java8.features.predicate;

import java.util.function.Predicate;

public class RemoveEmptyAndNullList {
    public static void main(String[] args) {
        Predicate<String[]> predicate = collections -> {
            for(String s: collections){
                if(s.equals(null)||s.toLowerCase().trim().length()==0)
                    System.out.println("bad string");
                else
                    System.out.println("good string");
            }
            return false;
        };
        System.out.println(predicate.test(new String[]{" ","  ","abc","   sf"}));
    }
}
