public class Joogivaat {
    public  String vaatnimi;
    public static double vaatSuurus;
    public Joogivaat(String vaatnimi, double vaatSuurus){
        this.vaatnimi=vaatnimi;
        this.vaatSuurus=vaatSuurus;
    }
    public int totalBarrels(){
        int boxes;
        double bottles;
        bottles=Joogivaat.vaatSuurus/Jook.amountL;

        return (int)bottles;
    }


}
