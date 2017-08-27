package ru.gojava.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping(value = "/{id}")
    fun helloSpringBoot(@PathVariable id: String): String {
        return "Hello SpringBoot $id"
    }
}