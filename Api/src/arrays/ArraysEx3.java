package arrays;

import java.util.Arrays;

public class ArraysEx3 {

	public static void main(String[] args) {
		int arr[]= {37,21,56,99,98,77,55};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==56) {
				System.out.println(i+1);
				break;
			}
		}
		Arrays.sort(arr);
		int pos = Arrays.binarySearch(arr, 56);
		System.out.println(pos+1);
		
	}

}
