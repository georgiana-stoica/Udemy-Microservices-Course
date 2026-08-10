package com.microservices.course.udemy;

public record PersonV2(Name name) {
    @Override
    public String toString() {
        return "PersonV2{" +
               "name=" + name +
               '}';
    }
}
