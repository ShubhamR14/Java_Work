package com.search;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _3_Recursive_Binary_Search {

	public static int recursiveBinarysearch(int arr[],int left,int right,int key) {
		int mid,index;
		mid=(left+right)/2;
		if(right < left)
			return -1;
		
		
		if(key == arr[mid])
			return mid;
		
		if(key < arr[mid])
			index=recursiveBinarysearch(arr,left, mid-1, key);
		
		else
			index=recursiveBinarysearch(arr, mid+1, right, key);
		
		return index;

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[]= {88,22,33,66,11,99,44,77,55};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.print("Enter the key = ");
		int key=sc.nextInt();
		
		int index= recursiveBinarysearch(arr,0,arr.length-1,key);
		
		if(index != -1)
			System.out.println("Found at "+index);
		
		else
			System.err.println("Key not found");
	}

}
