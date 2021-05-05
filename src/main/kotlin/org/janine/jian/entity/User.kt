package org.janine.jian.entity

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity(name = "sys_user")
data class User(
        @Column(name = "login") var login: String,
        @Column(name = "firstname") var firstname: String,
        @Column(name = "lastname") var lastname: String,
        @Column(name = "description") var description: String? = null,
        @Id @GeneratedValue(generator = "uuid") @GenericGenerator(name = "uuid", strategy = "uuid2") @Column(name = "id") var id: UUID? = null)