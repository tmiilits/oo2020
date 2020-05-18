/**
 * Iphone6
 */

public class Iphone6 {
    public static void main(String[] args) {
        Iphone11 newIphone = new Iphone11();
        Build oldIphone = new Build();
        System.out.println("Compared to Apple's new " + newIphone);
        System.out.println("Your phone's specs are:");
        oldIphone.display_small();
        oldIphone.chipset_weak();
        oldIphone.storage_small();
        oldIphone.weight_low();
    }
}