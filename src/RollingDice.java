import java.util.Scanner;

class rollDice {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the number of times you want to roll the dice");
        int number;
        number= keyboard.nextInt();
        int dice=0;
        dice = (int) (Math.random() * 6 + 1);
        System.out.println("Roll: total = " + dice);

    }
}
