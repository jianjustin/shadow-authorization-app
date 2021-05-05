package org.janine.jian.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity(name = "sys_user_role")
data class UserRole(
        @Column(name = "user_id") var userId: Long,
        @Column(name = "role_id") var roleId: Long,
        @Id @GeneratedValue @Column(name = "id") var id: Long? = null)