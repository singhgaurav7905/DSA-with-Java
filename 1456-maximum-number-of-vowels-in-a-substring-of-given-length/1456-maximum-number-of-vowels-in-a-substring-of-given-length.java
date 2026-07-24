class Solution {
    public int maxVowels(String s, int k) {
        
        int windowsum = 0 ;

        for(int i = 0 ; i < k ; i++){
            char ch = s.charAt(i);
            if( isVowel(ch))
            {
                windowsum++ ;  
                
            }
        }

        int maxsum = windowsum ;

        for( int i = k ; i < s.length() ; i++){
         
          char newchar = s.charAt(i);
          char oldchar = s.charAt(i-k);
            if( isVowel(newchar))
             { windowsum++ ; }

             if(isVowel(oldchar))
             {
                windowsum-- ;
             }

             maxsum = Math.max(windowsum , maxsum);
        }

        return maxsum ;
    }

    public boolean isVowel( char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ;
    }
}