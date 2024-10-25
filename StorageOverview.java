import java.util.ArrayList;

public class StorageOverview {
    private ArrayList<Storage> storage;

    public StorageOverview() {
        storage = new ArrayList<>();
    }

    /* Show storage info */
    public void display() {
        for (Storage s : storage) {
            s.display();
            System.out.println();
        }
    }

    public void addStorage(Storage s) {
        storage.add(s);
    }
}
