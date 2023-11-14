package leetcode_streak.arrays

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */

fun main() {
    var testCase1 = intArrayOf(1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1)
    println("Test case one: Actual result: ${findMaxConsecutiveOnes(testCase1)}, (Expected: 4)")

    var testCase2 = intArrayOf(1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1)
    println("Test case one: Actual result: ${findMaxConsecutiveOnes(testCase2)}, (Expected: 7)")

    var testCase0 = intArrayOf()
    println("Test case one: Actual result: ${findMaxConsecutiveOnes(testCase0)}, (Expected: 0)")
}

fun findMaxConsecutiveOnes(nums: IntArray) : Int {

    if (nums.isEmpty()) {
        return 0
    }
    var maxCount = 0;
    var currentCount = 0

    for (num in nums) {
        if (num == 1) {
            currentCount++
            if (currentCount > maxCount)
                maxCount = currentCount;
        }
        else
            currentCount = 0
    }

    return maxCount
}