package leetcode_streak.arrays;

public class WriteReadWithLoop {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            // print ten elements in an number array
            // System.out.println(i);

            int squareNumbers = (i + 1) * (i + 1);
            numbers[i] = squareNumbers;

            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
