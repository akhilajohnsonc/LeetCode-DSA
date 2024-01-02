class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        for(int num : nums){
            boolean flag = false;
            for(List<Integer> result : results){
                if(!result.contains(num)){
                    result.add(num);
                    flag = true;
                    break;
                }
            }
                if(!flag){
                    List<Integer> newResult = new ArrayList<>();
                    newResult.add(num);
                    results.add(newResult);
                }
                
        }
            return results;
    }
}