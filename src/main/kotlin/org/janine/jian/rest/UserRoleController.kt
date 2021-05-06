package org.janine.jian.rest

import org.janine.jian.entity.Authority
import org.janine.jian.entity.Resource
import org.janine.jian.entity.UserRole
import org.janine.jian.repository.AuthorityRepository
import org.janine.jian.repository.ResourceRepository
import org.janine.jian.repository.UserRoleRepository
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/userrole")
class UserRoleController(private val repository: UserRoleRepository) {

    @GetMapping("/")
    fun findAll(): List<UserRole>{
        return repository.findAll()?.toList();
    }

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: UUID): UserRole{
        return repository.findById(id)?.get();
    }

    @PostMapping("/", )
    fun save(@RequestBody userRole: UserRole): UserRole{
        return repository.save(userRole);
    }

    @PutMapping("/")
    fun update(@RequestBody userRole: UserRole): UserRole{
        return repository.save(userRole);
    }

    @DeleteMapping("/")
    fun delete(@PathVariable id: UUID): UserRole{
        var userRole = repository.findById(id);
        if(userRole.isPresent()) {
            repository.delete(userRole.get());
        }
        return userRole?.get();
    }
}