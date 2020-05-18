/**
 * Person
 */

abstract class Person {
    public String name;
    public int age;
    public String degree;

    public Person(String name, int age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    public abstract String specialized();
    public void identifyPerson(){ 
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old and i'm a " + this.degree + " student, specialized in " + specialized());
    }
}