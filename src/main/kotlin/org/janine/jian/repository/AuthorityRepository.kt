package org.janine.jian.repository

import org.janine.jian.entity.Authority
import org.springframework.data.repository.CrudRepository
import java.util.*

interface AuthorityRepository: CrudRepository<Authority, UUID> {

}