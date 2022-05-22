package com.java8.features.lambda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LambdaCollection {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("P","Python");
        map.put("A","Apple");
        map.put("J","Java");
        map.put("P","Python");

        //Iterating map using the forEach loop with Map.entryset().
        for(Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //Iterating using keyset and values
        System.out.println(map.keySet());
        System.out.println(map.values());

        //Iterating map using iterator
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getKey());
        }

        //Iterating using lambda expression
        map.forEach((key,value)->System.out.println(key));

        System.out.println(map.get("A"));
    }
}
