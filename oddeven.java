package packagejava;
import java.util.Scanner;
public class oddeven {
		public static void main(String[] args) {
			Scanner Scan = new Scanner(System.in);
			System.out.println("Enter a Number :");
			int n=Scan.nextInt();
			if(n%2==0) {
				System.out.println("Even Number");
			}
			else {
				System.out.println("Odd Number");
			}
			
		}
	}
