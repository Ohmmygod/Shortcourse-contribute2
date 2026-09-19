import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("=== Simple Calculator ===");
        Scanner sc = new Scanner(System.in);
        // INPUT START
        System.out.print("Num1: ");
        int firstNumber = sc.nextInt();
        System.out.print("Num2: ");
        int secondNumber = sc.nextInt();
        // INPUT END

        System.out.println("Addition: " +
                ProgrammerA.addition.add(firstNumber, secondNumber));

        System.out.println("Multiplication: " +
                ProgrammerB.multiplication.multiply(firstNumber, secondNumber));
    }
    sc.close();
}
