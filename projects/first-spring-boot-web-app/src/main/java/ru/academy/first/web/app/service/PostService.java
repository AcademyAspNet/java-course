package ru.academy.first.web.app.service;

import ru.academy.first.web.app.model.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> getPosts();
    Optional<Post> getPostById(long postId);
}
