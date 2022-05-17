package lab;

import lab.classes.Book; // Importing Book class from classes

public class Main {
    public static void main( String... args) {
        Book book1 = new Book();
        Book book2 = new Book(224, "Richard Dawkins", 980.95, "Science", "The Selfish Gene", 12);
        Book book3 = new Book(256, "Stephen Hawking", 378, "Science", "A Brief History of Time", 16);
        System.out.println(Book.getLibrary() + ":"); // Static method
        System.out.println("1. " + book1.toString());
        System.out.println("2. " + book2.toString()); // Java automatically calls method toString for objects book1, book2, book3
        System.out.println("3. " + book3.toString()); // So writing .toString() is not necessary
    }
}
