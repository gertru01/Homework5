package ru.gertru;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<Company> companies = new ArrayList<>();

        companies.add(new Company("Warner Bros. Entertainment", 1923, new ArrayList<Movie>()));
        companies.add(new Company("Marvel Studios", 1993, new ArrayList<Movie>()));
        companies.add(new Company("Paramount Pictures", 1912, new ArrayList<Movie>()));

        companies.get(0).getMovies().add(new Movie("Интерстеллар", 8, "Фантастика", "США, Великобритания, Канада", true));
        companies.get(0).getMovies().add(new Movie("Дюна: Часть вторая", 8, "Фантастика", "США, Канада, ОАЭ", false));
        companies.get(0).getMovies().add(new Movie("Престиж", 8, "Триллер", "Великобритания, США", false));

        companies.get(1).getMovies().add(new Movie("Стражи Галактики. Часть 3", 8, "Фантастика", "США, Новая Зеландия", false));
        companies.get(1).getMovies().add(new Movie("Мстители: Война бесконечности", 8, "Фантастика", "США", false));
        companies.get(1).getMovies().add(new Movie("Железный человек", 8, "Фантастика", "США, Канада", false));

        companies.get(2).getMovies().add(new Movie("Форрест Гамп", 9, "Драма", "США", true));
        companies.get(2).getMovies().add(new Movie("Крестный отец", 8, "Криминал", "США", true));
        companies.get(2).getMovies().add(new Movie("Остров проклятых", 8, "Триллер", "США", false));

        for (Company company : companies) {
            System.out.print(company.getName() + ": ");
            for (int i = 0; i < company.getMovies().size(); i++) {
                System.out.print("\"" + company.getMovies().get(i).getName() + "\"");
                if ((i + 1) == company.getMovies().size()) {
                    System.out.println();
                } else {
                    System.out.print(", ");
                }
            }
        }

    }
}
