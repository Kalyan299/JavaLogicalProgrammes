package scanner_Class;

import java.util.Scanner;

public class Pgm146_Check_Whether_The_Number_Is_Prime_Or_Not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = sc.nextInt();
		int count = 0;
		sc.close();
		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(no + " is a Prime Number");
		} else {
			System.out.println(no + " is not a Prime Number");
		}
	}
}
