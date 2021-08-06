package eg1;

import java.util.Arrays;

public class ArraysClassDemo1 {

	public static void main(String[] args) {
		int ar1[]= {12,33,11,23,4,11,12,11,12,11};
		//System.out.println(ar1);
		
		System.out.println(Arrays.toString(ar1));
		Arrays.sort(ar1);
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.binarySearch(ar1,100));
		System.out.println(Arrays.binarySearch(ar1,12));
		System.out.println(Arrays.binarySearch(ar1,11));
		System.out.println(Arrays.binarySearch(ar1,4));
		int[] ar2=Arrays.copyOf(ar1,ar1.length+5);
		System.out.println(Arrays.toString(ar2));
		
		int[] ar3=Arrays.copyOfRange(ar1,1,6);
		System.out.println(Arrays.toString(ar3));
		Arrays.fill(ar3, -10);
	 System.out.println(Arrays.toString(ar3));
	 Arrays.fill(ar3, 0,2,-9000);
	 System.out.println(Arrays.toString(ar3));	
	
	
	}

}
