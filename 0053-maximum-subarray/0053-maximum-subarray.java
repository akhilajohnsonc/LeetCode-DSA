class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's algorithm
        int max = nums[0];
        int currentsum = 0;

        for(int i =0; i<nums.length;i++){
            currentsum = Math.max(nums[i], nums[i] + currentsum);
            max = Math.max(currentsum, max);
        }
        return max;
    }
}