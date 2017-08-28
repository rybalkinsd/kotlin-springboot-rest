package ru.gojava.domain

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "location")
data class Location(
        @Id val id: Int,
        val place: String,
        val country: String,
        val city: String,
        val distance: Int
)
