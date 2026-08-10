package com.microservices.course.udemy;

import java.time.LocalDate;

public record ErrorDetails(
        LocalDate timestamp,
        String message,
        String details
) {
}
