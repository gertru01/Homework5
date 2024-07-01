package ru.gertru;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>();

        todoList.add("Пресс качат");
        todoList.add("Бегит");
        todoList.add("Турник");
        todoList.add("Анжуманя");
        todoList.add("Пресс качат");

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println("Задача " + (i + 1) + ": " + todoList.get(i));
        }
    }
}
