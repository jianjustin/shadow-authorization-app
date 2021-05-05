package org.janine.jian.entity

import javax.persistence.*

@Entity(name = "sys_user")
data class User(
        @Column(name = "login") var login: String,
        @Column(name = "firstname") var firstname: String,
        @Column(name = "lastname") var lastname: String,
        @Column(name = "description") var description: String? = null,
        @Id @GeneratedValue @Column(name = "id") var id: Long? = null)