import java.util.Scanner;

public class Arrays {


    private static int findIndex(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            if (x == numbers[i]) return i;
        }
        return -1;
    }


    public static void main(String[] args) {

        /*
        int[] marks = new int[3];

        int[] numbers = {1,4,67,7};

        marks[0] = 97;
        marks[1] = 97;
        marks[2] = 97;
//        marks[0] = 97;
//        marks[0] = 97;

//        System.out.println(marks[0]);

        for (int mark : marks) {
            System.out.println(mark);
        }*/


        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of array");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("please enter the value of assign on " + i + "th index in the array");
            array[i] = sc.nextInt();
        }

        System.out.println("Please the value that you need the index of in given array");
        int x = sc.nextInt();
        int ans = findIndex(array, x);
        System.out.println(ans == -1 ? "the number that you are trying to find is not available in given array"
                : "the index of given number is : " + ans);

    }
}
