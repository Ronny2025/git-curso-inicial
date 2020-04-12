package day51.Polimophism;

public abstract class Book {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public abstract void displeyBookInfo();
    }

