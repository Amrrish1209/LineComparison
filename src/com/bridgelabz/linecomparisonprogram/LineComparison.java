package com.bridgelabz.linecomparisonprogram;

public class LineComparison {

	public static final double x1 = 2.0;
	public static final double y1 = 3.0;
	public static final double x2 = 4.0;
	public static final double y2 = 7.0;
	public static final double x3 = 7.0;
	public static final double y3 = 4.0;
	public static final double x4 = 3.0;
	public static final double y4 = 2.0;

	public static void calculate() {
		double lengthOne = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double lengthTwo = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		if (lengthOne == lengthTwo) {
			System.out.println("The length of line one is equal to the length of line two");
		} else if (lengthOne > lengthTwo) {
			System.out.println("The length of line one is greater than the length of line two");
		} else {
			System.out.println("The length of line one is less than the length of line two");
		}
	}

	public static void main(String[] args) {
		LineComparison.calculate();
	}
}
