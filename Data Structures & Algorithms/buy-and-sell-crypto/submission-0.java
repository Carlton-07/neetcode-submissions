class Solution {
    public int maxProfit(int[] nums) {
        int left = 0;
        int right = 1;
        int maxP = 0;
        
        while(right < nums.length){
            if(nums[left] < nums[right]){
                int profit = nums[right] - nums[left];
                maxP = Math.max(profit, maxP);
            } else {
                left = right;
            }
            right++;
        }
        return maxP;
    }
}
