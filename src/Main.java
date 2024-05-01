import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int m = sc.nextInt();
//        printSolidRectangle(n, m);
//        printHollowRectangle(n, m);
//        printHalfPyramid(n);
//        printInvertedHalfPyramid(n);
//        printInvertedHalfPyramidWithNumbers(n);
//        printFloydPattern(n);
//        printZeroOneTriangle(n);
//        printButterFlyPatter(n);
//        printSolidRhombus(n);
//        printNumberPyramid(n);
        printPalindromic(n);
    }


    private static void printSolidRectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printHollowRectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void printInvertedHalfPyramid(int n){
        for (int i = 1; i <=n ; i++) {
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= i; k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    private static void printInvertedHalfPyramidWithNumbers(int n){
        for (int i = n; i >= 1; i--) {
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void printFloydPattern(int n){
       int num = 1;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    private static void printZeroOneTriangle(int n){
        for(int i =1; i<=n; i++){
            for(int j =1; j<= i; j++){

                if((i-j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }

            }
                System.out.println();
        }
    }

    private static void printButterFlyPatter(int n){

        // Printing the upper half
           for(int i =1; i<=n; i++){
                   //first print the starting stars
                   for(int k= 1; k<= i; k++){
                       System.out.print("*");
                   }
                   // print the middle spaces
                   for(int k =1; k<=2*(n-i); k++){
                       System.out.print(" ");
                   }
                   // print the last stars
                   for(int k= 1; k<= i; k++){
                       System.out.print("*");
                   }
                   System.out.println();
           }

        for(int i =n-1; i>=1; i--){
            //first print the starting stars
            for(int k= 1; k<= i; k++){
                System.out.print("*");
            }
            // print the middle spaces
            for(int k =1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            // print the last stars
            for(int k= 1; k<= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    private static void printSolidRhombus(int n){
        for(int i =1; i<=n; i++){

            // Print spaces
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            // Print stars
            for(int j =1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void printNumberPyramid(int n){
        for(int i =1; i<=n; i++){

            // Print spaces
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            // Print stars
            for(int j =1; j<=i; j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }

    private  static void printPalindromic(int n){
        for(int i =1; i<=n; i++){

            // print the left half
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j =i; j>= 1; j--){
                System.out.print(j);
            }

            for(int j = 2; j<=i; j++ ){
                System.out.print(j);
            }


            System.out.println();
        }
    }
}

















