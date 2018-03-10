package com.mateoj.popularmoviesdemo;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by jose on 10/6/15.
 */
public interface MoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}
