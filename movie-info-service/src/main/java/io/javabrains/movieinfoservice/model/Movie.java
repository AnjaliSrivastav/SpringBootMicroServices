package io.javabrains.movieinfoservice.model;

public class Movie {
    private String movieId;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
