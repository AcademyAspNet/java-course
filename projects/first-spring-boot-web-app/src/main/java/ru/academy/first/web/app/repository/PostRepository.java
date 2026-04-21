package ru.academy.first.web.app.repository;

import ru.academy.first.web.app.model.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {

    List<Post> findAll();
    Optional<Post> findById(long id);
}
