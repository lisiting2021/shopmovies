package com.zking.movie.model;

import java.util.Date;

public class order {
    private Long orderId;

    private Long userId;

    private Long movieId;

    private String userName;

    private String movieName;

    private Double moviePrice;

    private Date time;

    public order(Long orderId, Long userId, Long movieId, String userName, String movieName, Double moviePrice, Date time) {
        this.orderId = orderId;
        this.userId = userId;
        this.movieId = movieId;
        this.userName = userName;
        this.movieName = movieName;
        this.moviePrice = moviePrice;
        this.time = time;
    }

    public order() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Double getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(Double moviePrice) {
        this.moviePrice = moviePrice;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}