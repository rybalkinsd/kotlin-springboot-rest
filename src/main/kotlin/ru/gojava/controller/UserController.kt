package ru.gojava.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.gojava.domain.User
import ru.gojava.repository.UserRepository

@RestController
class UserController(val repository: UserRepository) {

    @GetMapping("/users/{id}")
    fun users(@PathVariable id: Int): ResponseEntity<User> {
        val user = repository.findOne(id) ?: return ResponseEntity(HttpStatus.NOT_FOUND)
        return ResponseEntity(user, HttpStatus.OK)
    }

    @PostMapping("/users/new")
    fun addUser(@RequestBody user: User): ResponseEntity<User> {
        repository.save(user)
        return ResponseEntity(HttpStatus.OK)
    }

}