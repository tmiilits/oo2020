/**
 * Main
 */

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Karl", 23, "bachelor");
        student1.identifyStudent();

        Student student2 = new Student("Toivo", 26, "major");
        student2.identifyStudent();
    }
}