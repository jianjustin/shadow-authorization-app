package org.janine.jian.rest

import org.janine.jian.entity.User
import org.janine.jian.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.util.*

@RestController
@RequestMapping("/api/user")
class UserController(private val repository: UserRepository) {

    @GetMapping("/")
    fun findAll(): List<User>{
        return repository.findAll()?.toList();
    }

    @GetMapping("/{login}")
    fun findOne(@PathVariable login: String): User{
        return repository.findByLogin(login) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "This user does not exist");
    }

    @PostMapping("/", )
    fun save(@RequestBody user: User): User{
        return repository.save(user);
    }
}