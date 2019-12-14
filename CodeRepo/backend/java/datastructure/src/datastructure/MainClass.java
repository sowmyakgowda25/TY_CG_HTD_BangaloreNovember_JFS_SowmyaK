package datastructure;

import java.util.Scanner;

public class MainClass {
	
	 
	public static void main(String[] args) {
		 {
			 Scanner sc = new Scanner(System.in);
			
		        SelectionSort ss = new SelectionSort();
		        BubbleSort bs = new BubbleSort();
		        MergeSort ms = new MergeSort();
		        InsertionSort is = new InsertionSort();
		        QuickSort qs = new QuickSort();

		        System.out.println("Enter the number of elements");
		        int n=sc.nextInt();
		        System.out.println("Enter the elements to be sorted");
		        int arr[]= new int[n];
		        for(int i=0;i<n;i++) {
		        	 arr[i]=sc.nextInt();
		        }
		     
		        
		        bs.bubbleSort(arr);
		        System.out.println("bubble sorting");
		      //  bs.countingDuration2();
		        bs.printArray(arr);
		        
		        
		        ss.sort(arr);
		        System.out.println("selection sorting");
		        //ss.countingDuration2();
		        ss.printArray(arr);
		        
		        is.qsort(arr);
		        System.out.println("Insertion sorting");
		       // is.countingDuration2();
		        is.printArray(arr);
		        
		        System.out.println("Quick sorting");
		        qs.partition(arr, 0, 0);
		        qs. printArray(arr); 
		        
		        System.out.println("merge sorting");
		        ms.sort(arr,0,arr.length-1);
		        ms.printArray(arr);
		        
		        
		    }
	}
}
