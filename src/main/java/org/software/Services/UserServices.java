package org.software.Services;

import org.software.Model.UserInfo;
import org.software.Model.Books;

import java.awt.print.Book;

public interface UserServices {
     void addUser(UserInfo ui);
     void removeUser(UserInfo ui);
     void addBooktoBorrowedList(Books bk);
    //public abstract void()
}
