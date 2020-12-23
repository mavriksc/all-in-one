package org.mavriksc.allinone

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AllInOneApplication

fun main(args: Array<String>) {
    runApplication<AllInOneApplication>(*args)
}
