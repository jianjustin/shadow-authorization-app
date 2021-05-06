package org.janine.jian.repository

import org.janine.jian.entity.UserRole
import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserRoleRepository: CrudRepository<UserRole, UUID> {
    
}