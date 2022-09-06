package com.Bridgelabz;

import java.util.Scanner;

public class areaperimeter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radious value : ");
		double r = scanner.nextDouble();
		double area = 3.14 * r * r;
		double perimeter = 2 * 3.14 * r;
		
		System.out.println("Area of a circle is : " + area);
		System.out.println("Perimeter of a circle is : " + perimeter);
		
	}

}
