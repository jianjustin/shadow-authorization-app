package org.janine.jian.repository

import org.janine.jian.entity.Role
import org.springframework.data.repository.CrudRepository
import java.util.*

interface RoleRepository: CrudRepository<Role, UUID> {

}