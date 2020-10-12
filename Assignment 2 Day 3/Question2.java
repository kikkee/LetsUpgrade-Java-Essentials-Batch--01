// LetsUpgrade Java Essentials October 2020
// Assignment Day 3 | 10th October 2020
// Questions 2:
// Take employee name,date of birth,month of birth,birth year, monthly salary;
// 5l - 20%;
// 4l - 15%;
// 3l- 10%;
// 2l -5%;
// Display name,age,annual salary and the tax amount

import java.util.Scanner;
public class Question2{
    public static void main (String args[]) {
        System.out.println("*****Please enter Employee's Information*****");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employee's name ");
            String name = sc.nextLine();
            System.out.println("Enter Employee's Year of Birth (Enter year only!) ");
            int yb = sc.nextInt();
            System.out.println("Enter Employee's Month of Birth (Enter month only!) ");
            int mb = sc.nextInt();
            System.out.println("Enter Employee's Date of Birth (Enter date only!) ");
            int db = sc.nextInt();
            String dob = new String(db + "/" + mb + "/" + yb); 
            System.out.println("Enter Employee's monthly salary ");
            int ms = sc.nextInt();
            int as = (ms*12);
            System.out.println("Your Annual Salary is "+as);
            as = as/100000;
            System.out.println("Kindly enter this value "+as);
            as = sc.nextInt();
            String tax = new String();
                if (as>5) {
                    tax = "20%";
                }
                else if (as>4) {
                    tax = "15%";
                }
                else if (as>3) {
                    tax = "10%";
                }
                else if (as>2) {
                    tax = "5%";
                }
                else {
                    tax = "No Tax!";
                }
                sc.close();
            System.out.println("------Employee's Information------");
            System.out.println("Name of the Employee :" +name);
            System.out.println("Date of birth :" +dob);
            System.out.println("Annual Salary of the Employee :" +as);
            System.out.println("Tax to be payed by the Employee :" +tax);
    }
}
