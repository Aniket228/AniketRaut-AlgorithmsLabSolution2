package com.lab2.practice;
import java.util.Scanner;
public class PayMoney {
	
	public static void main(String[] args) {
		
	int size;
	int transaction;
	int target;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the size of transaction array:");
		
		size = sc.nextInt();
		
		//Creating array to store all the numbers
		int array[] = new int[size];
		System.out.println("Enter the value of array:");
		
		//Loop to store each number in array
		for(transaction = 0; transaction < size; transaction++) 
		array[transaction] = sc.nextInt();
		System.out.println("Enter the total number of target that needs to be achieved");
		int t=sc.nextInt();
		for(int i=1; i<=t;i++) {
			System.out.println("Enter the number of target");		
		target = sc.nextInt();
		
		//Achieve our target
		int sum = 0;
		for (transaction = 0; transaction <size; transaction++) {
			sum = sum + array[transaction];
			if(sum>=target) {
				
				break;
			}
		}
		if (sum<target) {
			System.out.println("Target not achieved");
		}
		else
			System.out.println("Target achieved after " + (transaction+1) + " transactions");
		}
	}
	}
}