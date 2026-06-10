package Library_Management_System;

public class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;


    // Default Constructor;
    public Book(){

    }

    // Parameterised Constructor;
    public Book(String name,String author,int quantity){
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    // getter

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getQuantity(){
        return quantity;
    }

}
