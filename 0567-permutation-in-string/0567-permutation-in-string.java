class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false ;
        }

        int[] maps1 = new int[26] ;
        int[] maps2 = new int[26] ;

        for(int i = 0 ; i < s1.length() ; i++){
            maps1[s1.charAt(i) - 'a']++ ;
            maps2[s2.charAt(i) - 'a']++ ;
        }

        if(matches(maps1 , maps2)){
            return true ;
        }

        for(int right = s1.length() ; right < s2.length() ; right++){
            maps2[s2.charAt(right) - 'a']++ ;

            maps2[s2.charAt(right - s1.length()) - 'a']-- ;

            if(matches(maps1 , maps2)){
                return true ;
            }
        }

        return false ;
    }

    public Boolean matches(int[] maps1 , int[] maps2){
        for(int i = 0 ; i < 26 ; i++){
            if(maps1[i] != maps2[i]){
                return false ;
            }
        }
        return true ;
    }
}