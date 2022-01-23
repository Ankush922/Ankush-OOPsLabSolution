	package service;
	
	import java.util.Scanner;
	
	
	public class CurrencyDenomRunner 
	{
	
		public static void CurrencyDenomRunner1() 
		{
							
			System.out.println("Enter the size of currency denominations: ");
			Scanner sc = new Scanner(System.in);  
	                
	        //reading the number of elements from the that we want to enter  
	        int size = sc.nextInt();  
	        
	        //creates an array in the memory  
	        int[] notes = new int[size];
	        
	        System.out.println("Enter the currency denomination values: ");
	               
	        for(int i = 0; i < size; i++)  
	        {  
	            //reading array elements from the user   
	            notes[i] = sc.nextInt();  
	        }  
	        
	        //Sorting array using Bubble sort
	        BubbleSort.performBubbleSort(notes);
	        	        
	        System.out.println("Enter the amount you want to pay: ");
	        
	        int amount = sc.nextInt();
	       
	        //Calculate minimum number of notes have to pay
	        CountTheNotes.countTheNotesImplementation(notes, amount);
	        
	        sc.close();
		}
	}