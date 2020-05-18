/**
 * Student
 */

public class Student extends Person {

    public Student(String name,int age,String degree){
        super(name, age, degree);
    }

    public void university(){
        System.out.println("Tallinn university.");
    }

    public void identifyStudent(){
        super.identifyPerson();
        System.out.println("Currently studying in university.");
        university();
    }
    
    public String specialized(){
        return "computer science.";
    }
}