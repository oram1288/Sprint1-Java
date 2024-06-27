public class Periodicals extends LibraryItem {
    private String type;

    public Periodicals(String name, String type, int numOfCopies){
        super(name, numOfCopies);
        this.type = type;

    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public String toString() {
        
        return "Periodical[Name: " + super.getName() + ", Type: " + type + ", Num Of Copies: " + super.getNumOfCopies() + "]";
    }
    

   
}
