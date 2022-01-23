	package service;
	
	public class BubbleSort 
	{
		//Sort an array in descending order using bubble sort
		public static void performBubbleSort(int[] array) 
		  {
		  
				int size = array.length; 
				int temp = 0;
		  		  
				for (int i = 0 ;i < size-1; i++) 
				{
		  
					for (int j = 0; j < (size-i-1); j++) 
					{ 
				  
						if (array[j] < array[j+1]) 
						{ 
					  
							temp = array[j]; 
							array[j] = array[j+1]; 
							array[j+1] = temp; 
						} 
					}
		 
				}
				
				System.out.println("Sorted array is");
				
				for (int i = 0 ;i < size; i++) 
				{ 
			  				  
					System.out.println(+array[i]);
			  
				}
		  	}
		}
