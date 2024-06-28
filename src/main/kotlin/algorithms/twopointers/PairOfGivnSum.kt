package doomed.dumbs.algorithms.twopointers


//Finding a Pair with a Given Sum in a Sorted Array
/**
 * Explanation:
 * ------------
 * Start with two pointers: one at the beginning (left) and one at the end (right).
 * ................................................................................
 * Calculate the sum of the elements at these pointers.
 * ....................................................
 * If the sum equals the target, return the pair.
 * ..............................................
 * If the sum is less than the target, move the left pointer to the
 * right to increase the sum.
 * ..........................
 * If the sum is greater than the target, move the right pointer to the
 * left to decrease the sum. Repeat until the pointers meet.
 * .........................................................
 */
class PairOfGivnSum {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val arr = intArrayOf(1, 2, 4, 5, 7, 11, 15)
            val targetSum = 9
            var instance: PairOfGivnSum = PairOfGivnSum()
            instance.findPairOfSum(arr, targetSum)
        }
    }

    fun findPairOfSum(array: IntArray, targetSum: Int): Boolean {
        var left = 0
        var right = array.size - 1
        while (left < right) {
            val sum = array[left] + array[right]
            when {
                sum == targetSum -> {
                    println("Pair found: (${array[left]} , ${array[right]})")
                    return true
                }

                sum < targetSum -> left++
                else -> right--
            }
        }
        println("No Pair found with the given sum")
        return false
    }
}