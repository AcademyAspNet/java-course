package ru.academy.first.web.app.repository;

import org.springframework.data.repository.CrudRepository;
import ru.academy.first.web.app.model.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
