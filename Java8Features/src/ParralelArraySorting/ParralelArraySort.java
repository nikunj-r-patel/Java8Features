package ParralelArraySorting;

import java.util.Arrays;

public class ParralelArraySort {
	public static void main(String[] args) {
	int [] arr= {9,4,5,7,2,1,3,8,6};
	for (int num : arr) {
		System.out.println(num);
	}
	System.out.println("---After Sorting-----");
	Arrays.parallelSort(arr);
	for (int i : arr) {
		System.out.println(i);
	}
	System.out.println("---After Sorting---index 0 to 5--");
	Arrays.parallelSort(arr,0,5);
	for (int i : arr) {
		System.out.println(i);
	}
	}
}
