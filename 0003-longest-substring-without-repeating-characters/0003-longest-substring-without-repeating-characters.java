class Solution {
    public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int[] charIndex = new int[256]; // Assuming ASCII characters

    int maxLength = 0;
    int start = 0;

    for (int end = 0; end < n; end++) {
        char currentChar = s.charAt(end);

        if (charIndex[currentChar] > start) {
            start = charIndex[currentChar];
        }

        charIndex[currentChar] = end + 1;

        int currentLength = end - start + 1;
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
    }

    return maxLength;
}

}