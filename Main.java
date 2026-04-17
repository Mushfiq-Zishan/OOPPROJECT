import java.util.*;

// 1. ================= MAIN CLASS =================
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("--- Welcome to Railway Management System ---");

        // Passenger er shob details input
        System.out.println("\n--- Enter Your Details ---");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Age: ");
        int age;
        while (true) {
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                if (age > 0 && age <= 110) {
                    break; // Sothik age holei loop bondho hobe
                } else {
                    System.out.println("Error: Please enter a realistic age (1-110).");
                }
            } else {
                System.out.println("Error: Invalid input! Please enter a number.");
                sc.next(); // Bhul text-ta clear korar jonno
            }
        }
        sc.nextLine(); // Buffer clear

        Passenger p1 = new Passenger(name, email, phone, age);

        // Random Staff Selection
        RailwayStaff[] staffList = {
                new RailwayStaff("Mushfiq Zishan", 101),
                new RailwayStaff("Mohammad Abid", 102),
                new RailwayStaff("Saikat Das", 103),
                new RailwayStaff("Ragib Nur Nihal",104)

        };
        RailwayStaff assignedStaff = staffList[rand.nextInt(staffList.length)];
        System.out.println("\n[System]: Staff " + assignedStaff.getName() + " is processing your request.");

        // 3. Source Selection (4 Cities)
        System.out.println("\n--- Select Starting Point (Source) ---");
        System.out.println("1. Dhaka\n2. Chattogram\n3. Sylhet\n4. Rajshahi");
        System.out.print("Choice (1-4): ");
        int srcChoice = sc.nextInt();

        String source = "";
        if (srcChoice == 1) source = "Dhaka";
        else if (srcChoice == 2) source = "Chattogram";
        else if (srcChoice == 3) source = "Sylhet";
        else if (srcChoice == 4) source = "Rajshahi";
        else source = "Dhaka";

        // Destination Selection
        System.out.println("\n--- Select Your Destination ---");
        System.out.println("1. Chattogram\n2. Sylhet\n3. Rajshahi\n4. Khulna");
        System.out.print("Choose (1-4): ");
        int choice = sc.nextInt();
        sc.nextLine();

        String finalDest = "";
        String trainName = "";
        double ticketPrice = 0.0;

        if (choice == 1) {
            finalDest = "Chattogram";
            trainName = "Sonar Bangla Express";
            ticketPrice = 1200.0;
        } else if (choice == 2) {
            finalDest = "Sylhet";
            trainName = "Parabat Express";
            ticketPrice = 1000.0;
        } else if (choice == 3) {
            finalDest = "Rajshahi";
            trainName = "Silk City Express";
            ticketPrice = 900.0;
        } else if (choice == 4) {
            finalDest = "Khulna";
            trainName = "Sundarban Express";
            ticketPrice = 1100.0;
        } else {
            finalDest = "Unknown";
            trainName = "Local Train";
            ticketPrice = 500.0;
        }

        Train myTrain = new Train(trainName,source,finalDest);
        Ticket myTicket = new Ticket(8822, ticketPrice);

        // Payment logic
        System.out.println("\n--- Payment Selection (Total: " + ticketPrice + " TK) ---");
        System.out.println("1. Card Payment\n2. Mobile/Bank Payment");
        System.out.print("Choice: ");
        int payChoice = sc.nextInt();
        sc.nextLine();

        Payment paymentMethod;
        if (payChoice == 1) {
            System.out.print("Enter Card Number: ");
            String cardNo = sc.nextLine();
            paymentMethod = new CardPayment(cardNo);
        } else {
            System.out.print("Enter Mobile Number: ");
            String mobileNo = sc.nextLine();
            paymentMethod = new MobilePayment(mobileNo);
        }
        System.out.println("\n--- Final Confirmation ---");
        System.out.println("Are you sure you want to book? (1 for Yes / 0 for No): ");
        int kchoice = sc.nextInt();
        sc.nextLine(); // Buffer clear kora bhalo practice

        if(kchoice == 1) {
            // Generating Ticket Message
            System.out.println("\n----------------------------------");
            System.out.println(">>> Processing Request...");
            System.out.println(">>> Generating your Ticket... Please Wait...");
            System.out.println("----------------------------------");

            // Final Summary Display
            System.out.println("\n========== FINAL TICKET ==========");
            p1.showDetails();
            myTrain.showDetails();
            myTicket.showDetails();
            paymentMethod.pay(ticketPrice); // 'price' ba 'ticketPrice' variable-ta use korbe
            assignedStaff.verify();
            System.out.println("==================================");
            System.out.println("\nBooking Successful! Have a safe journey.");
        }
        else {
            System.out.println("\nBooking Cancelled. Thank you for visiting.");
        }

        sc.close(); // Main method-er ekdom sheshe close kora shobcheye safe
    }
}
