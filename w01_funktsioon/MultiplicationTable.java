/**
 * MultiplicationTable
 */
public class MultiplicationTable {
    public static void main(String[] args){
        System.out.println("This program generates a multiplication table");

        for (int i=1; i<=10; i++){
           
            for (int j=1; j<=9; j++){
                System.out.printf("%-1d * %-1d = %-1d \t", j, i, (i*j));
            }
           
            System.out.println();
        }
    }
}