package com.app.sunbeam.q5;

public class Tester {
public static void selectionSort(Employee arr[], int size) {
		
		for (int i = 0; i < size; i++) {
			
			for (int j = i+1; j < size; j++) {
				
				if (arr[i].getSalary() > arr[j].getSalary()) {
				Employee e = arr[i];
				arr[i] = arr[j];
				arr[j] = e;
				
				}	
			}	
		}
}
		
	public static void main(String[] args) {

		Employee[] emp = new Employee[6];
		emp[0] = new Employee(1, "Sarthak", 100000.00);
		emp[1] = new Employee(2, "Pragati", 90000.00);
		emp[2] = new Employee(3, "Vishal", 80000.00);
		emp[3] = new Employee(4, "Sonu", 70000.00);
		emp[4] = new Employee(5, "Pinuk", 60000.00);
		emp[5] = new Employee(6, "Rajveer", 50000.00);
        selectionSort(emp, emp.length);
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i]);
		
	}
}
}