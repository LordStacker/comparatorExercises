package com.example.moviesortingproject.be;

import java.util.Comparator;

public class Movie implements Comparable<Movie> {

    private int id;

    private String title;

    private String director;

    private String genre;

    private int productionYear;

    private Double rating;

    public Movie(int id, String title, String director, String genre, int productionYear, double rating) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.productionYear = productionYear;
        this.rating = rating;
    }


    public String getTitle() {
        return title;
    }

    public Double getRating() {
        return rating;
    }

    public int getId() {
        return id;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return this.id + " ,title: " + this.title + " ,director: " + this.director + " ,genre: " + this.genre + " ,production year: " + this.productionYear + " ,rating: " + this.rating;
    }

    @Override
    public int compareTo(Movie m)
    {
        return this.getId() - (m.getId());
    }

    public static class RatingComparator implements Comparator<Movie> {

        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getRating().compareTo(o2.getRating());
        }
    }

    public static  class TitleComparator implements  Comparator<Movie>{


        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.title.compareTo(o2.title);
        }

        @Override
        public Comparator<Movie> reversed() {
            return Comparator.super.reversed();
        }
    }
}
