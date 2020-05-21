import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {
    private int price;
    public MyBook (String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + this.price);
    }
}
