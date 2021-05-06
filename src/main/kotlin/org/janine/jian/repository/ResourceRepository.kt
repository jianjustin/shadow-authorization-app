package org.janine.jian.repository

import org.janine.jian.entity.Resource
import org.springframework.data.repository.CrudRepository
import java.util.*

interface ResourceRepository: CrudRepository<Resource, UUID> {

}