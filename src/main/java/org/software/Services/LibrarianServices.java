package org.software.Services;

import org.software.Model.Books;

public interface LibrarianServices {
     void addNewBooks(Books bk);
    void searchbookbyName(String name);
    void removeOutdatedBooks(Books bk);
    void showCurrentBorrowing();
}
