package ru.netelogy.api;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "444";
        post.patronymic = "Иванович";
        post.phone = "100";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 10;
        post.birthday.year = 1990;
    }
}


