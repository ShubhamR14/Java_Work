package com.search;

import java.util.Scanner;

public class _1_Linear_Search_ {

	public static int linearsearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
				return i;
		}		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {99,88,33,44,55,11,22,77,66};
		
		System.out.print("Enter the Number = ");
		int key=sc.nextInt();
		
		int index=linearsearch(arr,key);
		if(index != -1) {
			System.out.println("Index Found at "+index);
		}
		else
		{
			System.err.println("Index not found");
		}
		
	}
}
