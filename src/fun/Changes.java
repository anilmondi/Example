package fun;

import java.util.Scanner;

public class Changes {
	
	@SuppressWarnings("resource")
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int n=sc.nextInt(),m=sc.nextInt(),k;
		k=m+n;
		System.out.println("Sum of 2 numbers is "+k);
	}

}
