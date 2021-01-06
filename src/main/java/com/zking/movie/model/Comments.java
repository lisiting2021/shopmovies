package com.zking.movie.model;

public class Comments {
    private Long commentsId;

    private Long userId;

    private String commentsContent;

    private Long give;

    private Long movieId;

    public Comments(Long commentsId, Long userId, String commentsContent, Long give, Long movieId) {
        this.commentsId = commentsId;
        this.userId = userId;
        this.commentsContent = commentsContent;
        this.give = give;
        this.movieId = movieId;
    }

    public Comments() {
        super();
    }

    public Long getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(Long commentsId) {
        this.commentsId = commentsId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCommentsContent() {
        return commentsContent;
    }

    public void setCommentsContent(String commentsContent) {
        this.commentsContent = commentsContent;
    }

    public Long getGive() {
        return give;
    }

    public void setGive(Long give) {
        this.give = give;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
}