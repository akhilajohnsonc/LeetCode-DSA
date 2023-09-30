class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (!unique.add(nums[i])) {
				return true;
			}
		}
		return false;
    }
}