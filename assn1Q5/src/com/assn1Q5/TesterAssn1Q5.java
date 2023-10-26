package com.assn1Q5;

//5. find the first non-repeating element:
//Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }
//Ouput: 3
public class TesterAssn1Q5 {
	public static int firstNonRepeatingElement(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {

				if(i!=j) {
					if (arr[i] == arr[j]) {
						count++;
					} // if
				}
				

			} // l loop
			if (count == 0) {
				return arr[i];
			}
			count = 0;
		} // i loop
		return -1;
	}

	public static void main(String[] args) {
		// int arr[] = { 1, 2, 9,3,3, -1, 2, 1,9,0, 4, -1, 7, 8 };
		int arr[] = { 1, 2, 10, 0, -1, 2, 1, 0,  -1, 14, 14, 50,10, 7, 8 };
		System.out.println("Non repeating element : " + firstNonRepeatingElement(arr));
	}// main

}// class
