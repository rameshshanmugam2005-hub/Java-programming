package coding.packagejava;
import java.util.Scanner;
public class Mileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter beginning odometer reading: ");
        double beginningOdometer = scanner.nextDouble();
        System.out.print("Enter ending odometer reading: ");
        double endingOdometer = scanner.nextDouble();
        double distanceTraveled = endingOdometer - beginningOdometer;
        double remuneration = distanceTraveled * 25;
        System.out.println( distanceTraveled + remuneration);
    }
}

