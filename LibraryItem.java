public class LibraryItem {
    private String name;
    private int numOfCopies = 1;

    public LibraryItem(String name, int copies){
        this.name = name;
        this.numOfCopies = copies;
    }

    public LibraryItem(String name){
        this.name = name;
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

}
