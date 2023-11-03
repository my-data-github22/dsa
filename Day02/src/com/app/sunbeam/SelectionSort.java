package com.app.sunbeam;

import java.util.Arrays;

public class SelectionSort {
		public static void selectionSort(int arr[],int N) {
			for (int i=0;i<N-1;i++) {
				for (int j=i+1;j<N;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
	public static void main(String[] args) {
		int arr[]= {22,66,44,11,33,55,77};
		System.out.println("Array before sort:"+Arrays.toString(arr));
		selectionSort(arr,arr.length);
		System.out.println("Array after sort:"+Arrays.toString(arr));

	}

}
