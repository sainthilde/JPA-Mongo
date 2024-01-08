package com.mongo.restapi.controllers;

import com.mongo.restapi.models.GroceryItem;
import com.mongo.restapi.repository.ItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/mongo")
public class SampleController {

    private final ItemRepository itemRepository;

    public SampleController(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @GetMapping("/message/{message}")
    public List<GroceryItem> getMessage(@PathVariable String message){
        System.out.println("I'm here !!!!!!!!!!!");

        return itemRepository.findAll();
    }

    @PostMapping("/process")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void processMongo(@RequestBody GroceryItem groceryItem) {


        itemRepository.save(groceryItem);
    }

}
