package LibraryModel;

public class Book {
    private int id;
    private String name;
    private String author;
    private int  quantity;


    // Default Constructor;
    Book(){

    }


    // Parameterised Constructor;
    public Book(int id,String name,String author,int quantity){
               this.id = id;
               this.name = name;
               this.author = author;
               this.quantity = quantity;
    }

    // Getter and Setter;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }
}
