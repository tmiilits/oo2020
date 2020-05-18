public class Main {
    
    public static void main(String[] args) {
        Joogipudel nullViis = new Joogipudel(1, "vaike", 62, 0.25);
        Jook cola = new Jook("cola", 1, 0.82, 1000);
        Joogivaat colaBarrel= new Joogivaat("Cola-Barrel",12);
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
        System.out.println(colaBox.fullMass());
    }
    
}