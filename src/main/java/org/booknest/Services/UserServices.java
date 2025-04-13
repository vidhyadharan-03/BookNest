package org.booknest.Services;

import org.booknest.Model.UserInfo;
import org.booknest.Model.Books;

public interface UserServices {
     void addUser(UserInfo ui);
     void removeUser(UserInfo ui);
     void addBooktoBorrowedList(Books bk,UserInfo person);
     void viewBorrowedBook(UserInfo ufo);
    //public abstract void()
}
