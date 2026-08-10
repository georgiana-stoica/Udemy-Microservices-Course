package com.microservices.course.udemy;

public record PersonV1(String name) {
    @Override
    public String toString() {
        return "PersonV1{" +
               "name='" + name + '\'' +
               '}';
    }
}
