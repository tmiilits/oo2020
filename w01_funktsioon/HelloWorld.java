public class HelloWorld{

    public static void main(String[] args){
        System.out.println("Hello World");

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        //byte, short, int, long, float, double, char, boolean

        boolean flag = true;

        System.out.println(1+1); // * / - %
        //i++ on i=i+1
        int number = 5;
        System.out.println(number++);
        System.out.println(++number);
        // || on for && on and
        
        if (number < 6 && number > 0){
            System.out.println("Jah");
        }
        
        for(int i = 0; i < 10; i++){

        }

        int counter = 0

        do{
            counter++;
        }while(counter == 10);

        int[] numberArray = new int[]{1, 2, 3, 4, 5};

        for(int element : numberArray){
            System.out.println(element);
        }

        for(int i = 0; i < numberArray.lenght; i++){
            System.out.println(numberArray[i]);
        }

        String myName = "Tauri";

        System.out.println(myName);

        HelloWorld helloWorld = new HelloWorld();

        //HelloWorld.printSomething();
        printSomething(10);

        String name = name();
        System.out.println(name);
    }

    static String name(){
        return "";
    }
    
    
    static void printSomething(int number){
        for(int i = 1; i < 10; i++){
            number += 1;
        }
        System.out.println()
    }

}