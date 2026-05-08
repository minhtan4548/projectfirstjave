package minhtan;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fist number: ");
		int firstnumber = scanner.nextInt();
		System.out.println("Second number: ");
		int secondnumber = scanner.nextInt();
		System.out.println("Min =  " + Math.min(firstnumber, secondnumber));

	}
}
