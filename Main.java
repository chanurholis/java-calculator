import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Java's Calculator ☕️");
        System.out.println("1. Summation");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Distribution");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.print("Input your option : ");
        int option = scanner.nextInt();
        scanner.close();

        System.out.println("");
        System.out.println("==========");
        System.out.println("");

        System.out.println(option);
    }
}