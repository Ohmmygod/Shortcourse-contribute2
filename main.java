public class main {
    public static void main(String[] args) {
        System.out.println("=== Simple Calculator ===");

        // INPUT START
        int firstNumber = 10;
        int secondNumber = 5;
        // INPUT END

        System.out.println("Addition: " +
                ProgrammerA.addition.add(firstNumber, secondNumber));

        System.out.println("Multiplication: " +
                ProgrammerB.multiplication.multiply(firstNumber, secondNumber));
    }
}
