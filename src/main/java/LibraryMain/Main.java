package LibraryMain;

import LibraryDAO.BookDAO;
import LibraryDAO.IssueBookDAO;
import LibraryDAO.StudentDAO;
import LibraryModel.Book;
import LibraryModel.Student;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        BookDAO bookDAO = new BookDAO();
        StudentDAO studentDAO = new StudentDAO();
        IssueBookDAO issueBookDAO = new IssueBookDAO();

        while(true){
            System.out.println(":-------------------Library Management System:---------------------------");
            System.out.println("1.Add Book");
            System.out.println("2.View Book");
            System.out.println("3.Add Student");
            System.out.println("4.View Student");
            System.out.println("5.Issue Book");
            System.out.println("6.Exit");

            System.out.print("Enter Choice:- ");
            int choice = scan.nextInt();

            switch(choice){

                case 1:
                    scan.nextLine();
                    System.out.print("Book Name:- ");
                    String book_name = scan.nextLine();

                    System.out.print("Author Name:- ");
                    String authorName = scan.nextLine();

                    System.out.print("Enter Quantity:- ");
                    int qty = scan.nextInt();

                    bookDAO.addBook(new Book(0,book_name,authorName,qty));
                    break;


                case 2:
                    bookDAO.viewBook();
                    break;

                case 3:
                    scan.nextLine();
                    System.out.print("Student name:- ");
                    String name_S = scan.nextLine();

                    System.out.print("Student email:- ");
                    String email_S = scan.nextLine();

                    studentDAO.addStudent(new Student(0,name_S,email_S));
                    break;

                case 4:
                    studentDAO.viewStudent();
                    break;

                case 5:
                    scan.nextLine();
                    System.out.print("Enter BookID:- ");
                    int bookId_S = scan.nextInt();

                    System.out.print("Enter StudentID:- ");
                    int studentId_s = scan.nextInt();

                    issueBookDAO.issueBook(bookId_S,studentId_s);
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }
    }

}
