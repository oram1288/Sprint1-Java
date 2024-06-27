

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name = " ";
    private String address = " ";
    private String phoneNumber  = " ";
    private ArrayList<LibraryItem> borrowedItems;

    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedItems = new ArrayList<>();
    }

    public void borrowItem(LibraryItem item, int copies) {
        if (item.getNumOfCopies() >= copies) {
            item.borrowItem(copies);
            borrowedItems.add(item);
            item.setNumOfCopies(item.getNumOfCopies() - copies);
            System.out.println("Item borrowed successfully!");
        } else {
            System.out.println("Not enough copies available");
        }
    }

    public void returnItem(LibraryItem item, int copies) {
        if (borrowedItems.contains(item)) {
            item.returnItem(copies);
            borrowedItems.remove(item);
            item.setNumOfCopies(item.getNumOfCopies() + copies);
            System.out.println("Item returned successfully!");
        } else {
            System.out.println("Item not found in borrowed items");
        }
    }
    

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBorrowedItems(ArrayList<LibraryItem> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

    // Override
    public String toString() {
        return "Patron{" +
                "name='" + this.name + '\'' +
                ", address='" + this.address + '\'' +
                ", phoneNumber='" + this.phoneNumber + '\'' +
                ", borrowedItems=" + this.borrowedItems +
                '}';
    }
}