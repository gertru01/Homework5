package ru.gertru;

import java.util.Objects;

public class Player {

    private int id;
    private String nickname;
    private boolean isOnline;


    public Player(int id, String nickname, boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && isOnline == player.isOnline && Objects.equals(nickname, player.nickname);
    }

    public int hashCode() {
        return Objects.hash(id, nickname, isOnline);
    }

    public String toString() {
        return "Player{" + "id=" + id + ", nickname='" + nickname + '\'' + ", isOnline=" + isOnline + '}';
    }
}
