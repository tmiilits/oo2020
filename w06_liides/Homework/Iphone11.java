/**
 * Iphone11
 */

public class Iphone11 {
    public static void main(String[] args) {
        Iphone6 oldIphone = new Iphone6();
        Build newIphone = new Build();
        System.out.println("Compared to Apple's old " + oldIphone);
        System.out.println("Your phone's specs are:");
        newIphone.display_big();
        newIphone.chipset_powerful();
        newIphone.storage_big();
        newIphone.weight_heavy();
    }
}