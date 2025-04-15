package org.booknest.Services;

import org.booknest.Model.Books;
import org.booknest.Model.UserInfo;

import java.util.*;

public class UserServicing implements UserServices {
    public List<UserInfo>userInfoList;
    //UserInfo ufo = new UserInfo();
    public UserServicing()
    {
        this.userInfoList=new ArrayList<>();
    }

    @Override
    public void addUser(UserInfo ui) {

        userInfoList.add(ui);
        System.out.println("User Successfully added!!");

    }

    @Override
    public void removeUser(UserInfo ui) {

    }

    @Override
    public void addBooktoBorrowedList(Books bk,UserInfo ufo) {
        ufo.setBorrowedBooks(bk);
        //System.out.println("You borrowed the book successfully!!!");
    }

    @Override
    public void viewBorrowedBook(UserInfo ufs) {
        List<Books>temporyBorrowList=ufs.getUserborrowList();
        for(Books bk : temporyBorrowList)
        {
            System.out.println("Book Name : "+bk.getName());
            System.out.println("Book ID : "+bk.getId());
            System.out.println("Author Name : "+bk.getAuthor());
            System.out.println("Published Year : "+bk.getPublishedYear());
            System.out.println("--------------------------------------------------");
        }


    }

    @Override
    public int removeFromBorrowList(UserInfo ufo, String bkName, int bkId) {

        List<Books>temp = ufo.getUserborrowList();

        for(Books borrowed : temp)
        {
            if(borrowed.getName().equalsIgnoreCase(bkName) && borrowed.getId()==bkId)
            {
                ufo.removeBorrowedBooks(borrowed);
                return 1;
            }
        }
       return 0;
    }
}
