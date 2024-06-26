

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String birthday;
    private List<LibraryItem> books = new ArrayList<>();

    public Author(String name, String birthday){
        this.name = name;
        this.birthday = birthday;
    }
    public void addBook(LibraryItem book){
        books.add(book);
        System.out.println("Book added successfully");
    }
    public void removeBook(LibraryItem book){
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found under this Author");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public void setBooks(List<LibraryItem> book){
        this.books = book;
    }
    public String getName(){
        return name;
    }
    public String getBirthday(){
        return birthday;
    }
    public List<LibraryItem> getBooks(){
        return books;
    }
    public String toString(){
        return "Author( Name: " + name + " Date of Birth: " + birthday + " Books:" + books + ")";
    }

    
}
