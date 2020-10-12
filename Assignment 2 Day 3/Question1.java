// LetsUpgrade Java Essentials October 2020
// Assignment Day 3 | 10th October 2020
// Questions 1:
// Take 5 subjects marks each subject 100 marks;
// calculate the percentage;
// based on the percentage print the grade and the percentage;

import java.util.Scanner;

public class Question1{
        public static void main(String args[]) {
            float percent;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Mark1 : ");
            int m1 = sc.nextInt();
            System.out.println("Enter your Mark2 : ");
            int m2 = sc.nextInt();
            System.out.println("Enter your Mark3 : ");
            int m3 = sc.nextInt();
            System.out.println("Enter your Mark4 : ");
            int m4 = sc.nextInt();
            System.out.println("Enter your Mark5 : ");
            int m5 = sc.nextInt();
            float scored = m1+m2+m3+m4+m5;
            System.out.println("Marks scored is : " +scored);
            float tot = 500;
            System.out.println("Total marks is : " +tot);
            percent = (float)((scored / tot) * 100);
            System.out.println("Percentage of marks is : " +percent);      

                    if(percent > 90 || percent == 100) {
                      System.out.println("Your Grade is A+");
                      System.out.println("Outstanding performance!!");
                    }

                    else if(percent > 80 || percent == 90) {
                      System.out.println("Your Grade is A");
                      System.out.println("Very Good!!");
                    }
                    
                    else if(percent > 70 || percent == 80) {
                        System.out.println("Your Grade is B+");
                        System.out.println("Good!!");
                      }

                    else if(percent > 60 || percent == 70) {
                        System.out.println("Your Grade is B");
                        System.out.println("Nice try!!");
                      }  
                    
                    else if(percent > 50 || percent == 60) {
                        System.out.println("Your Grade is C+");
                        System.out.println("Try to score more!!");
                      }  

                    else if(percent >= 40 || percent == 50) {
                        System.out.println("Your Grade is C");
                        System.out.println("You are just passed!!");
                      }  
                    
                    else {
                        System.out.println("Your Grade is F");
                        System.out.println("You are Failed!!");
                        System.out.println("Better luck next time!!");
                      }   
        }
}