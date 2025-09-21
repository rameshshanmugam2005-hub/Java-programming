package coding.packagejava;
import java.util.Scanner;
public class CustomerGrouping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter gender code (1 for Male, 2 for Female): ");
        int genderCode = scanner.nextInt();
        if (genderCode == 1) {
            if (age < 25) {
                System.out.println("Group 1");
            } else if (age >= 25 && age <= 45) {
                System.out.println("Group 3");
            } else {
                System.out.println("Group 5");
            }
        } else if (genderCode == 2) { 
            if (age < 25) {
                System.out.println("Group 2");
            } else if (age >= 25 && age <= 45) {
                System.out.println("Group 4");
            } else {
                System.out.println("Group 5");
            }
        } else {  
            System.out.println("Invalid");
        }
    }
}

