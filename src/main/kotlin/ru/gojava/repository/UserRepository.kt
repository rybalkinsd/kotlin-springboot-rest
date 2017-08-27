package ru.gojava.repository

import org.springframework.data.repository.CrudRepository
import ru.gojava.domain.User

interface UserRepository : CrudRepository<User, Int>