package ru.academy.first.web.app.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.academy.first.web.app.model.entity.Post;
import ru.academy.first.web.app.service.PostService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/posts")
@Tag(name = "Посты", description = "Управляет публикациями пользователей")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    @Operation(summary = "Получить все посты", description = "Возвращает список всех постов")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Успешный ответ",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Post.class)
                    )
            )
    })
    public List<Post> getPosts() {
        return postService.getPosts();
    }

    @GetMapping("/{postId}")
    public Optional<Post> getPostById(@PathVariable Long postId) {
        return postService.getPostById(postId);
    }
}
