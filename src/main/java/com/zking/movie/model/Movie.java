package com.zking.movie.model;

import java.util.Date;

public class Movie {
    private Long movieId;

    private String movieName;

    private String movieEnglish;

    private String movieDirector;

    private String movieActor;

    private String movieReview;

    private String movieLength;

    private Double moviePrice;

    private Integer movieState;

    private Long movieType;

    private Double movieRating;

    private String movieCountry;

    private Long evaluate;

    private Long views;

    private Date movieTime;

    public Movie(Long movieId, String movieName, String movieEnglish, String movieDirector, String movieActor, String movieReview, String movieLength, Double moviePrice, Integer movieState, Long movieType, Double movieRating, String movieCountry, Long evaluate, Long views, Date movieTime) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieEnglish = movieEnglish;
        this.movieDirector = movieDirector;
        this.movieActor = movieActor;
        this.movieReview = movieReview;
        this.movieLength = movieLength;
        this.moviePrice = moviePrice;
        this.movieState = movieState;
        this.movieType = movieType;
        this.movieRating = movieRating;
        this.movieCountry = movieCountry;
        this.evaluate = evaluate;
        this.views = views;
        this.movieTime = movieTime;
    }

    public Movie() {
        super();
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieEnglish() {
        return movieEnglish;
    }

    public void setMovieEnglish(String movieEnglish) {
        this.movieEnglish = movieEnglish;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieActor() {
        return movieActor;
    }

    public void setMovieActor(String movieActor) {
        this.movieActor = movieActor;
    }

    public String getMovieReview() {
        return movieReview;
    }

    public void setMovieReview(String movieReview) {
        this.movieReview = movieReview;
    }

    public String getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(String movieLength) {
        this.movieLength = movieLength;
    }

    public Double getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(Double moviePrice) {
        this.moviePrice = moviePrice;
    }

    public Integer getMovieState() {
        return movieState;
    }

    public void setMovieState(Integer movieState) {
        this.movieState = movieState;
    }

    public Long getMovieType() {
        return movieType;
    }

    public void setMovieType(Long movieType) {
        this.movieType = movieType;
    }

    public Double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(Double movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieCountry() {
        return movieCountry;
    }

    public void setMovieCountry(String movieCountry) {
        this.movieCountry = movieCountry;
    }

    public Long getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(Long evaluate) {
        this.evaluate = evaluate;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Date getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(Date movieTime) {
        this.movieTime = movieTime;
    }
}