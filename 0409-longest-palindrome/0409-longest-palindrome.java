class Solution {
    public int longestPalindrome(String s) {
        //using set runtime 5s, beats 65%
        // Set<Character> charSet = new HashSet<>();
        // for(char c : s.toCharArray()){
        //     if (charSet.contains(c)){
        //         charSet.remove(c);
        //     }else {
        //        charSet.add(c); 
        //     }
        // }
        // int len = s.length();
        // int set_size = charSet.size();
        // int result = (set_size == 0 ) ? len : len - set_size + 1;
        // return result;
        
        //using Array
        int chars[] = new int[128];
        for(char c : s.toCharArray()){
            chars[c]++;
        }
        int result = 0;
        for( int n : chars){
            result += n/2 * 2 ;  // 6/2 *2 = 6, 7/2*2 = 6 ; 
            if(result %2 ==0 && n %2 ==1){
                result ++;
            }
        }
        return result;
    }
}