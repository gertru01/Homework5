package ru.gertru;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        List<Movie> films = new ArrayList<>();

        films.add(new Movie("Побег из Шоушенка", 9, "Драма", "США", false));
        films.add(new Movie("Крёстный отец", 8, "Криминал", "США", true));
        films.add(new Movie("Тёмный рыцарь", 8, "Фантастика", "США, Великобритания", true));

        System.out.println(films.get(1).toString());
    }
}
