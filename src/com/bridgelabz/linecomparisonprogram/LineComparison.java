package com.bridgelabz.linecomparisonprogram;

public class LineComparison {

	public static void main(String[] args) {
		
		//Enter the co-ordinates of point 1 of (x1,y1) of line 1
		double x1 = 2.0;
		double y1 = 3.0;
		//Enter the co-ordinates of point 2 of (x2,y2) of line 1
		double x2 = 4.0;
		double y2 = 7.0;
		
		//Enter the co-ordinates of point 1 (x3,y3) of line 2
		double x3=3.0;
		double y3=2.0;
		//Enter the co-ordinates of point 2(x4,y4) of line 2
		double x4=7.0;
		double y4=4.0;
		
		// calculate the length of the line segment
		double lengthOne = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double lengthTwo = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		
		// compare the lengths of the lines
		if (lengthOne == lengthTwo) {
			System.out.println("The length of line one is equal to the length of line two");
		}
		else if (lengthOne > lengthTwo) {
			System.out.println("The length of line one is greater than the length of line two");
		}
		else {
			System.out.println("The length of line one is less than the length of line two");
		}

	}
}
