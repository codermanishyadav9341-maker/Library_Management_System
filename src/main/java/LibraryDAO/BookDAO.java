package LibraryDAO;

import LibraryModel.Book;
import LibraryUtil.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDAO {

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
}
