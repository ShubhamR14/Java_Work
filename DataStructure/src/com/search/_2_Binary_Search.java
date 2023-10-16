package com.search;

import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;
import java.util.Scanner;

public class _2_Binary_Search {

	public static int Binarysearch(int arr[],int key)
	{
		int l=0,r=arr.length-1,mid;
		while(l <= r) {
		mid=(l+r)/2;
		
		if(arr[mid] == key)
			return mid;
		
		if(key < arr[mid])
			r=mid-1;
		
		else
			l=mid+1;
		}
		return -1;

	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {11,22,33,44,55,66,77,88,99};
		System.out.println(Arrays.toString(arr));
		
		System.out.print("Enter the key element = ");
		int key=sc.nextInt();
		
		int index=Binarysearch(arr,key);
		
		if(index != -1)
			System.out.println("Index element is "+index);
		
		else
			System.err.println("Key is not found");
	}

}
