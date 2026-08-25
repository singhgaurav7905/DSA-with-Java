class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int left = 0 ;
        int right = 0 ;

        for(int weight : weights){
            left = Math.max(left , weight) ;
            right += weight ;
        }

        while(left < right){
            int mid = left + (right - left)/2 ;

            if(canship(weights , days , mid)){
                right = mid ;
            }
            else{
                left = mid + 1 ;
            }
        }
        return left ;
    }

    public boolean canship(int[] weights , int days , int capacity){

        int daysused = 1 ;
        int currentweight = 0 ;
        for(int weight : weights){
            if(currentweight + weight > capacity){
               daysused++ ;
               currentweight = weight ;
            }
            else{
                currentweight += weight ;
            }
        }
        return daysused <= days ;
    }
}