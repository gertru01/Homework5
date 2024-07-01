package ru.gertru;

import java.util.List;
import java.util.Objects;

public class Company {

    private String name;
    private int year;
    private List<Movie> movies;

    public Company(String name, int year, List<Movie> movies) {
        this.name = name;
        this.year = year;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return year == company.year && Objects.equals(name, company.name) && Objects.equals(movies, company.movies);
    }

    public int hashCode() {
        return Objects.hash(name, year, movies);
    }

    @Override
    public String toString() {
        return "Company{" + "name='" + name + '\'' + ", year=" + year + ", movies=" + movies + '}';
    }
}
