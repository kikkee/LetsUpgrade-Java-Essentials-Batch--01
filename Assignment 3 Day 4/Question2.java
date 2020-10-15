// LetsUpgrade Java Essentials October 2020
// Assignment Day 4 | 13th October 2020
// Question 2:
// Create an int array with 5 values and print only odd values.

import java.util.*;
public class Question2 {
public static void main(String args[])
{
	int i,a[]={1,5,6,8,9};
	i=0;
	while(i<5)
	{
		if(a[i]%2!=0)
		{
			System.out.println("Odd number is "+a[i]);
		}
		i++;
	}
	
}
}
