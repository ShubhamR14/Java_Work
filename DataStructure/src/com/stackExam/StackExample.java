package com.stackExam;

import java.util.Scanner;

public class StackExample //class
{
	//Componensts or parts
	int stack[] ,tos,Maxsize;
	
	void createStack(int size)
	{
		//create array 
		stack =new int[size];
		
		//init Maxsize
		Maxsize=size;
		
		//init tos
		tos = -1;
	
	}
	
	void push(int e)
	{
		tos++;
//		System.out.println("Position = "+tos);
		stack[tos]=e;				//Stack is the name of the array
	}
	
	int pop() {
		int temp=stack[tos];//copy old data
		tos--;			//reduce tos
		return (temp);
	}
	
	boolean is_full()
	{
		if(tos==Maxsize-1)
			return true;
		
		else
			return false;
	}
	
	
	int peek() {
		return(stack[tos]);
	}
	
	boolean is_empty() {
		if(tos== -1)
			return true;
		else
			return false;
	}
	
	void printstack() {
//		for(int i=tos;i>-1;i++) // without 
		for(int i=tos;i>=0;i--)
			System.out.print(stack[i]+" ");
	}

	public static void main(String[] args) {

		StackExample obj= new StackExample();
		Scanner in=new Scanner(System.in);
		int choice;
		System.out.print("Enter the size of the stack :");
		int size=in.nextInt();
		obj.createStack(size);
		
		do 
		{
			System.out.println("\n 1.Push\n 2.Pop\n 3.Peek\n 4.Print\n 0.Exit");
			choice=in.nextInt();
			
			switch (choice) {
			case 1://PUSH
					if(obj.is_full() != true) 
					{
						System.out.print("Enter the element:");
						int e=in.nextInt();
						obj.push(e);
					}
					else
						System.err.println("Stack is Full");
				break;
				
				
			case 2://POP
				if(obj.is_empty() != true)
				{
					System.out.println("Element POP : "+obj.pop());
//					int j=in.nextInt();
//					obj.pop();
				}
				else
					System.out.println("Stack is empty");
				break;
				
			case 3://PEEK
				if(obj.is_empty() != true) {
				System.out.println("Element Pop "+obj.peek());
				}
				else {
					System.out.println("Stack is Empty from PEEK side");
				}
				break;
				
			case 4://PRINT
				if(obj.is_empty()!= true) {
					System.out.println("Element in Stack");
					obj.printstack();
					
				}
				else {
					System.out.println("Stack is empty from PRINT side");
				}
				break;
				
			case 0:
				System.out.println("Code by Shubham");
				break;
				
			default:
				System.out.println("Wrong input :");
				break;
			
			}
			
		}while(choice!=0);
		
	}
	
}
