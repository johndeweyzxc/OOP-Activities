public class BankApp {
    private double currentBalance = 0.0;

    private void setCurrentBalance(double newBalance) {
        this.currentBalance = newBalance;
    }

    private double getCurrentBalance() {
        return this.currentBalance;
    }

    private boolean isPinCorrect(int enteredPin) {
        int pin = 1234;
        return enteredPin == pin;
    }

    public void checkBalance(int enteredPin) {
        if (isPinCorrect(enteredPin)) {
            System.out.println("Your current balance is " + Double.toString(currentBalance));
        } else {
            System.out.println("Wrong pin");
        }
    }

    public void withdraw(double ammount, int enteredPin) {
        if (isPinCorrect(enteredPin)) {
            double newBalance = this.currentBalance - ammount;
            if (newBalance < 0.0) {
                System.out.println("Insufficient balance");
            } else {
                setCurrentBalance(newBalance);
                System.out.println("Successfully withdrawn " + Double.toString(ammount));
                System.out.println("Your current balance is now " + Double.toString(getCurrentBalance()));
            }
        } else {
            System.out.println("Wrong pin");
        }
    }

    public void deposit(double ammount, int enteredPin) {
        if (isPinCorrect(enteredPin)) {
            setCurrentBalance(getCurrentBalance() + ammount);
            System.out.println("Successfully deposited " + Double.toString(ammount));
            System.out.println("Your current balance is now " + Double.toString(getCurrentBalance()));
        } else {
            System.out.println("Wrong pin");
        }
    }
}
