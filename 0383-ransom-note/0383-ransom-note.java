class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabet_tracker = new int[26];
        for(char c : magazine.toCharArray()){
            ++alphabet_tracker[c -'a'];
        }
        for(char c : ransomNote.toCharArray()){
            if(--alphabet_tracker[c -'a']<0){
                return false;
            }
        }
        return true;
    }
}