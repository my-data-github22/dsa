package com.app.sunbeam;

import java.util.Scanner;

public class tester {
	public static int empIdSearch(Employee emp[], int size,int key) {
		for(int i=0;i<size;i++) {
			if(emp[i].getEmpid()== key)
				return i;
		}
		return -1;
	}
	public static int empNameSearch(Employee emp[], int size,String key) {
		for(int i=0;i<size;i++) {
			if(emp[i].getName().equals(key))
				return i;
		}
		return -1;
	}
	public static int empSalarySearch(Employee emp[], int size,double key) {
		for(int i=0;i<size;i++) {
			if(emp[i].getSalary()==key)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Employee[] emp= new Employee[6];
		emp[0]= new Employee(1,"Sarthak",100000.00);
		emp[1]= new Employee(2,"Pragati",90000.00);
		emp[2]= new Employee(3,"Vishal",80000.00);
		emp[3]= new Employee(4,"Sonu",70000.00);
		emp[4]= new Employee(5,"Pinuk",60000.00);
		emp[5]= new Employee(6,"Rajveer",50000.00);
		
		Scanner sc= new Scanner(System.in);
		//empid
		System.out.print("Enter the Emp id to be searched- ");
		int key1= sc.nextInt();
		
		int index1 =empIdSearch(emp, emp.length, key1);
		if(index1!=-1)
			System.out.println("Employee Found at "+index1+"th index"+"\n"+emp[index1]);
		else
			System.out.println("Employee not found!!!");
		
		
		//name
		System.out.print("Enter the Emp Name to be searched-");
		String key2= sc.next();
		
		int index2 = empNameSearch(emp, emp.length, key2);
		if(index2!=-1)
			System.out.println("Employee Found at "+index2+"th index"+"\n"+emp[index2]);
		else
			System.out.println("Employee not found!!!");
		
		
		//salary
		System.out.print("Enter the Emp Salary to be searched-");
		double key3= sc.nextDouble();
		
		int index3 = empSalarySearch(emp, emp.length, key3);
		if(index2!=-1)
			System.out.println("Employee Found at "+index3+"th index"+"\n"+emp[index3]);
		else
			System.out.println("Employee not found!!!");
		
		sc.close();
	}

}
