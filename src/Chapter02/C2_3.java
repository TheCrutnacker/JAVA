package Chapter02;

import java.util.Scanner;

/**
 * Displays the cost of driving somewhere from the given driving distance, miles
 * per gallon you use, and the price per gallon
 *
 * @author Chase Holland
 */
public class C2_3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double gallons = distance / milesPerGallon;
        double costOfDriving = pricePerGallon * gallons;

        System.out.println("The cost of driving is $" + costOfDriving);
    }
}
