class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int len = nums.length;
        for(int i= 0;i<len; i++){
            for(int j= 0;j<i; j++){
                if((nums[i] + nums[j] ) == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}