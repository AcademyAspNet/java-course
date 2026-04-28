package ru.academy.first.web.app.service;

import ru.academy.first.web.app.model.entity.Post;
import ru.academy.first.web.app.model.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getUsers();
    Optional<User> getUserById(long userId);
    List<User> getUsersWithName(String userNamePart);
}
