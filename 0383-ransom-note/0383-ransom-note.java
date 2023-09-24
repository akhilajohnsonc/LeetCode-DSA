class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //HashMap < Character, Integer> map = new HashMap<>();
        
        if(ransomNote.length()>magazine.length()) return false;
        //using hashmap
        // for(int i = 0; i < magazine.length(); i++){
        //     char c = magazine.charAt(i);
        //     if(map.containsKey(c)){
        //         map.put(c, map.get(c)+1);
        //     }else{
        //         map.put(c, 1);
        //     } 
        // }
        //  for(int i = 0; i < ransomNote.length(); i++){
        //     char c = ransomNote.charAt(i);
        //     if(map.containsKey(c) == false || map.get(c) == 0){
        //         return false;
        //     }
        //     else{
        //         map.put(c, map.get(c) - 1);       
        //     }
        // }
        
        int[] alphabet_tracker = new int[26];
        // for(int i = 0; i < magazine.length(); i++){
        //      char c = magazine.charAt(i);
        //     alphabet_tracker[c -'a'] ++;
        // }
        // for(int i = 0; i < ransomNote.length(); i++){
        //      char c = ransomNote.charAt(i);
        //     alphabet_tracker[c -'a'] --;
        // }
        for(char c : magazine.toCharArray()){
            ++alphabet_tracker[c -'a'];
        }
        for(char c : ransomNote.toCharArray()){
            if(--alphabet_tracker[c -'a']<0){
                return false;
            }
        }
        // for(int n : alphabet_tracker){
        //     if(n < 0)
        //     return false;
        // }
        return true;
    }
}