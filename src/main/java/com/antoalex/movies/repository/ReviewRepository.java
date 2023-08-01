package com.antoalex.movies.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.antoalex.movies.model.Review;

public interface ReviewRepository extends MongoRepository<Review, ObjectId>{
    
}
