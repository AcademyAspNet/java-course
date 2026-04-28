package ru.academy.first.web.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.academy.first.web.app.model.entity.Post;
import ru.academy.first.web.app.model.entity.User;
import ru.academy.first.web.app.repository.UserRepository;
import ru.academy.first.web.app.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);

        return users;
    }

    @Override
    public Optional<User> getUserById(long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public List<User> getUsersWithName(String userNamePart) {
        return userRepository.findByNameContainingIgnoreCase(userNamePart);
    }
}
