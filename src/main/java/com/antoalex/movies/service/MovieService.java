package com.antoalex.movies.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antoalex.movies.model.Movie;
import com.antoalex.movies.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> findMovieById(ObjectId id){
        return movieRepository.findById(id);
    }

    public Optional<Movie> getMovie(String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }
}
