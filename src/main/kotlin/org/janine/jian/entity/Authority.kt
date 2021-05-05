package org.janine.jian.entity

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity(name="sys_authority")
data class Authority(
        @Column(name = "role_id1") var roleId: Long,
        @Column(name = "resource_id") var resourceId: Long,
        @Id @GeneratedValue(generator = "uuid") @GenericGenerator(name = "uuid", strategy = "uuid2") @Column(name = "id") var id: UUID? = null)