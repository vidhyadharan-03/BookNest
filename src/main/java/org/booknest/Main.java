package org.booknest;

import org.booknest.Controller.LibrarianController;
import org.booknest.Controller.UserController;
import org.booknest.Model.UserInfo;
import org.booknest.Services.UserServicing;
import org.booknest.Services.LibrarianServicing;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Object Creation for classes.
        UserController controller = new UserController();
        LibrarianController lbController = new LibrarianController();
        UserServicing usa = new UserServicing();
        LibrarianServicing lbs = new LibrarianServicing();








        Scanner scan = new Scanner(System.in);
        System.out.println("---------------------------------------------------------> Welcome to Oxford Library <----------------------------------------------------------------");
        char inputFace='a';
        do {
            System.out.println("1.Student Login");
            System.out.println("2.Librarian Login");
            System.out.print("Enter who you are ? ");
            int selector = scan.nextInt();

        /* This SwitchCase Segregrate the Interface between User and Librarian. Using selector we get the input
        from the user and segregrate based on the input whether the user is student or a librarian....
        */
            switch (selector) {
                // User and its features.
                case 1:
                    System.out.println();
                    UserInfo person = controller.userInput();
                    usa.addUser(person);
                    lbs.showBook();
                    System.out.println("--------------------------------------------");
                    char userOptionInputRepeator ='a';
                    do{

                    System.out.println("1.SearchBook");
                    System.out.println("2.View book borrowed");
                    System.out.println("3.Return book");
                    int userSelector = scan.nextInt();
                    switch(userSelector) {
                        case 1:
                            String searchedBook = controller.bookSearchInput();
                            lbs.searchbookbyName(searchedBook);
                            lbs.lendBook(controller.borrowBook(), searchedBook, person);
                            System.out.print("Do you want to Continue.. press(y/n) : ");
                            userOptionInputRepeator = scan.next().charAt(0);
                            System.out.println();
                            break;
                        case 2:
                            usa.viewBorrowedBook(person);
                            System.out.print("Do you want to Continue.. press(y/n) : ");
                            userOptionInputRepeator = scan.next().charAt(0);

                            System.out.println();
                            break;
                        case 3:
                            System.out.print("Enter Book Name : ");
                            String bkName = scan.next();
                            System.out.println();
                            System.out.print("Book Id : ");
                            int bkId = scan.nextInt();
                            System.out.println();
                            int removedFromUserList = usa.removeFromBorrowList(person,bkName,bkId);
                            lbs.removeFromLibBorrow(removedFromUserList,person,bkName,bkId);
                            usa.viewBorrowedBook(person);

                    }
                    }while(userOptionInputRepeator=='y');

                // case 2 depicts the librarian and its functionality.
                case 2:
                    System.out.println();
                    lbController.LibInput();
                    System.out.println();
                    System.out.println("1.Add New Book to List ");
                    System.out.println("2.Remove OutDated book ");
                    System.out.println("3. View Current Borrowing ");
                    System.out.println("4. See Report of Late Returns");

                    int selectortwo = scan.nextInt();

                    /* This switch case separates the different features that the librarian as
                     */
                    switch (selectortwo) {
                        // case 1 for adding new books.
                        case 1:
                            System.out.println();
                            char input;
                            do {
                                lbs.addNewBooks(lbController.bookInput());
                                System.out.print("Do you want to add More ? Type(y/n)");
                                input = scan.next().charAt(0);
                            }
                            while (input == 'y');
                            break;
                        case 3:
                          lbs.showCurrentBorrowing();

                    }
                    inputFace = scan.next().charAt(0);
            }
        }while(inputFace=='y');



        }
    }
