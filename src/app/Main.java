package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Let's square your number: ");
        int number = scanner.nextInt();
        square(number);


        System.out.print(" Enter your radius: ");
        double radius = scanner.nextDouble();
        System.out.print(" Enter your height: ");
        double height = scanner.nextDouble();
        double volume = circle(radius, height);
        System.out.println("Volume is: " + volume);


        System.out.println(" Enter your quantity of elements:");
        int raw = scanner.nextInt();
        int[] array = new int[raw];
        System.out.println(" Choose your elements: ");
        for (int i = 0; i < raw; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = sumArray(array);
        System.out.println("The sum of numbers in the array is: " + sum);


        scanner.nextLine();
        System.out.println(" Let's reverse your string ");
        String yourString = scanner.nextLine();
        String revesreString = reverse(yourString);
        System.out.println("Your string: " + yourString + "\nReverse string: " + revesreString);


        System.out.println(" Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println(" Enter your second number: ");
        int secondNumber = scanner.nextInt();
        int res = power(firstNumber,secondNumber);
        System.out.println("Power of number("+ firstNumber + "^" + secondNumber +") is:" + res);


        System.out.println(" Please enter your number n: ");
        int repeat = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Please enter your string: ");
        String text = scanner.nextLine();
        repeatText(repeat,text);
    }
    public static void square(int number) {
        int enterNum = number * number;
        System.out.println("Square is: " + enterNum);
    }

    public static double circle(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int sumArray(int[] array) {
        int total = 0;
        for (int number:array) {
            total += number;
        }
        return total;
    }

    public static String reverse(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }
    public static int power(int warp, int powerNumber) {
        return (int) Math.pow(warp, powerNumber);
    }
    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}