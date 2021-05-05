package org.janine.jian.entity

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity(name = "sys_role")
data class Role(
        @Column(name = "name") var name: String,
        @Column(name = "type") var type: Int? = 0,
        @Id @GeneratedValue(generator = "uuid") @GenericGenerator(name = "uuid", strategy = "uuid2") @Column(name = "id") var id: UUID? = null)