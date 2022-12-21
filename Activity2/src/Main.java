import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankApp bankApp = new BankApp();
        System.out.println("Welcome to bank app!\n");

        while (true) {
            System.out.println("What do you want to do? (C)heck Balance, (W)ithdraw, (D)eposit");
            System.out.print(">>");
            String choice = scanner.nextLine();
            System.out.println("Enter your pin");
            System.out.print(">>");
            int enteredPin = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case "C":
                    bankApp.checkBalance(enteredPin);
                    break;
                case "W":
                    System.out.println("Enter the ammount to withdraw in decimal point");
                    System.out.print(">>");
                    double ammountToWithdraw = Double.parseDouble(scanner.nextLine());
                    bankApp.withdraw(ammountToWithdraw, enteredPin);
                    break;
                case "D":
                    System.out.println("Enter the ammount to deposit in decimal point");
                    System.out.print(">>");
                    double ammountToDeposit = Double.parseDouble(scanner.nextLine());
                    bankApp.deposit(ammountToDeposit, enteredPin);
                    break;
            }
            System.out.println("Do you want to make another transaction? [Y|N]");
            String again = scanner.nextLine();
            if (Objects.equals(again, "N")) {
                break;
            }
        }
    }
}
