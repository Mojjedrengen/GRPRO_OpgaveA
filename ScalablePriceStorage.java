import java.util.ArrayList;

public class ScalablePriceStorage {
    private String storageId;
    private double pricePerSquareMeter;
    private int squareMeters;
    private double price;
    private ArrayList<String> keyCardNumbers;

    public ScalablePriceStorage(String storageId, double pricePerSquareMeter, int squareMeters) {
        this.storageId = storageId;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.squareMeters = squareMeters;
        this.price = pricePerSquareMeter * squareMeters;
        this.keyCardNumbers = new ArrayList<>();
    }

    /* Show storage info */
    public void display() {
        System.out.println(storageId);
        if (keyCardNumbers.size() > 0) {
            System.out.println("Access keys: ");
            for(String k : keyCardNumbers) {
                System.out.println("- " + k);
            }
        }
    }

    /* Rent additional square meters. Price gets updated automatically.  */
    public void rentSquareMeters(int sqmeters) {
        squareMeters += sqmeters;
        price = squareMeters * pricePerSquareMeter;
    }

    /* Add new key card number to the key card list. */
    public void addKeyCardNumber(String cardNumber) {
        keyCardNumbers.add(cardNumber);
    }
}

