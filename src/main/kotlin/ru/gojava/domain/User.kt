package ru.gojava.domain

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "\"user\"")
data class User (
        @Id val id: Int,
        val email: String,
        @JsonProperty("first_name") val firstName: String,
        @JsonProperty("last_name") val lastName: String,
        val gender: Char,
        @JsonProperty("birth_date") val birthDate: Long
)
