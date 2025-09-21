package coding.packagejava;
import java.util.Scanner;
 class maxmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 < num2) ? num1 : num2;
        System.out.println(max);
        System.out.println(min);
    }
    }



