import java.util.ArrayList;

public class StorageOverview {
    private ArrayList<ScalablePriceStorage> scalablePriceStorages;
    private ArrayList<FixedPriceStorage> fixedPriceStorages;

    public StorageOverview() {
        scalablePriceStorages = new ArrayList<>();
        fixedPriceStorages = new ArrayList<>();
    }

    /* Show storage info */
    public void display() {
        for (ScalablePriceStorage s : scalablePriceStorages) {
            s.display();
            System.out.println();
        }
        for (FixedPriceStorage s : fixedPriceStorages) {
            s.display();
            System.out.println();
        }
    }

    public void addScalablePriceStorage(ScalablePriceStorage s) {
        scalablePriceStorages.add(s);
    }

    public void addFixedPriceStorage(FixedPriceStorage s) {
        fixedPriceStorages.add(s);
    }
}
