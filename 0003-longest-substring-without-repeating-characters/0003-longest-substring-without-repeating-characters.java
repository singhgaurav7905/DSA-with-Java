class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int charIndex[] = new int[128];
        int maxlength = 0 ;
        int left = 0 ;

        for(int right = 0 ; right < s.length() ; right++){
            char ch = s.charAt(right);
            left = Math.max(left , charIndex[ch]);
            charIndex[ch] = right + 1 ;

            int length = right - left + 1 ;
            maxlength = Math.max(length , maxlength);
        }
        return maxlength ;
    }
}