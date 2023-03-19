class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n :nums){
            //map.putIfAbsent(n,0);
            map.put(n, map.getOrDefault(n,0)+1);
            }
        
        System.out.println(map.toString());
        int[] result = new int[k];
        int max = 0;
      
    for(int i=0;i<k;i++){
      int maxValue = 0;
    int maxKey = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        int key = entry.getKey();
        int value = entry.getValue();
        if (value > maxValue) {
            maxValue = value;
            maxKey = key;
        }
    }
    result[i] = maxKey;
    map.put(maxKey, 0);
    }
        return result;
    }
}