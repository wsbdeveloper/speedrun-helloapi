package demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}

@RestController
class MessageResource{
	@GetMapping
	fun index(): List<Message> = listOf(
		Message("1", "Hello!"),
		Message("1", "Bonjour!"),
		Message("1", "Privet!"),
	)
}

data class Message(@Id val id: String, val text: String)