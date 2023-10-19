import java.util.*;
import java.lang.*;

class NumberGame {
    public static void main(String[] args) {
        int random, a = -1;
        random = ((int) (Math.random() * 101)) + 100;
        System.out.println("A random number between 100 and 200 has been selected.\nCan you gyess the number??");
        do {
            if (a != -1) {
                int k = (a > random ? 1 : 0);
                System.out.println("Wrong guess!\nYour guess is " + (k == 1 ? "Too High" : "Too Low"));
            }
            System.out.println("Enter your guess!! : ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            if (a < 100 || a > 200) {
                System.out.println("!! Enter a number between 100 and 200 !!");
                a = -1;
            }
        } while (random != a);
        System.out.println("Congratulations!! Your guess is CORRECT!!");
    }
}