package dev.shiguretei.tenarai.spring.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TenaraiController {

	@GetMapping("/")
	public String home() {
		return "Spring Boot Tenarai";
	}

	@GetMapping("/tenarai")
	public String tenarai() {
		return "Hello Tenarai.";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s.", name);
	}

	@GetMapping("/hello2")
	public String hello2(@RequestParam(value = "word", defaultValue = "Hello") String word, @RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("%s %s.", word, name);
	}

}
