/**
 * Warehouse
 */
import java.util.List;
import java.util.ArrayList;

public class Warehouse {
    public List<Fridge> list = new ArrayList<>();
    int warehouseSize = 1000; // cm
    
    public void addFridges(Fridge fridge){
        list.add(fridge);
    }

    public List<Fridge> getList() {
        return list;
    }
    
    public int getSpace(){
        int fridgeSum = 0;
        for (Fridge fridge : list){
            fridgeSum += fridge.area;   
         }
         fridgeSum = warehouseSize - fridgeSum;
         return  fridgeSum;
    }
   
}