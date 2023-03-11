class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        
        int i,j=0;
        int[] result = new int[2];
        for(i=0;i<l;i++){
            for(j=i+1;j<l;j++){
                if((nums[i]+nums[j])==target){
                    result[0]= i;
                    result[1]= j;    
                }
            }
        }
        return result;
    }
}