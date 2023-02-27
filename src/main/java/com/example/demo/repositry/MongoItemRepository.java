package com.example.demo.repositry;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MongoItem;

@Repository
public interface MongoItemRepository extends ReactiveMongoRepository<MongoItem, String> {

}
