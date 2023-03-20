package com.bridgelabz.linecomparisonprogram;

public class LineComparison {

	public static void main(String[] args) {

		double x1 = 2.0;
		double y1 = 3.0;
		double x2 = 4.0;
		double y2 = 7.0;

		// calculate the length of the line segment
		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		// print out the result
		System.out.println("The length of the line segment is: " + length);

	}
}
