package com.daniilty.springdemo.springdemo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {
}
