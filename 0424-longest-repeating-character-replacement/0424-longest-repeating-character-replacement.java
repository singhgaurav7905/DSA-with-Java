class Solution {
    public int characterReplacement(String s, int k) {

        int maxlength = 0;
        int left = 0;
        int[] freq = new int[26];
        int maxfreq = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            freq[ch - 'A']++;

            maxfreq = Math.max(maxfreq, freq[ch - 'A']);

            // int windowsize = right - left + 1;
            // int replacement = windowsize - maxfreq;

            if ((right - left + 1) - maxfreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            int windowsize = right - left + 1 ;        // recalculating windowsize

            maxlength = Math.max(maxlength, windowsize);
        }
        return maxlength;
    }
}