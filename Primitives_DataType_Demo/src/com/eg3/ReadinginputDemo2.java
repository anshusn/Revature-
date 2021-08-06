package com.eg3;
import java.util.Arrays;
import java.util.Scanner;
public class ReadinginputDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array: ");
		int n=Integer.parseInt(sc.nextLine());
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++) {
			//arr[i]=sc.nextInt();
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		System.out.println("the contents of array is: ");
		System.out.println(Arrays.toString(arr));
		
	}

}
