package com.daniilty.springdemo.springdemo;

import reactor.core.publisher.Flux;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
	
	@Bean
	CommandLineRunner init(ChapterRepository repository) {
		return args -> {
			Flux.just(
				new Chapter("Quick Start"),
				new Chapter("With Spring"))
				.flatMap(repository::save)
				.subscribe(System.out::println);
		};
	}
}
