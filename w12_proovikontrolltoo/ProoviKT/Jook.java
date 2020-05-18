/**
 * Jook
 * 
* Koosta klass Jook, millel on nimetus, liitri omahind ning erikaal. Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus. Samuti sees olev Jook, mis võib ka puududa. Koosta Joogipudeli jaoks käsklus, mis leiaks Joogipudeli massi koos Joogiga (juhul kui see olemas), samuti käsklus sellise komplekti omahinna leidmiseks. Koosta tööks automaattestid.
* Koosta klass Joogivaat, millel on ruumala ning sees oleva Joogi kogus liitrites. Koosta käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub). Koosta käsklus kogu Joogivaaditäie Joogi villimiseks Joogipudelitesse. Koosta töö kontrolliks automaattestid.
* Koosta Joogipudelite Kasti jaoks klass. Väljadeks kastityyp, kastihind, kastimass ning pesade arv (mitu pudelit mahub). Loo käsklused kasti ja sinna kuuluvate pudelite ühise massi ja omahinna arvutamiseks. Loo käsklus Joogivaadist Kasti sisse pudelite villimiseks. Koosta automaattestid.
*/

public class Jook {
    public static String drink;
    public static double amountL;
    public static double price;
    public static double weight;

    public Jook(String drink, double amountL, double price, double weight) {
        this.drink = drink;
        this.amountL = amountL;
        this.price = price;
        this.weight = weight;
    }
}