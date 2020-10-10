// LetsUpgrade Java Essentials October 2020
// Assignment Day 2 | 9th October 2020
// Questions 1:
// Create a class employee. Inside that class create three variable name,age,city. Also create a function to display the three variables. In the main function create two objects and call the function using it.
// Output:
    // The name is Saurab
    // The age is 23
    // The city is chennai

public class Employee {
    String name = new String();
    int age;
    String city = new String();
            public void display() {
            System.out.println("\n The name is " +name); 
            System.out.println("\n The age is " +age);
            System.out.println("\n The city is " +city);  
        }

        public static void main(String[] args) {
            Employee emp1 = new Employee();
            emp1.name = "Kiruthika";
            emp1.age = 21;
            emp1.city = "Chennai";

            emp1.display();
    }
}