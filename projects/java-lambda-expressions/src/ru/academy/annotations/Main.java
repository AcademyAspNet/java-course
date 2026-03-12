package ru.academy.annotations;

@CodeAuthor(firstName = "Tom",
            asisstants = { "Bob", "Alex" })
public class Main {

    @CodeAuthor(firstName = "Tom",
                asisstants = { "Bob", "Alex" })
    static void main() {

    }
}
