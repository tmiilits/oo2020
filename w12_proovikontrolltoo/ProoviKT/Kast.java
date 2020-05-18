public class Kast {
    public  static String kastinimi;
    public static int space;
    public static double boxPrice;
    public static int boxWeight;
    public Kast(String kastinimi,int space,double boxPrice,int boxWeight){
        this.kastinimi=kastinimi;
        this.space=space;
        this.boxPrice=boxPrice;
        this.boxWeight=boxWeight;
    }
    public int totalBoxes(){
        double boxes;
        double bottles;
        bottles=Joogivaat.vaatSuurus/Jook.amountL;
        boxes=bottles/Kast.space;
        return (int)boxes;
    }
    public double colaBoxPrice(){
        double Bottles;
        int totalBottles;
        double totalBottlesConPfand;
        double allDrinkPrice;
        int neededBoxes;
        double fullPrice;

        Bottles=Joogivaat.vaatSuurus/Joogipudel.amount;
       totalBottles=(int)Bottles;
       totalBottlesConPfand=totalBottles*Joogipudel.pfand;
       allDrinkPrice=totalBottles*Jook.price;
       neededBoxes=totalBottles/Kast.space;
       fullPrice=allDrinkPrice+totalBottlesConPfand+(neededBoxes*Kast.boxPrice);
        fullPrice=Math.round(fullPrice*100.0)/100.0;
        return fullPrice;
    }
    public double fullMass(){
        double Bottles;
        int totalBottles;
        double totalBottlesWeightEmpty;
        double allDrinkWeight;
        int neededBoxes;
        double fullWeight;

        Bottles=Joogivaat.vaatSuurus/Joogipudel.amount;
        totalBottles=(int)Bottles;
        totalBottlesWeightEmpty=totalBottles*Joogipudel.bottleWeight;
        allDrinkWeight=totalBottles*Jook.weight;
        neededBoxes=totalBottles/Kast.space;
        fullWeight=allDrinkWeight+totalBottlesWeightEmpty+(neededBoxes*Kast.boxWeight);
        return fullWeight;
    }
}
