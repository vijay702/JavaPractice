package problem1;

import java.util.Arrays;

public class BubbleSortinArray {

	public static void main(String[] args) {
	
		
		int arr[] = {2,4,1,5,3};
		System.out.println("Before Sorting Array" +Arrays.toString(arr));
		
		int n =arr.length;
		
		for(int i=0 ; i<=n-1;i++) {//number of passes
			
			
			for(int j =0; j<=n-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		

	}

}
