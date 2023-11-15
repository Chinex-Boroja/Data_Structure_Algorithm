package leetcode_streak.arrays

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
fun main() {

    val testCase1 = intArrayOf(1)
    println("Test case one: Actual result: ${countDigits(testCase1)}, (Expected: 0)")

    val testCase2 = intArrayOf(12, 1, 0, 1234, 1111, 456, 123454,)
    println("Test case one: Actual result: ${countDigits(testCase2)}, (Expected: 4)")
}

fun countDigits(nums: IntArray):Int {

    var count = 0;

    for (num in nums) {
        val intToSting = num.toString();
        if (intToSting.length % 2 == 0) {
            count++;
        }
    }

    return count;
}