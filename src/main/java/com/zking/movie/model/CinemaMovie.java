package com.zking.movie.model;

public class CinemaMovie {
    private Long cinemaMovieId;

    private Long cinemaId;

    private Long movieId;

    public CinemaMovie(Long cinemaMovieId, Long cinemaId, Long movieId) {
        this.cinemaMovieId = cinemaMovieId;
        this.cinemaId = cinemaId;
        this.movieId = movieId;
    }

    public CinemaMovie() {
        super();
    }

    public Long getCinemaMovieId() {
        return cinemaMovieId;
    }

    public void setCinemaMovieId(Long cinemaMovieId) {
        this.cinemaMovieId = cinemaMovieId;
    }

    public Long getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Long cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
}