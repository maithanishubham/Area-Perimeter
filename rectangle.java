package com.Bridgelabz;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int l = 0;
		int b = 0;
		int area = 0;
		int perimeter = 0;
		
		System.out.println("Enter the Length : ");
		l = scanner.nextInt();
		
		System.out.println("Enter the Breadth : ");
		b = scanner.nextInt();
		
		area = l * b;
		perimeter = 2 * ( l + b );
		
		System.out.println("The Area of Rectangle is : " + area);
		System.out.println("The Perimeter of Rectangle is : " + perimeter);
		
	}
			

}


