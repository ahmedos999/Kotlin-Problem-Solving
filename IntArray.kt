class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var res = IntArray(0)
        for (i in 0..nums.size-1 step 1){
            for (j in i..nums.size-2 step 1){
            if(nums[i]+nums[j+1] == target){
                res+=i
                res+=j+1
            }
        }
        }
        return res
    }
}