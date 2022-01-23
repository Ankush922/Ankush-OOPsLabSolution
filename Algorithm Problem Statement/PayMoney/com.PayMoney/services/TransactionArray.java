		package services;
		
		import java.util.Scanner;
		
		public class TransactionArray 
		{
			public static void Array1()
			{
				
		        Scanner sc = new Scanner(System.in);  
		        System.out.println("Enter the size of transaction array: ");  
		        
		        //reading the number of elements from the that we want to enter  
		        int size = sc.nextInt();  
		        
		        //creates an array in the memory  
		        int[] array = new int[size];  
		        System.out.println("Enter the values of array: ");
		        
		        	for(int i = 0; i < size; i++)  
		        	{  
		        		//reading array elements from the user   
		        		array[i] = sc.nextInt();  
		        	}       
				
		        			        	
		        	BubbleSort.performBubbleSort(array);
		        
		        System.out.println("Enter the total number of target needs to be achieved: ");
		        int target = sc.nextInt();
		        		        
		        Transaction.TransactionValue(target, size, array);
		        
			}
		
		}

		
				
