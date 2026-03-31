class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0 , count = 0 , maxlength = 0;
        for(int right = 0 ; right < nums.length;right++){
            if(nums[right]==0){
                count++;
            }
            while(count>1){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength-1;
    }
}
