package SchoolTutorial.week3;
import java.util.Scanner;
public class Selectionsortq1to5 {

    public static void printNumber(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.printf("%d ", number[i]);
        }
    }
    // Exercise 1
    public static int[] generateRandomNumber(int number) {
        int[] randomNumber = new int[number];
        for(int i = 0; i < randomNumber.length; i++) {
            // Math.random() * number (ex: number is 7) means number randomlly runs from
            // range 1 to 7 inclusive
            randomNumber[i] = (int) Math.round(Math.random() * number);
        }
        return randomNumber;
    }

    // Exercise 2

    // Compare value with value ( ex: number[i] < number[minIndex])
    // position with position
    public static int getIndexMin(int[] numbers) {
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    //Exercise 3
    public static int getIndexMinFrom(int[] numbers, int from) {
        int minIndexFrom = from;
        for (int i = from; i < numbers.length;i++) {
            if(numbers[i] < numbers[minIndexFrom]) {
                minIndexFrom = i;
            }
        }
        return minIndexFrom;
    }

    // Exercise 4
    public static int[] exchangeMinValue(int[] numbers, int from) {
        int minIndex = getIndexMinFrom(numbers,from);

        //swap
        int temp = numbers[from];
        numbers[from] = numbers[minIndex];
        numbers[minIndex] = temp;
        return numbers;
    }

    public static int[] sortBySelection(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            exchangeMinValue(numbers,i);
        }
        return numbers;
    }

    public static void main(String[] args) {
        // exercise 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many random numbers to generate for the array: ");
        int numberInput = scanner.nextInt();
        int[] randomNum = generateRandomNumber(numberInput);
        System.out.println("The generated array is: " );
        printNumber(randomNum);
        System.out.println();

        // exercise 2
        int smallestIndex = getIndexMin(randomNum);
        System.out.printf("The smallest number is %d at the index %d\n",randomNum[smallestIndex],smallestIndex);

        // exercise 3
        int smallestIndexFrom = getIndexMinFrom(randomNum,3);
        System.out.printf("The smallest number is %d at the index %d from the index %d\n", randomNum[smallestIndexFrom],smallestIndex, smallestIndexFrom );

        //exercise 4
        int[] getIndexMin = exchangeMinValue(randomNum,0);
        System.out.println("The new array after exchange is: ");
        printNumber(getIndexMin);
        System.out.println();

        //exercise 5
        int[] sortedArray = sortBySelection(randomNum);
        System.out.println("The array after sorted is: ");
        printNumber(sortedArray);
    }
}
