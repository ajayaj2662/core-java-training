package com.day1;
import java.util.Scanner;
public class Calculator {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			boolean loop = true;

			String exitcondition;

			
			while (loop) {
				System.out.println("Enter first number:");
				int Number1 = scan.nextInt();
				
				System.out.println("Enter second number");
				int Number2 = scan.nextInt();
				
				System.out.println(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Exit\n");
				
				System.out.println("enter a choice:");
				
				int choice = scan.nextInt();

				switch (choice) {
				case 1: {

					System.out.println("The Addition is:" + (Number1 + Number2));
				}
					break;
				case 2: {

					System.out.println("The subtarction is:" + (Number1 - Number2));
				}
					break;
				case 3: {

					System.out.println("The Multiplication is:" + (Number1 * Number2));
				}
					break;
				case 4: {

					System.out.println("The Division is:" + (Number1 / Number2));
				}
					break;
				case 5: {
					System.out.println("thankyou.....");
					//loop = false;
					return;
				}

			}
			}
		}

	}
