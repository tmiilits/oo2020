public class Human{
    private String name;
    private int age;
    private int height;
    private int hand;
    private int leg;


    public Human(String name, int age, int height, int hand, int leg){
        this.name = name;
        this.age = age;
        this.height = height;
        this.hand = hand;
        this.leg = leg;
        
    }
    @Override
    public String toString(){
        return "My name is " + name + ", I am " + age + " years old and my height is " + height + " cm. I have " + leg + " legs and " + hand + " hands.";
    }
}