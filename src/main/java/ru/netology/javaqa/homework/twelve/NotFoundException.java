package ru.netology.javaqa.homework.twelve;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String s) {
        super(s);
    }

    public NotFoundException(int id) {
        super("Element with id: " + id + " not found");
    }
}