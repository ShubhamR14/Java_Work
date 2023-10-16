package com.sort;

import java.util.Arrays;
import java.util.Scanner;

public class _1_Selection_Sort {
	
	public static void selectionsort(int []arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {6,4,2,8,3,1};
		
		System.out.println("Before sort = "+Arrays.toString(arr));
		selectionsort(arr);
		System.out.println("After sort = "+Arrays.toString(arr));
		
	}

}
