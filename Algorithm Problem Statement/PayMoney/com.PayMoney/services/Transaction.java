	package services;

	import java.util.Scanner;

	public class Transaction 
	{
		
		 public static void TransactionValue(int target, int size, int[] array)
		 {
			 
		        while(target-- !=0) 
		        {
		        	
		        	long targetval;
		        	
		        	Scanner sc1 = new Scanner(System.in);
		        	System.out.println("Enter the value of target: ");
		        	
		        	targetval = sc1.nextLong();
		        	
		        	
		        	long sum = 0;
		        	
		        		for(int i = 0; i < size; i++) 
		        		{
		        		
		        			sum = sum + array[i];
		        		
		        			if(sum >= targetval) 
		        			{
		        				System.out.println("Target achieved after " + (i+1) + " transaction ");		        			
		        				break;
		        			}
		        		}
		        		
		        			if(sum < targetval) 
		        			{
		        				System.out.println("Target is not achieved ");
		        			}
		
		        	}
			}
	
	}


