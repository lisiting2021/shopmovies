package com.zking.movie.model;

import java.util.Date;

public class Session {
    private Long sessionId;

    private Long cinemaId;

    private Long movieId;

    private Long moviehallId;

    private Double money;

    private Date sessionTime;

    public Session(Long sessionId, Long cinemaId, Long movieId, Long moviehallId, Double money, Date sessionTime) {
        this.sessionId = sessionId;
        this.cinemaId = cinemaId;
        this.movieId = movieId;
        this.moviehallId = moviehallId;
        this.money = money;
        this.sessionTime = sessionTime;
    }

    public Session() {
        super();
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
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

    public Long getMoviehallId() {
        return moviehallId;
    }

    public void setMoviehallId(Long moviehallId) {
        this.moviehallId = moviehallId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(Date sessionTime) {
        this.sessionTime = sessionTime;
    }
}