package packagejava;

import java.util.Scanner;

public class convertdaysyear {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int n = Scan.nextInt();
		int year = n / 365;
		int remaindays = n % 365;
		int month = remaindays / 30;
		int day = remaindays % 30;
		System.out.println(year + " years " + month + " months " + day + " days");

	}
}
