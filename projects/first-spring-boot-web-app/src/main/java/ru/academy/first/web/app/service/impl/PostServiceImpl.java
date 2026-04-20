package ru.academy.first.web.app.service.impl;

import org.springframework.stereotype.Service;
import ru.academy.first.web.app.model.entity.Post;
import ru.academy.first.web.app.service.PostService;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Override
    public List<Post> getPosts() {
        Post firstPost = new Post();
        firstPost.setId(0);
        firstPost.setText("Hello, world!");

        Post secondPost = new Post();
        secondPost.setId(1);
        secondPost.setText("Привет, мир!");

        Post thirdPost = new Post();
        thirdPost.setId(2);
        thirdPost.setText("Привет!");

        return List.of(
                firstPost,
                secondPost,
                thirdPost
        );
    }
}
