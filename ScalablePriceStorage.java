import java.util.ArrayList;

public class ScalablePriceStorage extends Storage{
    private double pricePerSquareMeter;
    private int squareMeters;

    public ScalablePriceStorage(String storageId, double pricePerSquareMeter, int squareMeters) {
        super(storageId, pricePerSquareMeter * squareMeters);
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.squareMeters = squareMeters;
    }

    /* Rent additional square meters. Price gets updated automatically.  */
    public void rentSquareMeters(int sqmeters) {
        squareMeters += sqmeters;
        price = squareMeters * pricePerSquareMeter;
    }
    
    @Override public void display() {
        super.display();
        System.out.println(this.squareMeters + " kvm");
    }
}

