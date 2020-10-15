// LetsUpgrade Java Essentials October 2020
// Assignment Day 4 | 13th October 2020
// Question 3:
// Create an int array of size 5. Take all the values from the user, add all the values and print the sum.

import java.util.Scanner;
public class Question3 {
   public static void main(String args[]){
      
      Scanner s = new Scanner(System.in);
      int sum=0;
      int myArray[] = new int [5];
      System.out.println("Enter the elements of the array one by one ");

      for(int i=0; i<5; i++){
         myArray[i] = s.nextInt();
         sum = sum + myArray[i];
      }
      
      System.out.println("Sum of the elements in the array is "+sum);
   }
}
