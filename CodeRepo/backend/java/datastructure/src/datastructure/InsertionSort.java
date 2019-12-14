package datastructure;

import java.time.Duration;
import java.time.Instant;

public class InsertionSort {
	  void qsort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=1; i<n; ++i) 
	        { 
	            int key = arr[i]; 
	            int j = i-1; 
	  
	            while (j>=0 && arr[j] > key) 
	            { 
	                arr[j+1] = arr[j]; 
	                j = j-1; 
	            } 
	            arr[j+1] = key; 
	        } 
	    } 
	  public static long addUptoQuick(int arr[]) { 
			return  1;
		}
		public static void countingDuration2(int arr[]) {
			int n = arr.length; 
			Instant start = Instant.now();
			//System.out.println("InsertionSort:"+addUptoQuick(arr.length));
			Instant end = Instant.now();
			long duration = Duration.between(start,end).toMillis();
			double seconds = duration / 1000.0;
			System.out.println("addUptoQuick time: "+seconds+" seconds ");
	}
	  void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
}
