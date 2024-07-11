import java.util.Random;
import java.util.Scanner;

public class DiceRollBinaryToDecimal {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Simulate rolling a pair of dice
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        System.out.println("Dice 1 rolled: " + dice1);
        System.out.println("Dice 2 rolled: " + dice2);

        // Convert dice results to binary
        String binaryDice1 = Integer.toBinaryString(dice1);
        String binaryDice2 = Integer.toBinaryString(dice2);

        System.out.println("Binary of Dice 1: " + binaryDice1);
        System.out.println("Binary of Dice 2: " + binaryDice2);

        // Convert binary to decimal
        int decimalDice1 = Integer.parseInt(binaryDice1, 2);
        int decimalDice2 = Integer.parseInt(binaryDice2, 2);

        System.out.println("Decimal of Dice 1 from Binary: " + decimalDice1);
        System.out.println("Decimal of Dice 2 from Binary: " + decimalDice2);

        // Prompt user to enter a binary number and convert to decimal
        System.out.print("Enter a binary number to convert to decimal: ");
        String binaryInput = scanner.nextLine();
        int decimalOutput = Integer.parseInt(binaryInput, 2);

        System.out.println("The decimal value of binary " + binaryInput + " is: " + decimalOutput);

        scanner.close();
    }
}




