package com.zking.movie.model;

public class moviehall {
    private Long moviehallId;

    private String moviehallName;

    private String dictName;

    public moviehall(Long moviehallId, String moviehallName, String dictName) {
        this.moviehallId = moviehallId;
        this.moviehallName = moviehallName;
        this.dictName = dictName;
    }

    public moviehall() {
        super();
    }

    public Long getMoviehallId() {
        return moviehallId;
    }

    public void setMoviehallId(Long moviehallId) {
        this.moviehallId = moviehallId;
    }

    public String getMoviehallName() {
        return moviehallName;
    }

    public void setMoviehallName(String moviehallName) {
        this.moviehallName = moviehallName;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }
}