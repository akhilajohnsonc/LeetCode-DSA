class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (unique.contains(nums[i])) {
				return true;
			}
			unique.add(nums[i]);
		}
		return false;
    }
}