class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false ;
        }

        int[] maps1 = new int[26] ;
        int[] maps2 = new int[26] ;

        for(char ch : s1.toCharArray()){
            maps1[ch - 'a']++ ;
        }

        int left = 0 ;
        for(int right = 0 ; right < s2.length() ; right++){
            maps2[s2.charAt(right) - 'a']++ ;
           
           if(right - left + 1 > s1.length()){
            maps2[s2.charAt(left) - 'a']-- ;
            left++ ;
           }

           if(right - left + 1 == s1.length()){
           if( Arrays.equals(maps1 , maps2))
               return true ;
           }
        }

        return false ;
    }
}