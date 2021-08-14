import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int input;
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        input = s.nextInt();
        if (input == 1999)
            System.out.println("Bizarre summer~~~");
        else
            System.out.println("You fell for it fool! THUNDER CROSS SPLIT ATTACK!!");
    }
}