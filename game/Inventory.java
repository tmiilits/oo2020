import java.util.ArrayList;
import java.util.List;

/**
 * Inventory
 */
public class Inventory {
    List<Item> inventory = new ArrayList<>();
    private int inventoryMaxSize = 0;

    public Inventory(int size){
        this.inventoryMaxSize = size;
    }

    void addItem(Item item){
        if(inventory.size() <= inventoryMaxSize){
            inventory.add(item);
            System.out.println(item + " added to inventory");
        } else {
            System.out.println(item + " not to inventory");
        }
    }
} 