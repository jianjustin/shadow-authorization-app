package org.janine.jian.rest

import org.janine.jian.entity.Authority
import org.janine.jian.entity.Resource
import org.janine.jian.repository.AuthorityRepository
import org.janine.jian.repository.ResourceRepository
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/authority")
class AuthorityController(private val repository: AuthorityRepository) {

    @GetMapping("/")
    fun findAll(): List<Authority>{
        return repository.findAll()?.toList();
    }

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: UUID): Authority{
        return repository.findById(id)?.get();
    }

    @PostMapping("/", )
    fun save(@RequestBody authority: Authority): Authority{
        return repository.save(authority);
    }

    @PutMapping("/")
    fun update(@RequestBody authority: Authority): Authority{
        return repository.save(authority);
    }

    @DeleteMapping("/")
    fun delete(@PathVariable id: UUID): Authority{
        var authority = repository.findById(id);
        if(authority.isPresent()) {
            repository.delete(authority.get());
        }
        return authority?.get();
    }
}