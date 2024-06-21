package Sprint1_Java;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> libraryItems;
    private List<Author> authors;
    private List<Patron> patrons;

    
    public Library() {
        this.libraryItems = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Add a new library item 
    public void addLibraryItem(LibraryItem item) {
        libraryItems.add(item);
    }

    // Add a new author
    public void addAuthor(Author author) {
        authors.add(author);
    }

    // Add a new patron 
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    // Search for a library item by its title
    public LibraryItem searchLibraryItemByTitle(String title) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    // Search for a library item by the author's name
    public LibraryItem searchLibraryItemByAuthor(String authorName) {
        for (LibraryItem item : libraryItems) {
            if (item.getAuthor().equalsIgnoreCase(authorName)) {
                return item;
            }
        }
        return null;
    }

    // Search for a library item by its ISBN
    public LibraryItem searchLibraryItemByISBN(String ISBN) {
        for (LibraryItem item : libraryItems) {
            if (item.getISBN().equals(ISBN)) {
                return item;
            }
        }
        return null;
    }

    // Borrow a library item by its ISBN
    public boolean borrowLibraryItem(String ISBN) {
        LibraryItem item = searchLibraryItemByISBN(ISBN);
        if (item != null && !item.isBorrowed()) {
            item.borrowItem();
            return true;
        }
        return false;
    }

    // Return a library item by its ISBN
    public boolean returnLibraryItem(String ISBN) {
        LibraryItem item = searchLibraryItemByISBN(ISBN);
        if (item != null && item.isBorrowed()) {
            item.returnItem();
            return true;
        }
        return false;
    }

    // Display all library items
    public void displayLibraryItems() {
        for (LibraryItem item : libraryItems) {
            System.out.println(item);
        }
    }
}
