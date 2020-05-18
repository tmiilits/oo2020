/**
 * Main
 */

public class Main {
    public static void main(String[] args) {
        Warehouse  storage = new Warehouse();

        Fridge fridge_1 = new Fridge(Fridgetype.FREESTANDING, Fridgegrade.A,200); //siin ka cm
        Fridge fridge_2 = new Fridge(Fridgetype.INTEGRATED, Fridgegrade.B, 250);
        Fridge fridge_3 = new Fridge(Fridgetype.MINI, Fridgegrade.C, 50);        
        
        storage.addFridges(fridge_1);
        storage.addFridges(fridge_2);
        storage.addFridges(fridge_3);
        
        System.out.println("Hetkel on laos "+storage.getList()+" kylmkapid.");
        System.out.println("Lattu on jaanud "+storage.getSpace()+"cm^2 ruumi");
        
    }
}