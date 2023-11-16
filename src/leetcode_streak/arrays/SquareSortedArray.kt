package leetcode_streak.arrays

import java.util.Arrays

/**
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 */

fun main() {

    val testCase1 = intArrayOf(5, 2, 1, 4, 3)
    println("Test case one: Actual result: ${sortedSquaredArray1(testCase1).contentToString()}, (Expected: 1, 4, 9, 16, 25)")

}

// Using two pointers method
fun sortSquaredArray(nums: IntArray): IntArray {

    val storage = IntArray(nums.size)
    var low = 0
    var high = nums.size - 1

    for (i in nums.size - 1 downTo 0) {
        if (Math.abs(nums[low]) >= Math.abs(nums[high])) {
            storage[i] = nums[low] * nums[low]
            low++
        }
        else {
            storage[i] = nums[high] * nums[high]
            high--
        }
    }
    return storage
}


//using Arrays.sort method
fun sortedSquaredArray1(nums: IntArray): IntArray {

    for (i in nums.indices) {
        nums[i] = nums[i] * nums[i]
    }
    nums.sort()

    return nums
}