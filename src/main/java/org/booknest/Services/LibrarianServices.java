package org.booknest.Services;

import org.booknest.Model.Books;
import org.booknest.Model.UserInfo;

public interface LibrarianServices {
     void addNewBooks(Books bk);
    void searchbookbyName(String name);
    void removeOutdatedBooks(Books bk);
    void showCurrentBorrowing();
    void removeFromLibBorrow(int yes, UserInfo person,String bkName, int bkId);


}
