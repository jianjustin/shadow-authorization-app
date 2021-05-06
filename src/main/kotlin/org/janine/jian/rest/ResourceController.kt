package org.janine.jian.rest

import org.janine.jian.entity.Resource
import org.janine.jian.repository.ResourceRepository
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/resource")
class ResourceController(private val repository: ResourceRepository) {

    @GetMapping("/")
    fun findAll(): List<Resource>{
        return repository.findAll()?.toList();
    }

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: UUID): Resource{
        return repository.findById(id)?.get();
    }

    @PostMapping("/", )
    fun save(@RequestBody resource: Resource): Resource{
        return repository.save(resource);
    }

    @PutMapping("/")
    fun update(@RequestBody resource: Resource): Resource{
        return repository.save(resource);
    }

    @DeleteMapping("/")
    fun delete(@PathVariable id: UUID): Resource{
        var resource = repository.findById(id);
        if(resource.isPresent()) {
            repository.delete(resource.get());
        }
        return resource?.get();
    }
}