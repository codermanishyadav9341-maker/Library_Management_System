package LibraryModel;

import java.util.Date;
public class IssueBook {
    private int id;
    private int bookId;
    private int studentId;
    private Date issueDate;

    // default Constructor();
    public IssueBook(){

    }

    // Parameterised Constructor;
    public IssueBook(int id,int bookId,int studentId,Date issueDate){
        this.id = id;
        this.bookId = bookId;
        this.studentId = studentId;
        this.issueDate = issueDate;
    }

    // Getter and Setter method Used;
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setBookId(int bookId){
        this.bookId = bookId;
    }

    public int getBookId(){
        return bookId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setIssueDate(Date issueDate){
        this.issueDate = issueDate;
    }

    public Date getIssueDate(){
        return issueDate;
    }
}
