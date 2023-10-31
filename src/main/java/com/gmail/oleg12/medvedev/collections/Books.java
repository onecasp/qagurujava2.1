package com.gmail.oleg12.medvedev.collections;

import java.util.ArrayList;
import java.util.List;

public class Books {

    static List<String> books = new ArrayList<>();

    public static void addBook(String book) {
        books.add(book);
    }

    public static void removeBook(String book) {
        books.remove(book);
    }

    public static void searchBook(String book) {
        int i = 0;
        while (i < books.size()) {
            if (books.get(i).equals(book)) {
                System.out.println("The book " + books.get(i) + " has been found!");
                break;
            } else if (i == books.size()-1) {
                System.out.println("The book not found!");
            }
            i++;
        }
    }

}
