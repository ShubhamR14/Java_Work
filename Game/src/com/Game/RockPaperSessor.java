package com.Game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSessor {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.println("0 is for Rock");
		System.out.println("1 is for Paper");
		System.out.println("2 is for Scissor");
		System.out.println("----------------------------------");

		int Computer_choice;
		int ComputerWon=0;
		int my_choice;
		int me=0;
		
		System.out.print("How many time yout want to play this game = ");
		int num=sc.nextInt();
		int game=1;
		System.out.println();
		while(game<=num) {
			Random rand=new Random();
			Computer_choice=rand.nextInt(2);
			
			System.out.print("Rock Paper Scissor =");
			my_choice=sc.nextInt();
			
			switch(my_choice) {
				
			case 0:
				System.out.println("You choose Rock");
				break;
			
			case 1:
			System.out.println("You choose Paper");
			break;
			
			case 2:
			System.out.println("You choose Scissor");
			break;
			
			default:
				System.err.println("Enter proper number");
	}
			
			switch(Computer_choice) {
			case 0:
				System.out.println("Computer choose Rock");
				break;
			
			case 1:
			System.out.println("Computer choose Paper");
			break;
			
			case 2:
			System.out.println("Computer choose Scissor");
			break;
			}
			
			if(Computer_choice == my_choice) { 
				System.out.println("Match is Tie");
			}
			
			else if(Computer_choice==0 && my_choice==1) {		
				System.err.println("I Won");
				me++;
			}
			
			else if(Computer_choice==0 && my_choice==2) {
				System.out.println("Computer Won");
				ComputerWon++;
			}
			
			else if(Computer_choice==1 && my_choice==0) {
				System.out.println("Computer Won");
				ComputerWon++;
			}
			
			else if(Computer_choice==1 && my_choice==2) {
				System.err.println("You Won");
				me++;
			}
			else if(Computer_choice==2 && my_choice==0) {
				System.err.println("You Won");
				me++;
			}
				
			else if(Computer_choice==2 && my_choice==1) {
				System.err.println("Computer Won");
				ComputerWon++;
			}
			if(game == 5) {
				break;
			}
			game++;

		}
		System.out.println("---------------------------------------------");
		System.out.println("Computer Score ="+ComputerWon);
		System.out.println("You Score = "+me);
		
		System.out.println("---------------------------------------------");
		
		if(ComputerWon > me) {
			System.out.println("Computer Won");
		}
		else if(ComputerWon < me) {
			System.out.println("You won the game");
		}
		else {
			System.out.println("Its tie ! Play Again");
		}
		
	}

}








