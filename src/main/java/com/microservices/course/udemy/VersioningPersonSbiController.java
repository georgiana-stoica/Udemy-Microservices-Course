package com.microservices.course.udemy;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("dev")
@RestController
public class VersioningPersonSbiController {

    @GetMapping(value = "/{version}/personsbi", version = "1.0.0")
    public PersonV1 getFirstVersionOfPerson() {
        return new PersonV1("Stoica Georgiana");
    }

    @GetMapping("/v2/personsbi")
    public PersonV2 getSecondVersionOfPerson() {
        return new PersonV2(new Name("Stoica", "Georgiana"));
    }

    @GetMapping(path = "/personsbi", params = "version=1")
    public PersonV1 getFirstVersionOfPersonRequestParam() {
        return new PersonV1("Stoica Georgiana");
    }

    @GetMapping(path = "/personsbi", params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequestParam() {
        return new PersonV2(new Name("Stoica", "Georgiana"));
    }

    @GetMapping(path = "/personsbi/header", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader() {
        return new PersonV1("Stoica Georgiana");
    }

    @GetMapping(path = "/personsbi/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonRequestHeader() {
        return new PersonV2(new Name("Stoica", "Georgiana"));
    }

}
