class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length == 0){
            return result;
        }
        HashMap<String,List<String>> sortedmap = new HashMap<>();
       for(int i = 0;i<strs.length;i++){
           char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
           sortedmap.putIfAbsent(sortedString, new ArrayList<>());
           if(sortedmap.containsKey(sortedString)){    
               sortedmap.get(sortedString).add(strs[i]);   
           }
          
           //System.out.println(sortedmap.toString()); 
        }
     result.addAll(sortedmap.values());
        return result ;
    }
}