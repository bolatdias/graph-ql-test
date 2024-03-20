package com.example.graphql.controller;


import com.example.graphql.service.Cat;
import com.example.graphql.service.Dog;
import com.example.graphql.service.Human;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class PetsController {

    @QueryMapping
    List<Object> creatures() {
        return List.of(
                new Dog("0", "Barni", "whit", true),
                new Cat("1", "Garry", "orange", false),
                new Human("Dias")
        );
    }
}
