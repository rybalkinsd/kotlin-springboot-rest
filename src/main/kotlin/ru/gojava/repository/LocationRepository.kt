package ru.gojava.repository

import org.springframework.data.repository.CrudRepository
import ru.gojava.domain.Location

interface LocationRepository : CrudRepository<Location, Int>