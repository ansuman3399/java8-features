package com.java8.features.consumer;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<Movie> c1 = movie -> System.out.println("Movie is "+movie.name);
        Consumer<Movie> c2 = movie -> System.out.println(movie.name+" movie is "+movie.result);
        Consumer<Movie> c3 = movie -> System.out.println("Movie "+movie.name+ " information stored");
        c1.andThen(c2).andThen(c3).accept(new Movie("Team A","Super hit"));
    }
}
class Movie{
    String name;
    String result;

    public Movie(String name,String result) {
        this.name = name;
        this.result=result;
    }
}
