package com.company;

public class Main {

    public static void main(String[] args) {
        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Fast and Furious");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");

        anotherMovie.setTitle("Titanic");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());
    }
}
