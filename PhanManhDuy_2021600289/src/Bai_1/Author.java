package Bai_1;

import java.util.Scanner;

public class Author {
    Scanner sc = new Scanner(System.in);
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}
