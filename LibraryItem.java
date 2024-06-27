public class LibraryItem {
    private String name;
    private int numOfCopies = 1;
    private int ItemID = 0;
    private int ItemCount = 1;
    private Author author = new Author("John Doe", "Oct 23, 2001");
    private String isbn = " ";
    private String publisher = " ";

    public LibraryItem(String name, int copies){
        this.name = name;
        this.numOfCopies = copies;
        this.ItemID = ItemCount;
        ItemCount++;
    }

    public LibraryItem(String name){
        this.name = name;
        this.ItemID = ItemCount;
        ItemCount++;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNumOfCopies(int copies){
        this.numOfCopies = copies;
    }
    public String getName(){
        return name;
    }
    public int getNumOfCopies(){
        return numOfCopies;
    }
    public void borrowItem(int copies){
        if (this.numOfCopies >= copies){
            this.numOfCopies = numOfCopies - copies;
            System.out.println("Item(s) Borrowed Successfully");
        }else{
            System.out.println("Not Enough Copies");
        }
    }
    public void returnItem(int copies){
        this.numOfCopies = numOfCopies + copies;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setItemID(int itemID) {
        this.ItemID = itemID;
    }
    public int getItemID(){
        return ItemID;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Boolean isBorrowed(){
        if(numOfCopies <= 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Library Item[Name: "+name+", NumOfCopies: "+numOfCopies+ ", ID: " + ItemID + ", " + author.toString() + ", Publisher: " + publisher + ", ISBN: " + isbn + "]";
    }
}
