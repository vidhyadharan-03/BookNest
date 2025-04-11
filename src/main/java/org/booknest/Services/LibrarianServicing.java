package org.booknest.Services;

import org.booknest.Model.Books;
import org.booknest.Model.UserInfo;

import java.util.*;

public class LibrarianServicing implements LibrarianServices{
    public HashMap<Books,String>booksList;
    public HashMap<Books,UserInfo>borrowingDetails;

    public LibrarianServicing()
    {
        this.booksList=new HashMap<>();
        this.borrowingDetails=new HashMap<>();
    }


    @Override
    public void addNewBooks(Books bk) {
        booksList.put(bk,"Available");
        System.out.println("Book successfully Added!!");

    }

    @Override
    public void removeOutdatedBooks(Books bk) {


    }
    public void showBook()
    {
        for(Map.Entry<Books,String> bk : booksList.entrySet())
        {
            System.out.println();
            System.out.println("Book Name : "+bk.getKey().getName());
            System.out.println("Book Id : "+bk.getKey().getId());
            System.out.println("Book Author Name : "+bk.getKey().getAuthor());
            System.out.println("Year of Published : "+bk.getKey().getPublishedYear());
            System.out.println("Availability : "+bk.getValue());
            System.out.println("------------------------------------------------------");
        }
    }

    public void searchbookbyName(String booktitle)
    {
        for(Map.Entry<Books,String> bk : booksList.entrySet())
        {
            if(bk.getKey().getName().equalsIgnoreCase(booktitle))
            {
                System.out.println("Book Name : "+bk.getKey().getName());
                System.out.println("Book Id : "+bk.getKey().getId());
                System.out.println("Book Author Name : "+bk.getKey().getAuthor());
                System.out.println("Year of Published : "+bk.getKey().getPublishedYear());
                System.out.println("Availability : "+bk.getValue());
                System.out.println("------------------------------------------------------");
                return ;
            }
        }
        System.out.println("Book with name "+booktitle+" not found");
    }



    public void lendBook(int choice,String booktitle,UserInfo ufo)
    {
        UserServicing us = new UserServicing();
        int flag=0;
        for(Map.Entry<Books,String>bk:booksList.entrySet())
        {
            if(bk.getKey().getName().equalsIgnoreCase(booktitle)&&(bk.getValue().equalsIgnoreCase("Available")))
            {
                String notAvail ="Not Available";
                us.addBooktoBorrowedList(bk.getKey());
                borrowingDetails.put(bk.getKey(),ufo);
                booksList.put(bk.getKey(),notAvail);
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Book not Found!!");
        }
    }

    @Override
    public void showCurrentBorrowing() {

        for(Map.Entry<Books,UserInfo>borrowedList : borrowingDetails.entrySet())
        {
            System.out.println("Student Name : "+borrowedList.getValue().getUserName());
            System.out.println("Student Id : "+borrowedList.getValue().getUserId());
            System.out.println("Student Mobile No : "+borrowedList.getValue().getUserMobileNo());
            System.out.println("Student Location : "+borrowedList.getValue().getUserLocation());
            System.out.println("Book Name : "+borrowedList.getKey().getName());
            System.out.println("Book Id : "+borrowedList.getKey().getId());
            System.out.println("--------------------------------------------------------------------------");

        }


    }
}
