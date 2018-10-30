package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoPersonRepository extends MongoRepository<MongoPerson, String> {
}
