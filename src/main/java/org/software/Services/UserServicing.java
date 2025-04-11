package org.software.Services;

import org.software.Model.Books;
import org.software.Model.UserInfo;

import java.awt.print.Book;
import java.util.*;
import org.software.Model.UserInfo;
public class UserServicing implements UserServices {
    public List<UserInfo>userInfoList;
    UserInfo ufo = new UserInfo();
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
    public void addBooktoBorrowedList(Books bk) {
        ufo.setBorrowedBooks(bk);
        System.out.println("You borrowed the book successfully!!!");
    }
}
