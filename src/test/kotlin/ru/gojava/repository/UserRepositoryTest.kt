package ru.gojava.repository

import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit4.SpringRunner
import ru.gojava.domain.User
import kotlin.test.assertEquals
import org.junit.Test as test

@RunWith(SpringRunner::class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserRepositoryTest {

    @Autowired
    lateinit var repository: UserRepository

    @test fun `insert User`() {
        repository.save(User(12, "2", "jon", "dow", 'm', 42))
    }

    @test fun `insert User then get`() {
        val user = User(42, "2", "jon", "dow", 'm', 42)
        repository.save(user)

        assertEquals(user, repository.findOne(42))
    }
}