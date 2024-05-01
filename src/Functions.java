import java.util.Scanner;

public class Functions {

    private static void printName(String name) {
        System.out.println("My name is " + name);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int calculateProduce(int a, int b) {
        return a * b;
    }

    private static int findFactorial(int n) {
        int num = 1;

        for (int i = n; i >= 1; i--) {
            num *= i;

        }
        return num;
    }

    //1. Enter 3 numbers form the user & make a function to print their average
    private static void printAverage(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println("Average of given number is :" + avg);
    }

    //2. Write a function to print the sum of all odd numbers from 1 to n
    private static void printSumOfOddNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of all the odd number till " + n + "is : " + sum);
    }

    //3. Write a function which takes in 2 numbers and return the greater of those two
    private static void printGreaterNumber(int a, int b) {
        System.out.println(a > b ? "a is greater than b" : "b is greater than a");
    }

    //4. write a function that takes in the radius as input and returns the circumference of a circle
    private static void printCircumference(int r) {
        System.out.println("The circumference of given radius is :" + 2 * r * 3.14);
    }

    //5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    private static boolean isEligibleToVote(int age) {
        return age >= 18;
    }


    //6. Write an infinite loop using do while condition.
    private static void infiniteWhileLoop() {
        int i = -1;
        while (i < 1) {
            System.out.println(i--);
        }
    }


    //7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    private static void infiniteNumberCountGame() {
        System.out.println("Rules of game \n 1. Enter count of numbers you want to enter\n 2. We will give the count of positive, negative & zeros.");

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("Enter any number");
            int n = sc.nextInt();
            if (n > 0) {
                positiveCount++;
            } else if (n < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Positive number: " + positiveCount + "\n Negative number: " + negativeCount + "\n Zero count : " + zeroCount);
    }




    public static void main(String[] args) {

//        infiniteNumberCountGame();

        System.out.println(isEligibleToVote(15));
    }


}
