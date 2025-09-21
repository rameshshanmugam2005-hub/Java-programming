package packagejava;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int size =  Scan.nextInt();
		int[] arr=new int[size];
		for (int i=0;i<size;i++){
			if(n%2==0)
			arr[i]=Scan.nextInt();
		}
		for (int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
			}
	}
}
