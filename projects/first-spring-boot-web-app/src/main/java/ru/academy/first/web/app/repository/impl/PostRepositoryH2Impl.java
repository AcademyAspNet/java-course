package ru.academy.first.web.app.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.academy.first.web.app.model.entity.Post;
import ru.academy.first.web.app.repository.PostRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class PostRepositoryH2Impl implements PostRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final RowMapper<Post> postRowMapper = (rs, rowNum) ->
            new Post(
                rs.getLong("id"),
                rs.getString("text")
            );

    @Override
    public List<Post> findAll() {
        String sql = "SELECT id, text FROM posts ORDER BY id";
        return jdbcTemplate.query(sql, postRowMapper);
    }

    @Override
    public Optional<Post> findById(long id) {
        String sql = "SELECT id, text FROM posts WHERE id = ?";
        List<Post> posts = jdbcTemplate.query(sql, postRowMapper, id);

        return posts.isEmpty() ? Optional.empty() : Optional.of(posts.getFirst());
    }
}
