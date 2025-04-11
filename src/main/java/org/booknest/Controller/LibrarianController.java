package org.booknest.Controller;

import org.booknest.Model.Books;
import org.booknest.Model.LibrarianInfo;

import java.util.Scanner;

public class LibrarianController {
    Scanner scan = new Scanner(System.in);
    public void LibInput()
    {

        LibrarianInfo lb = new LibrarianInfo();
        System.out.println("-------------->Welcome User<-------------");
        System.out.print("Enter Your Name : ");
        //Scanner scan=new Scanner(System.in);
        lb.setLibName(scan.next());
        System.out.print("Enter Your Librarian Id :");
        lb.setLibId(scan.nextInt());
        System.out.println();
        System.out.print("Enter Your Mobile No");
        lb.setLibMobileNo(scan.next());
        System.out.print("Enter Your Location");
        lb.setLibLocation(scan.next());
    }
    public Books bookInput()
    {
        Books bk = new Books();
        System.out.print("Enter the Book Name : ");
        bk.setName(scan.next());
        System.out.println();
        System.out.print("Enter Book Id : ");
        bk.setId(scan.nextInt());
        System.out.println();
        System.out.print("Enter the Author Name : ");
        bk.setAuthor(scan.next());
        System.out.println();
        System.out.print("Enter the Published Year : ");
        bk.setPublishedYear(scan.next());
        System.out.println();

        return bk;
    }

}
