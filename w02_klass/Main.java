/**
 * Main
 */
public class Main{
    public static void main(String[] args){
        People newPerson1 = new People ("Timo", 24, "Estonia", "Viljandi", "computer science");
        People newPerson2 = new People ("Jossi", 20, "Finland", "Helsinki", "history"); 

        newPerson1.name = "pla";
        newPerson2.age = 46;

        System.out.println(newPerson1);
        System.out.println(newPerson2);
    }
}