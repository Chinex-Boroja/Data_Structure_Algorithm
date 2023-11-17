package leetcode_streak.arrays;

public class ArrayInsertions {

    public static void main(String[] args) {

        insertElement();
    }

    public static void insertElement() {
        int[] intArray = new int[6];
        int length = 0;

        // Add 3 elements to the array
        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
        }
        intArray[length] = 10;

        for (int i = 3; i >= 0; i--) {
            intArray[i + 1] = intArray[i];
        }

        intArray[0] = 20;

        // inserting an element in index 2
        for (int i = 4; i >= 2; i--) {
            intArray[i + 1] = intArray[i];
        }

        intArray[2] = 30;

        printArray(intArray);
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }
}
