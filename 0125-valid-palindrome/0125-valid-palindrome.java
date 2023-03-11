class Solution {
    public boolean isPalindrome(String s) {
        String cleanSentence = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleanSentence).reverse();
        String reversed = sb.toString();
        System.out.println(sb);
        System.out.println(cleanSentence);
        if(cleanSentence.equals(reversed))
        return true;
        return false;
    }
}