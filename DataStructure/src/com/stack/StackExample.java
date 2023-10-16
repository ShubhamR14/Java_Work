package com.stack;

import java.util.Scanner;

public class StackExample {

	int stack[],maxsize,tos;
	
	void stackExample(int size) {
		stack = new int[size];
		maxsize=size;
		tos=-1;
	}
	
	void push(int e) {
		tos++;
		stack[tos]=e;
	}
	
	boolean is_full() {
		if(tos == maxsize-1)
			return true;
		else
			return false;
	}
	
	int pop() {
		int temp=stack[tos];
		tos--;
		return temp;
	}

	int peek() {
		return stack[tos];
	}
	
	boolean is_empty() {
		if(tos == -1)
			return true;
		else
			return false;
	}
	
	void printstack() {
		for(int i=tos;i>=0;i--) {
			System.out.print(stack[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackExample obj=new StackExample();
		
		System.out.print("Enter the size of the Stack = ");
		int size=sc.nextInt();
		obj.stackExample(size);
		
		int choice;
		
		do {
			System.out.println("\n 1.Push \n 2.Pop \n 3.Peek \n 4.Printstack \n 0.Exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				if(obj.is_full() != true) {
					System.out.print("Enter the element = ");
					int e=sc.nextInt();
					obj.push(e);
				}
				else
					System.err.println("Stack is full");
				break;
				
			case 2://pop
				if(obj.is_empty() != true) {	// Means it is full or not check the condition
					System.out.println("Pop element is  ="+obj.pop());
				}
				else
					System.err.println("Stack is already empty");
				break;
				
			case 3://peek
				if(obj.is_empty() != true) {
					System.out.println("Upper element is "+obj.peek());
				}
				else
					System.err.println("Stack is empty");
				break;
			
			case 4://Print satack
				if(obj.is_empty() != true) {
					System.out.print("Stack has = ");
					obj.printstack();
				}
				else
					System.err.println("Stack is empty");
				break;
				
			case 0:
				System.out.println("Code is writen by shubham");
			break;
				
			default:
			System.out.println("Wrong output");
			break;
			}
			
		}while(choice != 0);
		
		
	}

}
