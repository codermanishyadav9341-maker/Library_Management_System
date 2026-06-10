package LibraryDAO;

import LibraryModel.Book;
import LibraryUtil.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookDAO {
    //:-----------------------------------------Add Book:-----------------------------------------------:
    public void addBook(Book book){
        try{
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO book(name,author,quantity) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,book.getName());
            ps.setString(2,book.getAuthor());
            ps.setInt(3,book.getQuantity());
            ps.executeUpdate();

            System.out.println("Book Added Successfully");
        }
         catch(Exception e){
            e.printStackTrace();
         }
    }


    //:-------------------------------------------:View Book:---------------------------------------------:

    public void viewBook(){

        try{
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM book";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " " +
                                rs.getString("author") + " " +
                                rs.getInt("quantity")
                );
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


}
