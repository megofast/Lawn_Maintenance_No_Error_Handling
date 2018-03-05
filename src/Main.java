import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String userInput;

        // Ask the user to select commercial or residential
        System.out.println("1. Commercial Customer");
        System.out.println("2. Residential Customer");
        userInput = scan.nextLine();

        // Create objects based on the users choice
        if (Double.valueOf(userInput) == 1) {
            Commercial customer1 = new Commercial();

            // Get all the data from the user
            System.out.print("What is the companies Name: ");
            customer1.setName(scan.nextLine());
            System.out.print("What is the companies phone number: ");
            customer1.setPhone(scan.nextLine());
            System.out.print("What is the companies address: ");
            customer1.setAddress(scan.nextLine());
            System.out.print("What is the property name: ");
            customer1.setPropertyName(scan.nextLine());
            System.out.print("What is the square footage of the property: ");
            customer1.setSquareFootage(Double.valueOf(scan.nextLine()));

            System.out.print("Are there multiple properties? Y or N: ");
            userInput = scan.nextLine();

            // Check whether or not the user entered y for yes ignoring the case
            if (userInput.equalsIgnoreCase("y")) {
                customer1.setMultiProperty(true);
            } else {
                customer1.setMultiProperty(false);
            }

            customer1.weeklyCharge();

        } else if (Double.valueOf(userInput) == 2) {
            Residential customer1 = new Residential();

            // Get all the data from the user
            System.out.print("What is the customer Name: ");
            customer1.setName(scan.nextLine());
            System.out.print("What is the customer phone number: ");
            customer1.setPhone(scan.nextLine());
            System.out.print("What is the customer address: ");
            customer1.setAddress(scan.nextLine());
            System.out.print("What is the square footage of the property: ");
            customer1.setSquareFootage(Double.valueOf(scan.nextLine()));

            System.out.print("Senior discount? Y or N: ");
            userInput = scan.nextLine();

            // Check whether or not the user entered y for yes ignoring the case
            if (userInput.equalsIgnoreCase("y")) {
                System.out.println("Inside");
                customer1.setSenior(true);
            } else {
                System.out.println("Bottom");
                customer1.setSenior(false);
            }

            customer1.weeklyCharge();
        } else {
            System.out.println("Error, invalid input");
        }
    }
}
