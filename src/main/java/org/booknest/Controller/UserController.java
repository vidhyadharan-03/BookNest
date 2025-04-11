package org.booknest.Controller;

import org.booknest.Model.UserInfo;

import java.util.Scanner;

public class UserController {
    Scanner scan = new Scanner(System.in);
    public UserInfo userInput(){
        UserInfo ui = new UserInfo();
        System.out.println("-------------->Welcome User<-------------");
        System.out.print("Enter Your Name : ");
       // Scanner scan=new Scanner(System.in);
        ui.setUserName(scan.next());
        System.out.print("Enter Your Student Id :");
        ui.setUserId(scan.nextInt());
        System.out.println();
        System.out.print("Enter Your Mobile No");
        ui.setUserMobileNo(scan.next());
        System.out.print("Enter Your Location");
        ui.setUserLocation(scan.next());

       return ui;
    }

    public String bookSearchInput()
    {
        System.out.println();
        System.out.print("Search Your Book here using Name --> : ");
        String searchingBookName = scan.next();
        return searchingBookName;


    }

    public int borrowBook()
    {
        System.out.println("-----------------------------------------");
        System.out.println("Do You wanna Borrow this book ? ");
        String borrowInput = scan.next();
        if(borrowInput.equalsIgnoreCase("yes"))
        {
            return 1;
        }
        return 0;
    }
}
