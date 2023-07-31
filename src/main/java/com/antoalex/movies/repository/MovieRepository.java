package com.antoalex.movies.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.antoalex.movies.model.Movie;


public interface MovieRepository extends MongoRepository<Movie, ObjectId>{

    Optional<Movie> findByImdbId(String imdbId);
    
}
