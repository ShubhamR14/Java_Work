package com.sort;

import java.util.Arrays;

public class _3_InserstionTech {
	
	static void Insertion(int arr[]) {
		int temp=arr[arr.length-1];
		int j;
		for(j=arr.length-2;j>=0 && arr[j] >= temp;j--) {
			arr[j+1]=arr[j];
		}
		arr[j+1]=temp;
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,3,4,6,8,2};
		System.out.println("Before Insertion = "+Arrays.toString(arr));
		Insertion(arr);
		System.out.println("After Insertion = "+Arrays.toString(arr));
		
		}
	}


