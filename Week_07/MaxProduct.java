class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max=nums[0],min=max,result=max;
        for(int i=1;i<nums.length;i++){
            int dpx=max,dpn=min;
            max=Math.max(nums[i],Math.max(dpx*nums[i],dpn*nums[i]));
                   min=Math.min(nums[i],Math.min(dpn*nums[i],dpx*nums[i]));
              result=Math.max(max,result);     
        }
        return result;
    }
}