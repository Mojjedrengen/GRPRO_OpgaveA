import java.util.ArrayList;

public class FixedPriceStorage {
    private String storageId;
    private double price;
    private ArrayList<String> keyCardNumbers;

    public FixedPriceStorage(String storageId, double price) {
        this.storageId = storageId;
        this.price = price;
        this.keyCardNumbers = new ArrayList<>();
    }

    /* Show storage info */
    public void display() {
        System.out.println(storageId);
        if (keyCardNumbers.size() > 0) {
            System.out.println("Access keys: ");
            for (String k : keyCardNumbers) {
                System.out.println("- " + k);
            }
        }
    }

    /* Add new key card number to the key card list. */
    public void addKeyCardNumber(String cardNumber) {
        keyCardNumbers.add(cardNumber);
    }
}

