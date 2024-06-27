public class Book extends LibraryItem {
    private String type;

    public Book(String name, String type, int numOfCopies){
        super(name, numOfCopies);
        this.type = type;

    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    @Override
    public String toString() {
        
        return "Book[Name: " + super.getName() + ", Type: " + type + ", Num Of Copies: " + super.getNumOfCopies() + "]";
    }
    
}
