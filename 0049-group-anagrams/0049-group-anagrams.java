class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length == 0){
            return result;
        }
        HashMap<String,List<String>> sortedmap = new HashMap<>();
        //traverse through each str in strs.
        for(int i = 0;i<strs.length;i++){
            //sort each string
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
            //put it in hash map and add str as a list of strings in value part.
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