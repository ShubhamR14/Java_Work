package com.sort;

import java.util.Arrays;

public class _3_Insertionsort {
	
	public static void Insertion(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
		int temp=arr[i],j;
		for(j=i-1;j>=0 && arr[j] > temp;j--) {
			arr[j+1]=arr[j];
		}
		arr[j+1]=temp;
		}
	}
		
	
	public static void main(String[] args) {
		int arr[]= {6,4,2,8,3,1};
		System.out.println("Before Insertion = "+Arrays.toString(arr));
		Insertion(arr);		
		System.out.println("After Insertion = "+Arrays.toString(arr));

	}

}
