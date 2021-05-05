package org.janine.jian.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity(name = "sys_resource")
data class Resource(
        @Column(name = "name") var name: String,
        @Column(name = "value") var value: String,
        @Column(name = "path") var path: String,
        @Column(name = "type") var type: Int? = 0,
        @Id @GeneratedValue @Column(name = "id") var id: Long? = null)