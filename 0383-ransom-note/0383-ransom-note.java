class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap < Character, Integer> map = new HashMap<>();
        
        for(char c : magazine.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            } 
        }
        for(char c : ransomNote.toCharArray() ){
            if(map.containsKey(c) == false || map.get(c) == 0){
                return false;
            }
            else{
                map.put(c, map.get(c) - 1);       
            }
        }
        return true;
    }
}