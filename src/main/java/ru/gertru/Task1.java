package ru.gertru;


public class Task1 {

    public static void main(String[] args) {

        Player player1 = new Player(8, "Василий", true);
        Player player2 = new Player(8, "Василий", true);

        System.out.println(player1 == player2);
        System.out.println(player1.equals(player2));
    }
}
