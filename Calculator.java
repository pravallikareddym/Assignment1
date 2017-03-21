package testSample;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner pravali = new Scanner(System.in);
		double fnum,snum,answer;
		System.out.println("Enter first num:");
		fnum = pravali.nextDouble();
		System.out.println("Enter second  num:");
		snum = pravali.nextDouble();
		answer = fnum + snum ;
		System.out.println(answer);
	}

}
