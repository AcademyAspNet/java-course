package ru.academy.first.web.app.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateUserRequest(
        @NotBlank(message = "Name cannot be null or empty")
        @Size(min = 3, max = 100, message = "Name length too short or too long")
        String name
) { }
