
/**
 * Write a description of class Storage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Storage
{
    protected String storageId;
    protected double price;
    
    public Storage(String storageId, double price) {
        this.storageId = storageId;
        this.price = price;
    }
    
    public void display() {
        System.out.println(" ** STORAGE INFO ** ");
        System.out.println("- ID: " + this.storageId);
        System.out.println("- Price: " + this.price);
    }
}
