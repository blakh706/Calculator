import java.util.Scanner;

public class Calculator {
    private static Scanner function;
    private static Scanner input;

    public static void main(String args[]) {

        int numone;
        int numtwo;
        String operation;
        while (true) {
            input = new Scanner(System.in);
            System.out.println("Введіть перше число:");
            numone = input.nextInt();


            System.out.println("Введіть друге число:");
            numtwo = (int) input.nextInt();

            function = new Scanner(System.in);
            System.out.println("Виберіть операцію:");
            operation = function.next();

            if (operation.equals("+")) {
                System.out.println("Відповідь: " +(numone + numtwo));
            }
            if (operation.equals("-")) {
                System.out.println("Відповідь: " +(numone - numtwo));
            }
            if (operation.equals("/")) {
                if (numtwo == 0) {
                    System.out.println("Некоректний дільник");
                } else {
                    System.out.println("Відповідь: " +(numone / numtwo));
                }
                ;

            }
            if (operation.equals("*")) {
                System.out.println((numone * numtwo));
            }


        }
    }
}

