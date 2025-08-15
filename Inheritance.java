class Person {
    String name;

    // Constructor for Person
    public Person(String n) {
        name = n;
    }
}

// Student inherits from Person
class Student extends Person {
    int id;

    // Constructor for Student that also calls super constructor
    public Student(String n, int i) {
        super(n); // calling parent constructor
        id = i;
    }

    // Method to display data
    public void Display() {
        System.out.println("Student name is " + name + ", Id is " + id);
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        // Creating object with name and id
        Student obj = new Student("ABC", 1);
        obj.Display();
    }
}
