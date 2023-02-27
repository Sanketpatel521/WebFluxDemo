package com.example.demo.repositry;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SqlItem;

@Repository
public interface SqlItemRepository extends ReactiveCrudRepository<SqlItem, String> {

}
