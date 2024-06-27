import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<LibraryItem> libraryItems;
    private ArrayList<Author> authors;
    private ArrayList<Patron> patrons;

    
    public Library() {
        this.libraryItems = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Add a new library item 
    public void addLibraryItem(LibraryItem item) {
        libraryItems.add(item);
    }

    public void removeLibraryItem(LibraryItem item){
        libraryItems.remove(item);
    }

    // Add a new author
    public void addAuthor(Author author) {
        authors.add(author);
    }
    public void removeAuthor(Author item){
        authors.remove(item);
    }

    // Add a new patron 
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }
    public void removePatron(Patron item){
        patrons.remove(item);
    }

    // Search for a library item by its title
    public LibraryItem searchLibraryItemByTitle(String title) {
        for (LibraryItem item : libraryItems) {
            if (item.getName().equalsIgnoreCase(title)) {
                return item;
            }

        }
        return null;
    }
    public Author searchAuthorByName(String name){
        for (Author item : authors){
            if(item.getName().equalsIgnoreCase(name)){
                return item;
            }
        }
        return null;
    }

    // Search for a library item by the author's name
    public LibraryItem searchLibraryItemByAuthor(String authorName) {
        for (LibraryItem item : libraryItems) {
            if (item.getAuthor().getName().equalsIgnoreCase(authorName)) {
                return item;
            }
        }
        return null;
    }

    // Search for a library item by its ISBN
    public LibraryItem searchLibraryItemByISBN(String ISBN) {
        for (LibraryItem item : libraryItems) {
            if (item.getIsbn().equals(ISBN)) {
                return item;
            }
        }
        return null;
    }

    // Borrow a library item by its ISBN
    public boolean borrowLibraryItem(String ISBN) {
        LibraryItem item = searchLibraryItemByISBN(ISBN);
        if (item != null && !item.isBorrowed()) {
            item.borrowItem(1);
            return true;
        }
        return false;
    }

    // Return a library item by its ISBN
    public boolean returnLibraryItem(String ISBN) {
        LibraryItem item = searchLibraryItemByISBN(ISBN);
        if (item != null && item.isBorrowed()) {
            item.returnItem(1);
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
    public void displayAuthors() {
        for (Author item : authors) {
            System.out.println(item);
        }
    }
    public void displayPatrons() {
        for (Patron item : patrons) {
            System.out.println(item);
        }
    }
    public Patron searchPatronByName(String name) {
        for (Patron patron : patrons) {
            if (patron.getName().equalsIgnoreCase(name)) {
                return patron;
            }
            
        }
        return null;
    }
}
