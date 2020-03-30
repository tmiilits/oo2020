public class People {
    private String name;
    private int age;
    private String country;
    private String city;
    private int howLong;


    public People(String name, int age, String country, String city, int howLong){
        this.name = name;
        this.age = age;
        this.country = country;
        this.city = city;
        this.howLong = howLong;
    }

    @Override
    public String toString(){
        return "Hello! I am" + name + " and I am" + age + "plapla" + country + "plapla" + city + "plapla" + howLong + ". Thank you for listening"
    }
}