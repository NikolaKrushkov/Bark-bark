import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        int num1 = input.nextInt();

        int num2 = input.nextInt();


        int sum = num1 + num2;
        System.out.println(sum);

        // Изчисляване на разликата
        int difference = num1 - num2;
        System.out.println(+ difference);

        // Изчисляване на произведението
        int product = num1 * num2;
        System.out.println( product);


        if (num2 != 0) {
            int division = num1 / num2;
            int remainder = num1 % num2;
            System.out.println( division);
            System.out.println( remainder);
        } else {
            System.out.println("Второто число е 0, не може да се извърши деление.");
        }

        input.close();
    }
}
