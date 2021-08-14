package br.com.app.thisevent

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GerenciadorDeEventosApplication

fun main(args: Array<String>) {
	runApplication<GerenciadorDeEventosApplication>(*args)
}
