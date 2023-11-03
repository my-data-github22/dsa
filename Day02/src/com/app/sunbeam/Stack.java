package com.app.sunbeam;

public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) {
		SIZE = size;
		arr = new int[size];
		top = size;
	}
	
	public void push(int data) {
		top--;
		arr[top] = data;
	}
	
	public int pop() {
		int data = arr[top];
		top++;
		return data;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == SIZE;
	}
	
	public boolean isFull() {
		return top == 0;
	}

}
