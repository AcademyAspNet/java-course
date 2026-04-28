package ru.academy.first.web.app.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.academy.first.web.app.model.entity.Post;
import ru.academy.first.web.app.model.entity.User;
import ru.academy.first.web.app.model.request.CreateUserRequest;
import ru.academy.first.web.app.service.PostService;
import ru.academy.first.web.app.service.UserService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserById(@PathVariable long userId) {
        Optional<User> user = userService.getUserById(userId);

        return user.isPresent()
                ? ResponseEntity.ok(user)
                : ResponseEntity.notFound().build();
    }

    @GetMapping("/{userId}/posts")
    public List<Post> getUserPosts(@PathVariable long userId) {
        return postService.getPostsByUserId(userId);
    }

    @GetMapping("/find/{userNamePart}")
    public List<User> getUsersByName(@PathVariable String userNamePart) {
        return userService.getUsersWithName(userNamePart);
    }

//    @PostMapping
//    public ResponseEntity<?> createUser(@Valid @RequestBody CreateUserRequest createUserRequest) {
//        User user = new User(
//                123L,
//                createUserRequest.name(),
//                LocalDateTime.now()
//        );
//
//        return ResponseEntity.ok(user);
//    }
}
