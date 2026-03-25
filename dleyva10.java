
// Danya Leyva
import java.util.Scanner;

public class dleyva10 {
    public static void main(String[] args) {
        double radius;
        double height;
        double cylinderVolume;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the RADIUS of your cylinder: ");
        radius = keyboard.nextDouble();

        System.out.println("Enter the HEIGHT of your cylinder: ");
        height = keyboard.nextDouble();

        cylinderVolume = area(radius, height);

        System.out.println("The VOLUME of your cylinder is, " + cylinderVolume);

        keyboard.close();
    }

    static double area(double radius, double height) {
        double cylinderVolume = Math.PI * Math.pow(radius, 2) * height;
        return cylinderVolume;
    }
}
