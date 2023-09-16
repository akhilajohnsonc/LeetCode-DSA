class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1; 
        //System.out.println(low +" "+ high);
        
        while(low <= high){
            int middleposition = (high + low) / 2;
            //System.out.println(middleposition);
            if(nums[middleposition] == target){
                return middleposition;
            }else if (target > nums[middleposition] ){
                low = middleposition + 1;
                //System.out.println( " Low is " + low);
            }else {       
                high = middleposition - 1;
                //System.out.println( " high is " + high);
            }
        }
         return -1;
    }
   
}