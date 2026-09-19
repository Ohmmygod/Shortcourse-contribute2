public class main {
    public static void main(String[] args) {
        System.out.println("=== Simple Calculator ===");

        // INPUT START
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        // INPUT END

        System.out.println("Addition: " +
                ProgrammerA.addition.add(firstNumber, secondNumber));

        System.out.println("Multiplication: " +
                ProgrammerB.multiplication.multiply(firstNumber, secondNumber));
    }
}
