package org.booknest.Services;

import org.booknest.Model.Books;

public interface LibrarianServices {
     void addNewBooks(Books bk);
    void searchbookbyName(String name);
    void removeOutdatedBooks(Books bk);
    void showCurrentBorrowing();
}
