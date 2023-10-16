package com.sort;

import java.util.Arrays;

public class _2_ImproveBubbleSort {
	
	static void Bubblesort(int[] arr) {
		int i,j;
		for(i=0;i<arr.length-1;i++) {
			for(j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {6,4,2,8,3,1};
		System.out.println("Before sort = "+Arrays.toString(arr));
		Bubblesort(arr);
		System.out.println("After sort = "+Arrays.toString(arr));

	}

}
