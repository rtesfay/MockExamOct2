import java.util.Scanner;

public class numberFormat {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int phoneNumber;
        char c;
        System.out.println("Enter an integer value of your phone number");
        phoneNumber = keyboard.nextInt();
        if (phoneNumber.length == 10) {
            phoneNumber = (phoneNumber.substring(0, 3) + charAt(45) + phoneNumber.substring(4, 7) + charAt(45) + phoneNumber.substring(8));
            System.out.println("Phone number " + phoneNumber);
        } else
            System.out.println("Invalid phone number ");
    }
}