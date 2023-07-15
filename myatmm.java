import java.util.Scanner;

class MyATM {
    public static void main(String args[]) {
        int balance = 5000, withdraw, deposit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println(" Welcome to MyATM Machine");
        System.out.println("");
        System.out.print("Enter your 4-digit PIN: ");
        int pin = scanner.nextInt();
        if (pin != 1301) {
            System.out.println("Invalid PIN. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\n****************");
            System.out.println("            Main Menu");
            System.out.println("****************");
            System.out.println("Choose 1 to Withdraw");
            System.out.println("Choose 2 to Deposit");
            System.out.println("Choose 3 to Check Balance");
            System.out.println("Choose 4 to View Previous Transactions");
            System.out.println("Choose 5 to EXIT");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n****************");
                    System.out.print("Enter the amount to withdraw: $");
                    withdraw = scanner.nextInt();
                    if (balance >= withdraw && withdraw > 0) {
                        balance -= withdraw;
                        System.out.println("****************");
                        System.out.println("Please collect your cash.");
                    } else {
                        System.out.println("****************");
                        System.out.println("Invalid amount or insufficient balance");
                    }
                    break;

                case 2:
                    System.out.println("\n****************");
                    System.out.print("Enter the amount to deposit: $");
                    deposit = scanner.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("****************");
                        System.out.println("Your money has been successfully deposited.");
                    } else {
                        System.out.println("****************");
                        System.out.println("Invalid amount");
                    }
                    break;

                case 3:
                    System.out.println("\n****************");
                    System.out.println("Your Current Balance: $" + balance);
                    break;

                case 4:
                    System.out.println("\n****************");
                    System.out.println("Previous Transactions:");
                    System.out.println("No previous transactions available.");
                    break;

                case 5:
                    System.out.println("\n****************");
                    System.out.println("Thank you for using MyATM. Goodbye!");
                    return;

                default:
                    System.out.println("\n****************");
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println("\n****************");
            System.out.print("Do you want to continue? (Y/N): ");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("Y")) {
                System.out.println("Thank you for using MyATM. Goodbye!");
                return;
            }
        }
    }


    private static boolean isValidPin(int pin) {
        // Add your custom PIN validation logic here
        // For simplicity, let's assume any 4-digit number is valid
        return (pin >= 1000 && pin <= 9999);
    }
}