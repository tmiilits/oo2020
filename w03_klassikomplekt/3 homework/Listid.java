import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Listid
 */
public class Listid {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        //lisan listi
        list.add("Hello");
        list.add("world");
        list.add("Banana");
        list.add(String.valueOf(2));
        list.add("viimane");

        //loopin listi läbi
        for(String name : list){
            System.out.println(name);
        }

        //Võtan listist mingi eseme
        System.out.println("Listis esimene on - " +list.get(0)); 

        //Muudan listis olevaid väärtuseid
        list.set(0, "Bye");
        list.set(2, String.valueOf(10));

        System.out.println("Listis on " + list.size() + " eset");
        
        //Loop Through an ArrayList
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //Teen listi tühjaks
        list.clear();
        
        System.out.println("List on nüüd tühi :( " + list);
        System.out.println("Uus list: ");

        //Teen uue listi numbritega, et neid sortida ja järjestada
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(9);
        numbers.add(3);
        numbers.add(10);
        numbers.add(6);

        for (int i : numbers) {
            System.out.println(i);
        }

        System.out.println("Uus sortitud list: ");

        //Sortin listi
        Collections.sort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }

        //HashMap, key and value, 
        HashMap<String, String> peopleFrom = new HashMap<String, String>();
        peopleFrom.put("Timo", "Tartust");
        peopleFrom.put("Madis", "Pärnust");
        peopleFrom.put("Jürgen", "Lihulast");
        peopleFrom.put("Ats", "Keilast");
        
        //Kuvan kogu massiivi
        System.out.println(peopleFrom);

        for (String i : peopleFrom.keySet()){
            System.out.println(i + " on pärit " + peopleFrom.get(i));
        }
    }
}