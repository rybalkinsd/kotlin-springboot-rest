package ru.gojava.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.gojava.domain.Location
import ru.gojava.repository.LocationRepository

@RestController
class LocationController(val repository: LocationRepository) {

    @GetMapping("/locations/{id}")
    fun locations(@PathVariable id: Int): ResponseEntity<Location> {
        val user = repository.findOne(id) ?: return ResponseEntity(HttpStatus.NOT_FOUND)
        return ResponseEntity(user, HttpStatus.OK)
    }

    @PostMapping("/locations/new")
    fun addLocation(@RequestBody location: Location): ResponseEntity<Any> {
        repository.save(location)
        return ResponseEntity(HttpStatus.OK)
    }

}