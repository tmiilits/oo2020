/*
1) Tutvuda näiteks :
Listidest  (ArrayList, LinkedList, Vector, Stack, ArrayDeque)
 Set (HashSet, LinkedHashSet, TreeSet)
 Map (HashMap, TreeMap).
*/
////// IMPORTS ////////

//////////////////////////////////////////////////
import java.util.*;

/**
 * Class Listid
 */
public class Listid {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList <>();

        int chosen_number = 7;

        for (int i=0; i<30;i++){
            list.add(i);
        }
        boolean check_value = false;
        
            
        if(check_value==true){
            System.out.println("Arv "+chosen_number+" on listis.");
        }
       maptest();
       settest();
       list_comparison();

        }

         public static void maptest(){
            LinkedHashMap<String,String> map_katse = new LinkedHashMap<>();
            map_katse.put("menu_1","Coffee, Struudel, Dessert");
            map_katse.put("two","supper");
            map_katse.put("three","lunch");


            System.out.println(" Algul meil on "+map_katse.get("menu_1")+" ja hiljem muud");
            
        }
        public static void settest(){
            Set<Integer> kogus = new HashSet<>();
            for (int i =0; i<30;i++){
                if(i!=0){
                    kogus.add(i);
                    kogus.add(i);
                }
            }
            System.out.println(kogus.size());
        }
        public static void list_comparison(){
            List<Integer> kontroll = new ArrayList<>();
            for (int i =0; i<30;i++){
                if(i!=0){
                    kontroll.add(i);
                    kontroll.add(i);
                }
            }
            System.out.println(kontroll.size()); ////58
        }
    

}