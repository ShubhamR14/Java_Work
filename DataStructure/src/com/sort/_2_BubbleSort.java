package com.sort;

import java.util.Arrays;
import java.util.Scanner;

public class _2_BubbleSort {
	
	static void Bubblesort(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(arr));

		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {6,4,2,8,3,1};
		
		System.out.println("Before Sort = "+Arrays.toString(arr));
		Bubblesort(arr);
		System.out.println("After Sort = "+Arrays.toString(arr));
	}
	

}
