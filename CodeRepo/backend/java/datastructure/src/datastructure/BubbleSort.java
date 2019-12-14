package datastructure;

import java.time.Duration;
import java.time.Instant;

public class BubbleSort {
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}
	
	public static void countingDuration2(int arr[]) {
		int n = arr.length;
		Instant start = Instant.now();
		//System.out.println("addUpto:"+bubbleSort(arr.length));
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
