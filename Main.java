import java.util.Random;

/*   
Assignment 4 
Name: Mariam Jael Caceres Lopez 
Student ID: 261059724 
Class: CCCS 315 - 764            */

public class Main {

	public static void main(String[] args) {
	
		 Random rd = new Random(); // creating Random object	 
		 
	     System.out.println("\n************************************************ Testing Merge Sort ************************************************\n");
	     
	     //3) Testing Merge Sort with small numbers
	     MergeSort sort1 = new MergeSort();
		 int[] smallArray1 = new int[10];
		 
		 System.out.println("Testing Merge Sort with 10 randoms numbers:");
		 System.out.println("\nUnsorted Array:");
		 
		 //1) storing random integers in an array
		 for (int i = 0; i < smallArray1.length; i++) {
			 smallArray1[i] = rd.nextInt(100); 
			 System.out.print(smallArray1[i]+" ");
	     }		
		 
		 //Timing Merge sort for small input
		 double startTime1 = System.nanoTime();
		 sort1.mergeSort(smallArray1, 0, smallArray1.length - 1);//calling sort method
		 double endTime1 = System.nanoTime();
	     double duration1 = (endTime1 - startTime1)/ 1000000;
	     
	     //Printing sorted array
		 System.out.println();
		 System.out.println("\nSorted Array:");
	     sort1.printing(smallArray1);
	     System.out.println();
	     
	     //printing duration time
	     System.out.println("\nTime to sort 10 random numbers using Merge Sort is: "+ duration1+" miliseconds");	
	     
		 
		 //Testing Merge Sort with 100 random numbers
	     int[] bigArray1 = new int[100];
		
	     System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
	     System.out.println("Testing Merge Sort with 100 random numbers:");
	     System.out.println("\nUnsorted Array:");
	     
	     //storing random integers in an array
		 for (int i = 0; i < bigArray1.length; i++) {
			 bigArray1[i] = rd.nextInt(100); 
			 System.out.print(bigArray1[i]+" ");
	     }
	     
		 //4) Timing Merge sort
		 startTime1 = System.nanoTime();
		 sort1.mergeSort(bigArray1, 0, bigArray1.length - 1);//calling sort method
		 endTime1 = System.nanoTime();
		 duration1=0;
	     duration1 = (endTime1 - startTime1)/ 1000000;
	     
	     //Printing sorted array
	     System.out.println();
	     System.out.println("\nSorted Array:");         
	     sort1.printing(bigArray1);
	     
	     //printing duration time
	     System.out.println();
	     System.out.println("\nTime to sort 100 random numbers using Merge Sort is: "+ duration1+" miliseconds");	
	     
	     //5) Running 10 times with diferent input and finding average time
	     
	     //We will create a for loop to run the sort method 10 times and we will create a variable total duration 
	     //to save all the duration time so we can calculate average
	     
	     double totalDuration=0;
	     duration1=0;
	     int[] temporaryArray = new int[100];
	     int counter=0;
		 	    
	     System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
	     System.out.println("Testing Merge Sort 10 times and finding average:\n");
	     
	     //To run sort method 10 times
	     for(int k=0; k<11;k++) {
	    	//To save 100 random integers in an array
		     for (int i = 0; i < temporaryArray .length; i++) {
		    	 temporaryArray[i] = rd.nextInt(100); 
				 //System.out.print(temporaryArray1 [i]+" ");
		     }
		  //Timming and calling sort method
		  startTime1 = System.nanoTime();
		     sort1.mergeSort(temporaryArray, 0, temporaryArray.length - 1);//calling sort method
		     endTime1 = System.nanoTime();
		     
		     //Finding duration, total duration and emptying temporary array
		     duration1 = (endTime1 - startTime1)/ 1000000;
		     totalDuration=totalDuration+duration1;
		     counter+=1;
		     temporaryArray=null;//to empty array
		     temporaryArray= new int[100];
	    	
		     //Printin
		     System.out.println("Time to Sort "+counter+": "+duration1+" miliseconds");
		     
	     }
	     System.out.println("\nAverage time: "+ (totalDuration/counter) +" miliseconds");
	  
	     System.out.println("\n************************************************ Testing Bubble Sort ************************************************\n");
	     
	     //3) Testing Bubble Sort with small numbers
	     BubbleSort sort2 = new BubbleSort();
		 int[] smallArray2 = new int[10];
		 
		 System.out.println("Testing Bubble Sort with 10 random numbers");
		 System.out.println("\nUnsorted Array:");
		 
		 //1) storing random integers in an array
		 for (int i = 0; i < smallArray2.length; i++) {
			 smallArray2[i] = rd.nextInt(100); 
			 System.out.print(smallArray2[i]+" ");
	     }		
		 
		 //Timing Bubble sort for small input
		 double startTime2 = System.nanoTime();
		 sort2.bubbleSort(smallArray2, smallArray2.length);;//calling sort method
		 double endTime2 = System.nanoTime();
	     double duration2 = (endTime2 - startTime2)/ 1000000;
		 
		 //Printing sorted array
		 System.out.println("\n\nSorted Array:");
	     sort2.printing(smallArray2);
	     System.out.println();
		 
	     //printing duration time
	     System.out.println("\nTime to sort 10 random numbers using Bubble Sort is: "+ duration2+" miliseconds");
	     
	     
		 //Testing Bubble Sort with 100 random numbers
	     duration2=0;
	     int[] bigArray2 = new int[100];
		 
	     System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
	     System.out.println("Testing Bubble Sort with 100 random numbers:");
	     System.out.println("\nUnsorted Array:");
	     
	     //storing random integers in an array
		 for (int i = 0; i < bigArray2.length; i++) {
			 bigArray2[i] = rd.nextInt(100); 
			 System.out.print(bigArray2[i]+" ");
	     }
	     
		 //4)Timing Bubble sort
		 startTime2 = System.nanoTime();
		 sort2.bubbleSort(bigArray2, bigArray2.length);;//calling sort method
	     endTime2 = System.nanoTime();
	     duration2 = (endTime2 - startTime2)/ 1000000;
	     
	     //Printing sorted array
	     System.out.println("\n\nSorted Array:");
	     sort2.printing(bigArray2);
	     
	     //printing duration time
	     System.out.println("\n\nTime to sort 100 random numbers using Bubble Sort is: "+ duration2+" miliseconds");
	   
	     //5) Running 10 times with diferent input and finding average time
	     
	     //We will create a for loop to run the sort method 10 times and we will create a variable total duration 
	     //to save all the duration time so we can calculate average
	     
	     counter=0;
	     totalDuration=0;
	     duration2=0;
	     temporaryArray=null;//to empty array
	     temporaryArray= new int[100];
		 	    
	     System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
	     System.out.println("Testing Bubble Sort 10 times and finding average:\n");
	     
	     //To run sort method 10 times
	     for(int k=0; k<11;k++) {
	    	//To save 100 random integers in an array
		     for (int i = 0; i < temporaryArray .length; i++) {
		    	 temporaryArray[i] = rd.nextInt(100); 
				 //System.out.print(temporaryArray1 [i]+" ");
		     }
		     //Timming and calling sort method
		     startTime2 = System.nanoTime();
		     sort2.bubbleSort(temporaryArray, temporaryArray.length);;//calling sort method
		     endTime2 = System.nanoTime();
		     
		     //Finding duration, total duration and emptying temporary array
		     duration2 = (endTime2 - startTime2)/ 1000000;
		     totalDuration=totalDuration+duration2;
		     counter+=1;
		     temporaryArray=null;//to empty array
		     temporaryArray = new int[100];
	    	
		     //Printing
		     System.out.println("Time to Sort "+counter+": "+duration2+" miliseconds");
		     
	     }
	     System.out.println("\nAverage time: "+ (totalDuration/counter)+" miliseconds");
	  
	     
	     System.out.println();
	     System.out.println("************************************************ Testing Quick Sort ************************************************");
	     System.out.println();
	     
	     //3) Testing Quick Sort with small numbers
	     QuickSort sort3 = new QuickSort();
		 int[] smallArray3 = new int[10];
		 
		 System.out.println("Testing QuickSort Sort with 10 random numbers");
		 System.out.println("\nUnsorted Array:");
		 
		 //1) storing random integers in an array
		 for (int i = 0; i < smallArray3.length; i++) {
			 smallArray3[i] = rd.nextInt(100); 
			 System.out.print(smallArray3[i]+" ");
	     }		
		 
		 //Timing Quick sort for small input
		 double startTime3 = System.nanoTime();
		 sort3.quickSort(smallArray3, 0, smallArray3.length-1);//calling sort method
		 double endTime3 = System.nanoTime();
	     double duration3 = (endTime3 - startTime3)/ 1000000;
		 
		 //Printing sorted array
		 System.out.println("\n\nSorted Array:");
	     sort3.printing(smallArray3);
	     System.out.println();
	     
	     //printing duration time
	     System.out.println("\nTime to sort 10 random numbers using Quick Sort is: "+ duration3+" miliseconds");
		 
		 //Testing Merge Sort with 100 random numbers
	     int[] bigArray3 = new int[100];
	     duration3=0;
		 
	     System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
	     System.out.println("Testing Quick Sort with 100 random numbers:");
	     System.out.println("\nUnsorted Array:");
	     
	     //storing random integers in an array
		 for (int i = 0; i < bigArray3.length; i++) {
			 bigArray3[i] = rd.nextInt(100); 
			 System.out.print(bigArray3[i]+" ");
	     }
	     
		 //4) Timing Quick sort
		 startTime3 = System.nanoTime();
		 sort3.quickSort(bigArray3, 0, bigArray3.length-1);;//calling sort method
		 endTime3 = System.nanoTime();
	     duration3 = (endTime3 - startTime3)/ 1000000;
	     
	     //Printing sorted array
	     System.out.println();
	     System.out.println("\nSorted Array:");
	     sort3.printing(bigArray3);
	     
	     //printing duration time
	     System.out.println();
	     System.out.println("\nTime to sort 100 random numbers using Quick Sort is: "+ duration3+" miliseconds");
	     
         //5) Running 10 times with diferent input and finding average time
	     
	     //We will create a for loop to run the sort method 10 times and we will create a variable total duration 
	     //to save all the duration time so we can calculate average
	     
	     counter=0;
	     totalDuration=0;
	     duration3=0;
	     temporaryArray=null;//to empty array
	     temporaryArray= new int[100];
		 	    
	     System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
	     System.out.println("Testing Quick Sort 10 times and finding average:\n");
	     
	     //To run sort method 10 times
	     for(int k=0; k<11;k++) {
	    	//To save 100 random integers in an array
		     for (int i = 0; i < temporaryArray .length; i++) {
		    	 temporaryArray[i] = rd.nextInt(100); 
				 //System.out.print(temporaryArray1 [i]+" ");
		     }
		     //Timming and calling sort method
		     startTime3 = System.nanoTime();
		     sort3.quickSort( temporaryArray, 0, temporaryArray.length-1);;//calling sort method
		     endTime3 = System.nanoTime();
		     
		     //Finding duration, total duration and emptying temporary array
		     duration3 = (endTime3 - startTime3)/ 1000000;
		     totalDuration=totalDuration+duration3;
		     counter+=1;
		     temporaryArray=null;//to empty array
		     temporaryArray = new int[100];
	    	
		     //Printing
		     System.out.println("Time to Sort "+counter+": "+duration3+" miliseconds");
		     
	     }
	     System.out.println("\nAverage time: "+ (totalDuration/counter) +" miliseconds");
	}
}


//2) Create 3 sorting methods 
//Avoid heap sort(heapify) , avoid insertion sort, and selection sort

//Reference: class notes and https://www.youtube.com/watch?v=4VqmGXwpLqc to better understand the algorithms, I used the pseudocode given i n the video as 
//a guide for my code
/**
 * Merge Sort Class  
 * Time O(n logn) 
 * Space O(n) because copying a new array and merge them needs extra memory
 * It will break an array in smaller parts and sort them then merge them, 
 * this procedure continues until the array is sorted
 * @author MariamJael
 *
 */
class MergeSort{
	
	/**
	 * Method that will merge two subarrays based on the given parameters to get the sorted subarray
	 * @param array
	 * @param leftPartition
	 * @param middle
	 * @param rightPartition
	 */
	void merge(int array[], int startingIndex, int middleIndex, int endingIndex)
    {
		
		//Finding the sizes of the left and right subarrays
        int leftPartitionSize =  middleIndex - startingIndex + 1;                   
        int rightPartitionSize = endingIndex -  middleIndex;                      
      
        //Creating left and right subarray
        int LeftPartition[] = new int[leftPartitionSize];                            
        int RightPartition[] = new int[rightPartitionSize];
 
        //Now We will copy the corresponding elements into its respective subarrays
        
        //For the left partition
        for (int i = 0; i < leftPartitionSize; i++)                               
        {
        	LeftPartition[i] = array[startingIndex + i];
        }
        
        //For the right partion
        for (int j = 0; j < rightPartitionSize; j++)                              
        {
        	RightPartition[j] = array[ middleIndex + 1 + j];
        }
        
         
        int k = startingIndex;    
        //setting loop varibales i & j to 0 again
        int i = 0;                                             
        int j = 0;
        
        //Merging left and right partitions
        while (i < leftPartitionSize && j < rightPartitionSize)                    
        {
            if (LeftPartition[i]<=RightPartition[j]) 
            {
            	array[k] = LeftPartition[i];
                i++;
            }
            else 
            {
            	array[k] = RightPartition[j];
                j++;
            }
            k++;
        }
        
        //Merging the remaining elements form the right partition
        while (j < rightPartitionSize)                           
        {
        	array[k] = RightPartition[j];
            j++;
            k++;
        }
        
        //Merging the remaining elements from the left partition
        while (i < leftPartitionSize)                             
        {
        	array[k] = LeftPartition[i];
            i++;
            k++;
        }
 
       
    }
 
    /**
     * It will find the middle of the array and split the array in two portions
     * It will sort left subarray and then right subarray using recursion
     * then it calls merge method to merge both halfs
     * sorted subarrays
     * @param array
     * @param left
     * @param right
     */
    void mergeSort(int array[], int startingIndex, int endingIndex)       
    {
        int middle;
        
        //It will sort when startingIndex is less than endingIndex(sorting is done)
        if (startingIndex < endingIndex) {                            
            middle = (startingIndex + endingIndex) / 2;
 
            mergeSort(array, startingIndex, middle);//left partition
            mergeSort(array, middle + 1, endingIndex);//right partition
 
            merge(array, startingIndex, middle, endingIndex);//merging both partitions in a sorted way               
        }
    }
   
    /**
     * Showing the array 
     * @param arr
     */
    void printing(int arr[])                 
    {  
        for (int i=0; i<arr.length; ++i) 
        {
            System.out.print(arr[i]+" ");
        } 
    } 

	
}

 //Reference: class notes and https://www.softwaretestinghelp.com/bubble-sort-java/
/*
 * Bubble Sort Class  
 */
class BubbleSort{
	
	/**
	 * Method that performs the sorting
	 * @param array
	 * @param arrayLength
	 */
	void bubbleSort(int array[], int arrayLength)
    {                                       
        if (arrayLength == 1) //when iterations are done                   
        {
            return;
        }
        //going through the unsorted elements    
        for (int i=0; i<arrayLength-1; i++)   
        {
        	//checking if the elments are in the correct order if not it will swap them  
            if (array[i] > array[i+1])
            {                           
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        //one iteration is done now it will continue with the next one
        bubbleSort(array, arrayLength-1);           
    }

	/**
	 * Method that will print the array
	 * @param array
	 */
    void printing(int array[])                 
    {  
        for (int i=0; i<array.length; ++i) 
        {
            System.out.print(array[i]+" ");
        } 
    } 
     
	
}

//Reference: class notes and https://www.softwaretestinghelp.com/quicksort-in-java/ used to understanbetter the algorithms
/**
 * Choose an element as a pivot
 * Partitioning: elements smaller than pivot will be moved to left and high than pivot will be moved to the right
 * In my code the pivot will be the last element of the array
 * These steps will be repeated for the right partition and the left partition (finding a pivot which is the last element and partition array as we did before)
 * We will use recursion for the above
 * @author MariamJael
 *
 */
class QuickSort{

	/**
	 * Helper Method that will swap elements
	 * @param arr
	 * @param i
	 * @param j
	 */
	void swap(int[] array, int i, int j)
	{
	    int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}
	
	/**
	 * This method will place the pivot and moves 
	 * the smaller elements than pivot to the left and higher elements 
	 * than pivot to the right of the pivot
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	int partition(int[] array, int lowIndex, int highIndex)
	{
	     
	    // pivot is the last element of the array
	    int pivot = array[highIndex];
	     
	    // Index of smaller element 
	    int i = (lowIndex - 1);
	 
	    for(int j = lowIndex; j <= highIndex - 1; j++)
	    {
	    	//If the elements is smaller than our pivot
	        if (array[j] < pivot)
	        {            
	          //Index of smaller element will increase
	          i++;
	          swap(array, i, j);
	        }
	    }
	    swap(array, i + 1, highIndex);
	    return (i + 1);
	}
	
	 
	/**
	 * To do the recursive quicksort with the correct index of the subarrays (range) given as parameters
	 * @param array
	 * @param lowIndex
	 * @param highIndex
	 */
	void quickSort(int[] array, int lowIndex, int highIndex)
	{
	    if (lowIndex < highIndex)
	    {
	         //this is the partition index
	        int partitionIndex = partition(array, lowIndex, highIndex);
	 
	        //Using recursion we will sort the left and right partition
	        quickSort(array, lowIndex, partitionIndex - 1);
	        quickSort(array, partitionIndex + 1,highIndex);
	    }
	}
	
	/**
	 * Method to print an array
	 * @param array
	 */
	 void printing(int array[])     
	{		
		for (int i=0; i<array.length; ++i) 
        {
            System.out.print(array[i]+" ");
        } 
		
		
	    
	}
}