/*Joogid

* Koosta klass Jook, millel on nimetus, liitri omahind ning erikaal. Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus. Samuti sees olev Jook, mis võib ka puududa. Koosta Joogipudeli jaoks käsklus, mis leiaks Joogipudeli massi koos Joogiga (juhul kui see olemas), samuti käsklus sellise komplekti omahinna leidmiseks. Koosta tööks automaattestid.
* Koosta klass Joogivaat, millel on ruumala ning sees oleva Joogi kogus liitrites. Koosta käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub). Koosta käsklus kogu Joogivaaditäie Joogi villimiseks Joogipudelitesse. Koosta töö kontrolliks automaattestid.
* Koosta Joogipudelite Kasti jaoks klass. Väljadeks kastityyp, kastihind, kastimass ning pesade arv (mitu pudelit mahub). Loo käsklused kasti ja sinna kuuluvate pudelite ühise massi ja omahinna arvutamiseks. Loo käsklus Joogivaadist Kasti sisse pudelite villimiseks. Koosta automaattestid.


Lisaks generiuc näide
*/

public class Joogipudel {
    public static double amount;
    public String bottleType;
    public static double bottleWeight;
    public static double pfand;

    public Joogipudel(double amount, String bottleType, double e, double pfand) {
        this.amount = amount;
        this.bottleType = bottleType;
        this.bottleWeight = e;
        this.pfand = pfand;
    }

    public double getMass() {
        double totalweight;
        totalweight = Joogipudel.bottleWeight + Jook.weight;
        return totalweight;
    }

   public double totalPrice(){
       double fullValue;
       fullValue=Joogipudel.pfand+(Jook.amountL*Jook.price);
       fullValue=Math.round(fullValue*100.0)/100.0;
       return fullValue;
   }

    
}