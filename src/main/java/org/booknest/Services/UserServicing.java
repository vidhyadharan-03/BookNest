package org.booknest.Services;

import org.booknest.Model.Books;
import org.booknest.Model.UserInfo;

import java.util.*;

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
