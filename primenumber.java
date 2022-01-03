package sample;
import java.util.Scanner;
public class primenumber
{
	public static void  main(String args[])     
	{     
	      int number, s, e;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Please enter a number: ");
	      number = sc.nextInt(); 
	      s = 1;
	      e = 0; 
	      while(s <= number)
	      {
	         if((number % s) == 0) 
	            e = e + 1;
	         s++;
	      }
	      if(e == 2)
	      {
	         System.out.println(number + " is a prime number.");
	      }
	      else
	      {
	         System.out.println(number + " is not a prime number.");
	      }
	      sc.close();
	  }
}


