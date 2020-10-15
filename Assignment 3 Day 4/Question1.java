// LetsUpgrade Java Essentials October 2020
// Assignment Day 4 | 13th October 2020
// Question 1:
// Create a class Avenger with properties - name, age, power, weapon, planet and with functions - getDetails() and displayDetails().
// Create 5 objects as an array in the main method and call.

import java.util.Scanner;

class avenger {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    String power;
    String weapon;
    String planet;
    void getDetails(){
        System.out.println("Enter your Name : ");
        name = sc.nextLine();
        System.out.println("Enter your Age : ");
        age = sc.nextInt();
        System.out.println("Enter Your Power : ");
        power = sc.next();
        System.out.println("Enter your Weapon : ");
        weapon = sc.next();
        System.out.println("Enter where did you came from : ");
        planet =sc.next();
        displayDetails();
        sc.close();
    }

    void displayDetails(){
        System.out.println("Your Name is : " +name);
        System.out.println("Your Age is : " +age);
        System.out.println("Your Power is : " +power);
        System.out.println("Your Weapon is : " +weapon);
        System.out.println("Your came from : " +planet);
    }

}

public class Question1 {

    public static void main(String[] args) {
        avenger[] avn= new avenger[5];
        avn[0]= new avenger();
        avn[1]= new avenger();
        avn[2]= new avenger();
        avn[3]= new avenger();
        avn[4]= new avenger();

        avn[0].getDetails();
        avn[1].getDetails();
        avn[2].getDetails();
        avn[3].getDetails();
        avn[4].getDetails();
    }
}