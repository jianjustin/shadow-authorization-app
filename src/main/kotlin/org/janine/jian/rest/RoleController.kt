package org.janine.jian.rest

import org.janine.jian.entity.Role
import org.janine.jian.repository.RoleRepository
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/role")
class RoleController(private val repository: RoleRepository) {

    @GetMapping("/")
    fun findAll(): List<Role>{
        return repository.findAll()?.toList();
    }

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: UUID): Role{
        return repository.findById(id)?.get();
    }

    @PostMapping("/", )
    fun save(@RequestBody role: Role): Role{
        return repository.save(role);
    }

    @PutMapping("/")
    fun update(@RequestBody role: Role): Role{
        return repository.save(role);
    }

    @DeleteMapping("/")
    fun delete(@PathVariable id: UUID): Role{
        var role = repository.findById(id);
        if(role.isPresent()) {
            repository.delete(role.get());
        }
        return role?.get();
    }
}