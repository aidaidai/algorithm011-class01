class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            //1 确定num[i]的最大子序列和。2 和max比较确定整体最大子序列和
            max=Math.max((nums[i]=Math.max(nums[i],nums[i]+nums[i+1])),max);
        }
        return max;
    }
   // nums[i]=nums[i],nums[i]+nums[i+1]

}// 1 2 -3