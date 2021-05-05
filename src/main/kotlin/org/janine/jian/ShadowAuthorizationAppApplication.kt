package org.janine.jian

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShadowAuthorizationAppApplication

fun main(args: Array<String>) {
	runApplication<ShadowAuthorizationAppApplication>(*args)
}
