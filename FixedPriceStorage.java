import java.util.ArrayList;

public class FixedPriceStorage extends Storage{
    int keyCounter;
    
    public FixedPriceStorage(String storageId, double price) {
        super(storageId, price);
        keyCounter = 0;
    }
    
    @Override public void addKeyCardNumber(String cardNumber) {
        super.addKeyCardNumber(cardNumber);
        keyCounter++;
        if (keyCounter % 3 == 0) {
            price += 1000;
        }
    }
}

