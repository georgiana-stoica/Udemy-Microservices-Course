package com.microservices.course.udemy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record SomeBean(
        String field1,
        @JsonIgnore
        String field2,
        String field3
) {
}
