package sample;
import java.util.*;
import java.util.Scanner;
public class repeatingnumber 
{
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        int n;          
        System.out.println("Enter the length of the array");
        n=sc.nextInt();  
        
        int arr[]=new int[n];     
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();     
        }
        
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < n; i++) { 
            if (arr[i] > max) 
                max = arr[i]; 
        } 
  
        int brr[] = new int[max + 1];     
        for (int i = 0; i < n; i++) 
        { 
             
            brr[arr[i]]++; 
        } 
        
         System.out.println("Element  Frequency ");
        for (int i = 0; i <= max; i++) { 
             
            if (brr[i] >= 1) 
                System.out.println("   " + i + "        " + brr[i]); 
        } 
    } 
}

	
	