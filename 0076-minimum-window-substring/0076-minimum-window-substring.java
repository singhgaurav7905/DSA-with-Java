class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length() < t.length()){
            return "" ;
        }
        int[] mapS = new int[128];
        int[] mapT = new int[128];

        for(char ch : t.toCharArray()){
            mapT[ch]++ ;
        }

        int left = 0 ;
        int minlength = Integer.MAX_VALUE ;
        int minstart = 0 ;

        for(int right = 0 ; right < s.length() ; right++){
            mapS[s.charAt(right)]++ ;

            while(contains(mapS , mapT)){
                if(right - left + 1 < minlength){
                    minlength = right - left + 1 ;
                    minstart = left ;
                }
                mapS[s.charAt(left)]-- ;
                left++ ;
            }
        }

        return minlength == Integer.MAX_VALUE ? "" : s.substring(minstart , minstart + minlength) ;
    }

    public boolean contains(int[] mapS , int[] mapT){
        for(int i = 0 ; i < 128 ; i++){
            if(mapT[i] > mapS[i]){
                return false ;
            }
        }
            return true ;
    }
}