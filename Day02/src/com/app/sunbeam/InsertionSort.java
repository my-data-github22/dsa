package com.app.sunbeam;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int arr[],int N) {
		int cnt=0;
		for(int i=1;i<N;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
				cnt++;
			}
			arr[j+1]=temp;
		}
		System.out.println("no.of comparison:"+cnt);
	}

	public static void main(String[] args) {
int arr[] = {22,33, 11, 66,55,44};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
