package ru.academy.first.web.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.academy.first.web.app.model.entity.Post;
import ru.academy.first.web.app.model.entity.User;
import ru.academy.first.web.app.repository.PostRepository;
import ru.academy.first.web.app.repository.UserRepository;
import ru.academy.first.web.app.service.PostService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Post> getPosts() {
        List<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(posts::add);

        return posts;
    }

    @Override
    public Optional<Post> getPostById(long postId) {
        return postRepository.findById(postId);
    }

    @Override
    public List<Post> getPostsByUserId(long userId) {
        Optional<User> user = userRepository.findById(userId);

        if (user.isEmpty())
            return new ArrayList<>();

        return new ArrayList<>(user.get().getPosts());
    }
}
