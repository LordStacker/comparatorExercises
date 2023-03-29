package com.example.moviesortingproject;

import com.example.moviesortingproject.be.Movie;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HelloApplication {

    private static List<Movie> movies = new ArrayList<Movie>();

    public static void creationMovies(){
        Movie m1 = new Movie(1, "Scream", "Wes Craven", "Thriller", 1996, 7.4);
        Movie m2 = new Movie(2, "Scream II", "Wes Craven", "Thriller", 1997, 6.3);
        Movie m3 = new Movie(3, "Scream III", "Wes Craven", "Thriller", 2000, 5.9);
        Movie m4 = new Movie(4, "Scream IV", "Wes Craven", "Thriller", 2011, 6.4);
        Movie m5 = new Movie(5, "Scream V", "Matt Bettinelli-Olpin", "Thriller", 2022, 6.3);
        Movie m6 = new Movie(6, "Scream VI", "Matt Bettinelli-Olpin", "Thriller", 2023, 7.3);
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);
        movies.add(m5);
        movies.add(m6);

    }



    public static void start(){
        creationMovies();
        Collections.shuffle(movies);
        //Collections.sort(movies, new Movie.TitleComparator());
        Comparator<Movie> c = Collections.reverseOrder(new Movie.TitleComparator());
        Collections.sort(movies, c);
        System.out.println("\nSorted movies : \n" + movies);
    }

    public static void main(String[] args) {
        start();
    }
}