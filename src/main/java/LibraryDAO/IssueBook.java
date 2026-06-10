package LibraryDAO;

import LibraryUtil.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class IssueBook {

    public void issueBook(int bookId,int StudentId){
        try{
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO issue_Book(book_id,student_id,issue_Date)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,bookId);
            ps.setInt(2,StudentId);
            ps.setDate(3,new java.sql.Date(new).getTime());
            ps.executeUpdate();

            System.out.println("Book Issue Successfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
