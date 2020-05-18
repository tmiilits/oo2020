/**
 * People
 */
public class People {
    public String name;
    public int age;
    public String country;
    public String city;
    public String speciality;


    public People(String name, int age, String country, String city, String speciality){
        this.name = name;
        this.age = age;
        this.country = country;
        this.city = city;
        this.speciality = speciality;
    }

    @Override
    public String toString(){
        return "\nHello! I am " + name + " and I am " + age + " years old. I am from " + country + ", " + city + " and i am studying " + speciality + ". Thank you for listening!";
    }
}