package service;

public class CountTheNotes 
{

	public static void countTheNotesImplementation(int notes[], int amount) 
	{
		
		if(amount==0)
			return;
		
		int[] notesCounter = new int[notes.length];
		
		try 
		{
			for(int i=0; i < notes.length; i++)
			{
				if(amount==0)
					{
				
						System.out.println();
					}
			
					if(amount>=notes[i]) 
					{
						notesCounter[i] = amount / notes[i];
						amount = amount - notesCounter[i] * notes[i];
					}
			}
		
			if(amount > 0) 
			{
				System.out.println("Exact amount cannot be given with the highest denomination");
			}
			
			else 
			{
				System.out.println("Your payment approach in order to give min no of notes will be");
				
				for(int i = 0; i < notes.length; i++) 
				{
					
					if(notesCounter[i] != 0) 
					{
						System.out.println(notes[i] + ":" + notesCounter[i]);
					}
				}
			}  
		}
		catch(ArithmeticException e) 
		{
			System.out.println(e + "notes of denomination 0 is invalid");
		}
	}
}
	