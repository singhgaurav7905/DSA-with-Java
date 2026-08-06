class Solution {
    public int lengthOfLongestSubstring(String s) {
   
      HashSet<Character> set = new HashSet<>();
      int left = 0 ;
      int right = 0 ;
      int maxlength = 0 ;
      for(right = 0 ; right < s.length() ; right++){
     char newchar = s.charAt(right);

     while(set.contains(newchar)){
        set.remove(s.charAt(left));
        left++ ;
     }
       set.add(newchar); 

       int length = right - left + 1;
       maxlength = Math.max(length , maxlength);

    }

    return maxlength ;
    }
}