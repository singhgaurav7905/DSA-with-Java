class Solution {
    public char findTheDifference(String s, String t) {
        
        char ans = 0 ;

        for(char a : s.toCharArray()){
            ans = (char)(ans ^ a) ;           // same as below because java doesnt support 
        }                                    //  a = a + 1   ; in case of character  but support 
                                            // a += 1 , it shows implicit conversion automatically
        for( char a : t.toCharArray()){
            ans ^= a ;
        }

        return ans ;
    }
}