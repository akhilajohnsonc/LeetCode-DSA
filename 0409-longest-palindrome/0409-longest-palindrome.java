class Solution {
    public int longestPalindrome(String s) {
        Set<Character> charSet = new HashSet<>();
        for(char c : s.toCharArray()){
            if (charSet.contains(c)){
                charSet.remove(c);
            }else {
               charSet.add(c); 
            }
        }
        int len = s.length();
        int set_size = charSet.size();
        int result = (set_size == 0 ) ? len : len - set_size + 1;
        return result;
    }
}