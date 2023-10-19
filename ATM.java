import java.util.*;

public class ATM extends bankACC {
    double balance;

    ATM() {
        balance = super.balance;
        super.rules();
    }

    void withdraw(double amt) {
        System.out.println("Amount Withdrawn = Rs " + amt);
        balance = balance - amt;
        super.balance = balance;
    }

    void deposite(double amt) {
        System.out.println("Amount Deposited = Rs " + amt);
        balance += amt;
        super.balance = balance;
    }

    void checkBalance() {
        System.out.println("Curent amount in your Bank Account = " + balance);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ATM ob = new ATM();
        System.out.println(
                "Welcome to ATM!!");
        char cont = '\u0000';
        do {
            System.out.println(
                    "\nChoosse from the following\n1)Deposite\n2)Withdraw\n3)Check Balance\nEnter yor choice(1/2/3) : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the amount to be Diposited : ");
                    ob.deposite(sc.nextDouble());

                    break;
                case 2:
                    double amt = 0.0;

                    System.out.print("Enter the amount to be Withdrawn : ");
                    amt = sc.nextDouble();
                    if (ob.balance >= amt) {
                        break;
                    } else {
                        System.out.println("Insufficient Balance!!! Request can NOT be carried out!!");
                    }

                    ob.withdraw(amt);
                    break;
                case 3:
                    ob.checkBalance();
                    break;
                default:
                    System.out.println(
                            "Your choice dosen't seem to be right!");
                    break;
            }
            System.out.println("\nPress 'X' to exit the ATM and any other key to continue working with the ATM.");
            cont = sc.next().charAt(0);

        } while (cont != 'X' && cont != 'x');
        System.out.println("THANK YOU!! HOPE TO SEE YOU AGAIN!!");
    }
}
