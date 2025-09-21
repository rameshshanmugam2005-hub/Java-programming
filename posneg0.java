package packagejava;

import java.util.Scanner;

public class posneg0 {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int n=Scan.nextInt();
		if(n>0)
			System.out.println("Positive Number");
		else if(n<0)
		System.out.println("Negative number");
		else if(n==0)
			System.out.println("zero");
	}
}
