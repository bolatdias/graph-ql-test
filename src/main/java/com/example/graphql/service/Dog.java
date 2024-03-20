package com.example.graphql.service;

public record Dog(String id, String name, String color, boolean barks) implements Pet {
}
