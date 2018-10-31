package com.informaticsdeveloper.mymovieapp;

import com.informaticsdeveloper.mymovieapp.Model.Movie;

import retrofit.Callback;
import retrofit.http.GET;

public interface MovieApiService {
    @GET("/movie/popular")
    void getPopularMovie(Callback<Movie.MovieResult> cb);
}
