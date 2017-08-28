package ru.gojava.repository

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit4.SpringRunner
import ru.gojava.domain.Location
import kotlin.test.assertEquals

@RunWith(SpringRunner::class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class LocationRepositoryTest {

    @Autowired
    lateinit var repository: LocationRepository

    @Test
    fun `insert Location`() {
        repository.save(Location(42, "Tower", "London", "England", 100))
    }

    @Test
    fun `insert Location then get`() {
        val location = Location(88, "Tower", "London", "England", 100)
        repository.save(location)

        assertEquals(location, repository.findOne(88))
    }
}