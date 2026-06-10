package LibraryDAO;

import LibraryModel.Student;
import java.sql.Connection;
import LibraryUtil.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

    //:-------------------------------------------:Add Student:----------------------------------------------;
    public void addStudent(Student student){

        try{
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO student(name,email) VALUES(?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,student.getName());
            ps.setString(2,student.getEmail());
            ps.executeUpdate();
            System.out.println("Student Added Successfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    //:------------------------------------View Student:--------------------------------------------------;

    public void view(){
        try{
            Connection con = DBConnection.getConnection();

            String sql = "SELECT *FROM student";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.println(
                        rs.getInt("id")+ " " +
                                rs.getString("name") + " "+
                                rs.getString("email")
                );
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
