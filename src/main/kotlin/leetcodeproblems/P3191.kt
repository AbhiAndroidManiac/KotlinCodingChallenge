package doomed.dumbs.leetcodeproblems

//3191. Minimum operations to make binary array elements equal to One 1
//Problem statement
/*You are given a
binary array
defn:-A binary array is an array which contains only 0 and 1.
nums.
You can do the following operation on the array any number of times
(possibly zero):
Choose any 3 consecutive elements from the array and flip all of them.
Flipping an element means changing its value from 0 to 1, and from 1
to 0.
Return the minimum number of operations required to make all elements
 in nums equal to 1. If it is impossible, return -1.*/
class P3191 {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val nums1 = intArrayOf(0,1,1,1,0,0)
            val nums2 = intArrayOf(0,1,1,1)
            var instance = P3191()
            println(instance.minOperations(nums1))
            println(instance.minOperations(nums2))
        }
    }
    fun minOperations(nums:IntArray):Int{
        val n= nums.size
        var operations = 0
        for (i in 0 until n-2){
            if (nums[i]==0){
                //Flip the current element and the next two element
                nums[i]=1-nums[i]
                nums[i+1]=1-nums[i+1]
                nums[i+2]=1-nums[i+2]
                operations++
            }
        }
        //check if the last two elements are 1
        if (nums[n-2]==0 || nums[n-1]==0){
            return  -1
        }
        return operations
    }
}