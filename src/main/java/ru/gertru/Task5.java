package ru.gertru;


import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        //В список добавляется 10 игроков с использованием метода addPlayer
        for (int i = 0; i < 10; i++) {
            Player player = new Player(i, String.valueOf(i), true);
            if (addPlayer(players, player)) {
                players.add(player);
            }
        }

        //Добавление в список дублирующего игрока
        if (addPlayer(players, new Player(1, "1", true))) {
            System.out.println("Новый игрок добавлен");
        } else {
            System.out.println("Данный игрок уже есть в списке");
        }

    }

    //Метод проверяет наличие в переданном списке значения, равного переданному
    public static boolean addPlayer(List<Player> players, Player newPlayer) {
        for (Player player : players) {
            if (newPlayer.equals(player)) {
                return false;
            }
        }
        return true;
    }
}
