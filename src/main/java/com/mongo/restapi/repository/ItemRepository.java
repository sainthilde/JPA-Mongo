package com.mongo.restapi.repository;

import com.mongo.restapi.models.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<GroceryItem, String> {

}
