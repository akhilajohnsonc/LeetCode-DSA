class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        Arrays.sort(s_array);
        Arrays.sort(t_array);
        String s_str = new String(s_array);
        String t_str = new String(t_array);
        if(s_str.equals(t_str)){
            return true;
        }
        return false;
    }
}