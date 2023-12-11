import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double temperatureC = 0;
        double temperatureF;
        String trash = "";

        do {
            System.out.println("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                temperatureC = in.nextDouble();
                temperatureF = (temperatureC * 9/5) + 32;

                System.out.println("Converted temperature in Fahrenheit: " + temperatureF);
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("That's not a valid input. Please enter a numeric value.");
            }
        } while (!done);
    }
}