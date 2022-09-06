package com.Bridgelabz;

import java.util.Scanner;

public class areaperimeter {

	public static void main(String[] args) {

		int b = 0;
		int h = 0;

		int area = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Base of triangle : ");
		b = scanner.nextInt();

		System.out.println("Enter the height of triangle : ");
		h = scanner.nextInt();

		area = (b * h) / 2;
		
		System.out.println("Enter sides : ");
		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		int s3 = scanner.nextInt();
		
		int perimeter = s1 + s2 + s3;

		System.out.println("The Area of Triangle is : " + area);
		System.out.println("The perimeter of Triangle is : " + perimeter);
		
	}

}
