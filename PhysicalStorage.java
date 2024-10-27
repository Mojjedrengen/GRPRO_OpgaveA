import java.util.ArrayList;

/**
 * Lav en beskrivelse af klassen Storage her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class PhysicalStorage extends Storage
{
    protected ArrayList<String> keyCardNumbers;
   
    public PhysicalStorage(String storageId, double price) {
        super(storageId, price);
        this.keyCardNumbers = new ArrayList<>();
    }
    
    /* Show storage info */
    public void display() {
        super.display();
        if (this.keyCardNumbers.size() > 0) {
            System.out.println("Access keys: ");
            for(String k : this.keyCardNumbers) {
                System.out.println("- " + k);
            }
        }
    }
    
    /* Add new key card number to the key card list. */
     public void addKeyCardNumber(String cardNumber) {
        keyCardNumbers.add(cardNumber);
    }
}
