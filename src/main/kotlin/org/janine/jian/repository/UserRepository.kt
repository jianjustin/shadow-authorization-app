package org.janine.jian.repository

import org.janine.jian.entity.User
import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserRepository : CrudRepository<User, UUID> {
    fun findByLogin(login: String): User?
}