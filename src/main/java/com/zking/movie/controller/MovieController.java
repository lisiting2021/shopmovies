package com.zking.movie.controller;

import com.zking.movie.model.Movie;
import com.zking.movie.service.IMovieServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/MovieController")
public class MovieController {

    @Autowired
    private IMovieServie iMovieServie;


    @RequestMapping("/list")
    @ResponseBody
    public List list(Movie movie){
    iMovieServie
    }
}
