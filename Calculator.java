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
            System.out.println("������ ����� �����:");
            numone = input.nextInt();


            System.out.println("������ ����� �����:");
            numtwo = (int) input.nextInt();

            function = new Scanner(System.in);
            System.out.println("������� ��������:");
            operation = function.next();

            if (operation.equals("+")) {
                System.out.println("³������: " +(numone + numtwo));
            }
            if (operation.equals("-")) {
                System.out.println("³������: " +(numone - numtwo));
            }
            if (operation.equals("/")) {
                if (numtwo == 0) {
                    System.out.println("����������� ������");
                } else {
                    System.out.println("³������: " +(numone / numtwo));
                }
                ;

            }
            if (operation.equals("*")) {
                System.out.println((numone * numtwo));
            }


        }
    }
}

