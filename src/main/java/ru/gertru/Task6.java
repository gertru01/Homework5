package ru.gertru;

import java.util.*;

import static java.util.Map.*;

public class Task6 {

    public static void main(String[] args) {

        Map<Player, Integer> points = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            points.put(new Player((i + 1), ("Player " + String.valueOf(i + 1)), true), 0);
        }

        points.put(new Player(4, "Player 4", true), 10);
        points.put(new Player(7, "Player 7", true), 12);
        points.put(new Player(8, "Player 8", true), 11);
        points.put(new Player(9, "Player 9", true), 13);
        points.put(new Player(10, "Player 10", true), 5);

        //Создаю и сортирую список неповторяющихся значений points
        List<Integer> sortValue = new ArrayList<>(new HashSet<>(points.values()));
        sortValue.sort((a, b) -> b - a);

        //Нахожу игроков, занимающих первые 3 места (может быть более 3-х игроков, если значения повторяются)
        for (int i = 0; i < 3; i++) {
            System.out.println(String.valueOf(i + 1) + "-е место:");
            for (Entry<Player, Integer> entry : points.entrySet()) {
                if (Objects.equals(entry.getValue(), sortValue.get(i))) {
                    System.out.println(entry.getKey());

                }
            }
        }
        //Решил не использовать сортировку через потоки, т.к. не понял толком как именно это работает, и использовал подобный вариант

    }
}
