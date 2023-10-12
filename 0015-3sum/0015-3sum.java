class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // Sort the input array to make it easier to find triplets.

        for (int s = 0; s < nums.length - 2; s++) {
            if (s == 0 || (s > 0 && nums[s] != nums[s - 1])) {
                int num1 = nums[s];
                int left = s + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = num1 + nums[left] + nums[right];

                    if (sum == 0) {
                        ans.add(Arrays.asList(num1, nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}
