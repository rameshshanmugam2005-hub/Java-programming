package packagejava;

import java.util.Scanner;

public class divpro {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int n = Scan.nextInt();
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("Divisible by 3&5");
		} else
			System.out.println("not divisible by 3&5");

	}
}
