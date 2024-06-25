package doomed.dumbs.leetcodeproblems


//3190.Find Minimum Operations to Make All Elements Divisible by Three
//Problem statement
/*You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
Return the minimum number of operations to make all elements of nums divisible by 3.
Example 1:
Input: nums = [1,2,3,4]
Output: 3
Explanation:
All array elements can be made divisible by 3 using 3 operations:
Subtract 1 from 1.
Add 1 to 2.
Subtract 1 from 4.
Example 2:
Input: nums = [3,6,9]
Output: 0
Constraints:
1 <= nums.length <= 50
1 <= nums[i] <= 50*/

class P3190 {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val num1 = intArrayOf(1,2,3,4)
            val num2 = intArrayOf(3,6,9)
            val instance = P3190()
            instance.minimumOperations(num1)
            instance.minimumOperations(num2)
        }
    }
    fun minimumOperations(nums:IntArray){
        //number of operations to perform
        var operations=0
        //iterate through each element of nums
        for (num in nums){
            //For each num, calculate the remainder when num is divided by 3 using val remainder = num % 3.
            //If remainder is 0, num is already divisible by 3, and no operations are needed.
            val remainder = num%3
            //The possible operations are either adding (3 - remainder) or subtracting remainder.
            //Use minOf(remainder, 3 - remainder) to find the minimum number of operations needed.
            if (remainder!=0){
                //Add this value to the operations variable.
                operations += minOf(remainder,3-remainder)
            }
        }
        System.out.println(operations)
    }

}