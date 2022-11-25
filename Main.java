import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean i = true;

        while (i) {
            System.out.println("\nWelcome to Java's Calculator ☕️");
            System.out.println("1. Summation");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Distribution");

            Scanner scanner = new Scanner(System.in);
            System.out.println("\n");
            System.out.print("Input your option : ");
            int option = scanner.nextInt();

            String titleOption = "";
            switch (option) {
                case 1:
                    titleOption = "Summation";
                    System.out.println("\n1." + titleOption);
                    break;
                case 2:
                    titleOption = "Substraction";
                    System.out.println("\n2." + titleOption);
                    break;
                case 3:
                    titleOption = "Multiplication";
                    System.out.println("\n3." + titleOption);
                    break;
                case 4:
                    titleOption = "Distribution";
                    System.out.println("\n4." + titleOption);
                    break;
                default:
                    System.out.println("Option not found!");
                    break;
            }

            System.out.print("Enter first number : ");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter second number : ");
            int secondNumber = scanner.nextInt();

            int result = 0;
            switch (option) {
                case 1:
                    result = Main.summation(firstNumber, secondNumber);
                    break;
                case 2:
                    System.out.println("\n2. Substraction");
                    break;
                case 3:
                    System.out.println("\n3. Multiplication");
                    break;
                case 4:
                    System.out.println("\n4. Distribution");
                    break;
                default:
                    System.out.println("Option not found!");
                    break;
            }

            System.out.println("\nResult of " + titleOption + " : " + result);

            System.out.print("\nContinue? (Y/n) ");
            String letter = scanner.next();

            System.out.println(letter);

            if (letter == "y" || letter == "Y") {
                System.out.println("Continuee....");
                Main.main(args);
            } else {
                i = false;
            }

            scanner.close();
        }
    }

    private static int summation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}