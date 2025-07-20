package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    private String gender;
    private String email;
    private String phoneNumber;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public Person(String firstName, String lastName, int age, String gender, String email, String phoneNumber) {
        this(firstName, lastName, age);
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Method 1
    public String getFirstName() {
        return firstName;
    }

    // Method 2
    public String getLastName() {
        return lastName;
    }

    // Method 3
    public int getAge() {
        return age;
    }

    // Method 4
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }


    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen? " + person1.isTeen());

        System.out.println();

        Person person2 = new Person("Alice", "Smith", 17, "Female", "alice@example.com", "555-1234");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is Teen? " + person2.isTeen());
    }
}
