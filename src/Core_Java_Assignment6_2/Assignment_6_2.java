package Assignment_6;																		
import java.util.Scanner;																	

public class Assignment_6_2 {																
	public static Scanner sc = new Scanner(System.in);										
	public static void main(String[] args) {												
		System.out.print("Enter Your Age : ");												
		int age = sc.nextInt();         													
			try																				
				{ if(age < 0)																
					{ throw new NegativeAgeException("Age Can't be Negative"); }   			
				}																			
			catch(NegativeAgeException ex){													
	System.out.println(ex); }  																							
	}																						
}																							
