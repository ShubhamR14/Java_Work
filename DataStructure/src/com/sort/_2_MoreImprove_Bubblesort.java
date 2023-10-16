package com.sort;

import java.util.Arrays;

public class _2_MoreImprove_Bubblesort {
	
	 static void MoreImproBubble(int arr[]) {
		 int i,j,temp;
		 boolean swapflag;
		 for(i=0;i<arr.length-1;i++) {
			 swapflag=false;
			 for(j=0;j<arr.length-1-i;j++) {
				 if(arr[j] > arr[j+1]) {
					 temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 swapflag = true;
				 }
			 }
			 if(swapflag == false) {
				 break;
			 }
		 }
	 }
	
	
	public static void main(String[] args) {
		int arr[]= {1,3,4,6,8,2};
		System.out.println("Before Bubbler sort = "+Arrays.toString(arr));
		MoreImproBubble(arr);
		System.out.println("After Bubbler sort = "+Arrays.toString(arr));

		
	}
}
