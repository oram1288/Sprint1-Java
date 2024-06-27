
import java.util.Scanner;

public class LibraryMenu {
    
    public static void main(String[] args) {
        Patron kyle = new Patron("Kyle", "670 Pouch Cove", "12093218");
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;
        

        do {
            System.out.println();
            System.out.println("Welcome to the Library Management System");
            System.out.println();
            System.out.println("1. Add Library Item");
            System.out.println("2. Edit Library Item");
            System.out.println("3. Delete Library Item");
            System.out.println("4. Borrow Library Item");
            System.out.println("5. Return Library Item");
            System.out.println("6. Add Author");
            System.out.println("7. Edit Author");
            System.out.println("8. Delete Author");
            System.out.println("9. Add Patron");
            System.out.println("10. Edit Patron");
            System.out.println("11. Delete Patron");
            System.out.println("12. Exit");
            System.out.println();
            System.out.print("Enter your choice (1-12): ");
            System.out.println();
            choice = scanner.nextInt();
            System.out.println();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Adding a new library item...");
                    System.out.println();
                    System.out.println("Enter the new Item's name");
                    String name = scanner.nextLine();
                    System.out.println("Enter the number of copies");
                    int copies = scanner.nextInt();
                    LibraryItem LibItem = new LibraryItem(name, copies);
                    library.addLibraryItem(LibItem);
                    
                    System.out.println("New Library Items List:");
                    library.displayLibraryItems();

                    break;
                case 2:
                    
                    System.out.println("Editing an existing library item...");
                    System.out.println();
                    System.out.println("Enter the name of the Library Item to be edited");
                    String ItemTitle = scanner.nextLine();
                    library.searchLibraryItemByTitle(ItemTitle);
                    System.out.println("If you would like to edit this Items name press 1");
                    System.out.println("If you would like to edit this Items Num of Copies press 2");
                    System.out.println("If you would like to edit this Items ID press 3");
                    System.out.println("If you would like to edit this Items Author Name press 4");
                    System.out.println("If you would like to edit this Items Author Birthday press 5");
                    System.out.println("If you would like to edit this Items ISBN press 6");
                    System.out.println("If you would like to edit this Items Publisher press 7");
                    int choice1 = scanner.nextInt();
                    scanner.nextLine();
                    if(choice1 == 1){
                        System.out.println("Enter Items new Name");
                        String newTitle = scanner.nextLine();
                        library.searchLibraryItemByTitle(ItemTitle).setName(newTitle);
                    }else if(choice1 == 2){
                        System.out.println("Enter Items new Num of Copies");
                        int newCopies = scanner.nextInt();
                        library.searchLibraryItemByTitle(ItemTitle).setNumOfCopies(newCopies);
                    }else if(choice1 == 3){
                        System.out.println("Enter Items new ID");
                        int newID = scanner.nextInt();
                        library.searchLibraryItemByTitle(ItemTitle).setItemID(newID);
                    }else if(choice1 == 4){
                        System.out.println("Enter Items new Author Name");
                        String newAuthorName = scanner.nextLine();
                        library.searchLibraryItemByTitle(ItemTitle).getAuthor().setName(newAuthorName);
                    }else if(choice1 == 5){
                        System.out.println("Enter Items new Author Birthday");
                        String newAuthorBday = scanner.nextLine();
                        library.searchLibraryItemByTitle(ItemTitle).getAuthor().setBirthday(newAuthorBday);
                    }else if(choice == 6){
                        System.out.println("Enter Items new Isbn");
                        String newIsbn = scanner.nextLine();
                        library.searchLibraryItemByTitle(ItemTitle).setIsbn(newIsbn);
                    }else if(choice1 == 7){
                        System.out.println("Enter Items new Publisher");
                        String newPub = scanner.nextLine();
                        library.searchLibraryItemByTitle(ItemTitle).setPublisher(newPub);
                    }else{
                        System.out.println("Invalid Input");
                    }
                    System.out.println("New Library Items List:");
                    library.displayLibraryItems();
                    break;
                case 3:
                    System.out.println("Deleting a library item...");
                    // Add logic to delete a library item
                    System.out.println("Enter the name of the Library Item to be removed");
                    String delItem = scanner.nextLine();
                    library.removeLibraryItem(library.searchLibraryItemByTitle(delItem));
                    System.out.println("Item Deleted");
                    System.out.println("New Library Items List:");
                    library.displayLibraryItems();

                    break;
                case 4:
                    System.out.println("Borrowing a library item...");
                    // Add logic to borrow a library item
                    System.out.println("Enter the name of the Item being borrowed");
                    String itemName = scanner.nextLine();
                    System.out.println("Enter the name of the Patron");
                    String patronName = scanner.nextLine();
                    System.out.println("Enter number of copies being borrowed");
                    int copiesNum = scanner.nextInt();
                    library.searchLibraryItemByTitle(itemName).borrowItem(copiesNum);
                    //library.searchPatronByName(patronName).borrowItem(library.searchLibraryItemByTitle(itemName), copiesNum);
                    System.out.println("New Item list:");
                    library.displayLibraryItems();
                    break;
                case 5:
                    System.out.println("Returning a library item...");
                    // Add logic to return a library
                    System.out.println("Enter the name of the Item being Returned");
                    String itemName1 = scanner.nextLine();
                    System.out.println("Enter the name of the Patron");
                    String patronName1 = scanner.nextLine();
                    System.out.println("Enter number of copies being Returned");
                    int copiesNum1 = scanner.nextInt();
                    library.searchLibraryItemByTitle(itemName1).returnItem(copiesNum1);
                    //library.searchPatronByName(patronName1).returnItem(library.searchLibraryItemByTitle(itemName1), copiesNum1);
                    System.out.println("New Item list:");
                    library.displayLibraryItems();
                    break;
                case 6:
                    System.out.println("Adding a Author...");
                    System.out.println("Enter Authors name");
                    String authorName = scanner.nextLine();
                    System.out.println("Enter the Authors Birthday");
                    String authorBDay = scanner.nextLine();
                    Author author = new Author(authorName, authorBDay);
                    library.addAuthor(author);

                    System.out.println("Author added");
                    library.displayAuthors();
                    break;
                case 7:
                    System.out.println("Editing an Author... ");
                    System.out.println("Enter the name of the Author to be edited");
                    String authorName1 = scanner.nextLine();
                    library.searchLibraryItemByTitle(authorName1);
                    System.out.println("If you would like to edit the Author name press 1");
                    System.out.println("If you would like to edit the Author BDay press 2");
                    System.out.println("If you would like to add a book to Author press 3");
                    System.out.println("If you would like to remove a book from Author press 4");
                    int choice2 = scanner.nextInt();
                    scanner.nextLine();
                    if(choice2 == 1){
                        System.out.println("Enter Authors new Name");
                        String newAuthorName = scanner.nextLine();
                        library.searchAuthorByName(authorName1).setName(newAuthorName);
                        System.out.println("Author name updated");
                    }else if(choice2 == 2){
                        System.out.println("Enter the Authors new Birthday");
                        String authorNewBDay = scanner.nextLine();
                        library.searchAuthorByName(authorName1).setBirthday(authorNewBDay);
                        System.out.println("Author BirthDay updated");
                    }else if(choice2 == 3){
                        System.out.println("Enter the Authors new Book name");
                        String newBookName = scanner.nextLine();
                        LibraryItem newBook = new LibraryItem(newBookName);
                        library.searchAuthorByName(authorName1).addBook(newBook);
                        System.out.println("Book added to author");
                    }else if(choice2 == 4){
                        System.out.println("Enter the name of the book to be removed");
                        String remBook = scanner.nextLine();
                        library.searchAuthorByName(authorName1).removeBook(library.searchLibraryItemByTitle(remBook));
                    }else{
                        System.out.println("Invalid Input");
                    }
                    System.out.println("New Author List:");
                    library.displayAuthors();
                    break;
                case 8:
                    System.out.println("Deleting an Author...");
                    System.out.println("Enter the name of the author to be Deleted");
                    String delAuthor = scanner.nextLine();
                    library.removeAuthor(library.searchAuthorByName(delAuthor));
                    System.out.println("Auhtor deleted");
                    System.out.println("New Author List:");
                    library.displayAuthors();
                    break;
                case 9:
                    System.out.println("Adding a Patron...");
                    System.out.println("Enter Patron name");
                    String patronName2 = scanner.nextLine();
                    System.out.println("Enter the Patrons address");
                    String patronAdd = scanner.nextLine();
                    System.out.println("Enter the Patrons Phone Number");
                    String patronNum = scanner.nextLine();

                    Patron patron = new Patron(patronName2, patronAdd, patronNum);
                    library.addPatron(patron);
                    System.out.println("Patron added");
                    library.displayPatrons();
                    break;
                case 10:
                    System.out.println("Editing a Patron... ");
                    System.out.println("Enter the name of the Patron to be edited");
                    String patronName3 = scanner.nextLine();
                    library.searchLibraryItemByTitle(patronName3);
                    System.out.println("If you would like to edit the Patron name press 1");
                    System.out.println("If you would like to edit the Patron Address press 2");
                    System.out.println("If you would like to edit the Patron Phone Number press 3");
                    System.out.println("If you would like to Add a book to Patrons borrowed Items press 4");
                    System.out.println("If you would like to remove a book to Patrons borrowed Items press 5");
                    int choice3 = scanner.nextInt();
                    scanner.nextLine();
                    if(choice3 == 1){
                        System.out.println("Enter Patrons new Name");
                        String newPatronName = scanner.nextLine();
                        library.searchAuthorByName(patronName3).setName(newPatronName);
                        System.out.println("Patron name updated");
                    }else if(choice3 == 2){
                        System.out.println("Enter Patrons new Address");
                        String newPatronAdd = scanner.nextLine();
                        library.searchPatronByName(patronName3).setAddress(newPatronAdd);;
                        System.out.println("Patron address updated");
                    }else if(choice3 == 3){
                        System.out.println("Enter Patrons new Phone Number");
                        String newPatronNum = scanner.nextLine();
                        library.searchPatronByName(patronName3).setPhoneNumber(newPatronNum);
                        System.out.println("Patron Phone Number updated");
                    }else if(choice3 == 4){
                        System.out.println("Enter the Book name to be added");
                        String bookToAdd = scanner.nextLine();
                        System.out.println("Enter the num of Copies of the Book to be added");
                        int bookCopies = scanner.nextInt();
                        library.searchPatronByName(patronName3).borrowItem(library.searchLibraryItemByTitle(bookToAdd), bookCopies);
                        System.out.println("Book(s) borrowed");
                    }else if(choice3 == 5){
                        System.out.println("Enter the name of the book to be removed");
                        String remBook1 = scanner.nextLine();
                        System.out.println("Enter the number of copies of the book to be removed");
                        int bookCopies1 = scanner.nextInt();
                        library.searchPatronByName(patronName3).returnItem(library.searchLibraryItemByTitle(remBook1), bookCopies1);
                        System.out.println("Book(s) returned");

                    }else{
                        System.out.println("Invalid Input");
                    }
                    System.out.println("New Patron List:");
                    library.displayPatrons();

                    break;
                case 11:
                    System.out.println("Deleting a Patron...");
                    System.out.println("Enter the name of the Patron to be Deleted");
                    String delPatron = scanner.nextLine();
                    library.removePatron(library.searchPatronByName(delPatron));
                    System.out.println("Patron deleted");
                    System.out.println("New Patron List:");
                    library.displayPatrons();
                    break;
                case 12:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 12);

        scanner.close();
    }
}
