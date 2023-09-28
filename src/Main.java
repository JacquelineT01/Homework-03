import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // task 1
        int length = 4;
        int width = 2;

        int area = length * width;

        System.out.println("Area is: " + area);

        // task 2
        double weight = 98.5;
        double height = 1.70;

        double bodyMassIndex  = weight / (height * height);

        System.out.println("BMI is: " + bodyMassIndex);

        // task 3
        double celsius = 25;
        double fahrenheit = ((double) 9 / 5) * celsius + 32;

        System.out.println("Temperature in Celsius: " + celsius + "°C");
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");

        // task 7
        char originalChar = 'A';

        int shift = 9;
        char modifiedChar = (char) (originalChar + shift);

        System.out.println("Original Character: " + originalChar);
        System.out.println("Modified Character: " + modifiedChar);

        // task 8
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = in.nextInt();

        int result = n1 * n2;

        System.out.println("The result of multiplying " + n1 + " and " + n2 + " is: " + result);


    }
}