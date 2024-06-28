package doomed.dumbs.leetcodeproblems

//3192. Minimum operations to make binary array elements equal to One 11
//Problem statement
/*You are given a
binary array
defn:-A binary array is an array which contains only 0 and 1.
nums.
You can do the following operation on the array any number of times
(possibly zero): Choose any index i from the array and flip all the
elements from index i to the end of the array.Flipping an element means
changing its value from 0 to 1, and from 1 to 0.
Return the minimum number of operations required to make all elements
in nums equal to 1.*/
/*Example 1:
Input: nums = [0,1,1,0,1]
Output: 4
Explanation:
We can do the following operations:
Choose the index i = 1. The resulting array will be nums = [0,0,0,1,0].
Choose the index i = 0. The resulting array will be nums = [1,1,1,0,1].
Choose the index i = 4. The resulting array will be nums = [1,1,1,0,0].
Choose the index i = 3. The resulting array will be nums = [1,1,1,1,1].
Example 2:
Input: nums = [1,0,0,0]
Output: 1
Explanation:
We can do the following operation:
Choose the index i = 1. The resulting array will be nums = [1,1,1,1].*/

class P3192 {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val num1= intArrayOf(0,1,1,0,1)
            val num2 = intArrayOf(1,0,0,0)
            val instance = P3192()
            System.out.println(instance.minOperations(num1))
            System.out.println(instance.minOperations(num2))
        }
    }
    fun minOperations(nums:IntArray):Int{
        if (nums.isEmpty()) return 0
        var operations = 0
        var current = nums[0]
        for (i in 1 until nums.size){
            if (nums[i]!=current){
                operations++
                current=nums[i]
            }
        }
        return if (nums[0]==0) operations+1 else operations
    }

}