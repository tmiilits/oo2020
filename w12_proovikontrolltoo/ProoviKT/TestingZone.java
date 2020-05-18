import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TestingZone {

    @Test
    public void Test1() {
        Joogipudel nullViis = new Joogipudel(1, "vaike", 62, 0.25);
        Jook cola = new Jook("cola", 1, 0.82, 1000);
        Joogivaat colaBarrel= new Joogivaat("Cola-Barrel",18);
        Kast colaBox= new Kast("Coca-Cola Kas",12,2.26,2000);


        System.out.print(nullViis.getMass());
        System.out.println(" Pudeli mass");
        System.out.print(nullViis.totalPrice());
        System.out.println(" Eur");
        System.out.print(colaBarrel.totalBarrels());
        System.out.println(" Täidab pudelid vaat");
        System.out.print(colaBox.totalBoxes());
        System.out.println(" Kaste saab täis");
        System.out.print(colaBox.colaBoxPrice());
        System.out.println(" Hind "+colaBox.totalBoxes()+" Kasti "+colaBarrel.totalBarrels()+" Pudelite "+Jook.drink+" eest.");

        assertFalse("0.950".equals(nullViis.getMass()));
        assertEquals(1.07,nullViis.totalPrice());
        assertEquals(18,colaBarrel.totalBarrels());
        assertEquals(1,colaBox.totalBoxes());
        assertEquals(21.52,colaBox.colaBoxPrice());



    }
}