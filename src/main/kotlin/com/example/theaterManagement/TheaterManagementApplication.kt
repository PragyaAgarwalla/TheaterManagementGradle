package com.example.theaterManagement

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
//@ComponentScan(basePackages = ["com.example"])
class TheaterManagementApplication

fun main(args: Array<String>) {
	runApplication<TheaterManagementApplication>(*args)
}
