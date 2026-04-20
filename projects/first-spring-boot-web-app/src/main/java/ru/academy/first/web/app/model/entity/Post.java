package ru.academy.first.web.app.model.entity;

import java.util.Objects;

public class Post {

    private int id;
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Post post)) return false;

        return id == post.id && Objects.equals(text, post.text);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(text);
        return result;
    }

    @Override
    public String toString() {
        return "Post [" +
                "id=" + id +
                ", text='" + text + '\'' +
                ']';
    }
}
