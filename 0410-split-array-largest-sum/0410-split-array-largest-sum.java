class Solution {
    public int splitArray(int[] nums, int k) {

       int left = 0 ;
       int right = 0 ;

       for(int num : nums ){
        left = Math.max(left , num) ;
        right += num ;
       } 

       while(left < right){
        int mid = left + (right - left)/2 ;

        if(cansplit(nums , k , mid)){
            right = mid ;
        }
        else{
            left = mid + 1 ;
        }
       }
       return left ;
    }

    public boolean cansplit(int[] nums , int k , int maxsum){
     int subarrays = 1 ;
     int currentsum = 0 ;

     for(int num : nums){
        if(currentsum + num > maxsum){
            subarrays++ ;
            currentsum = num ;
        }
        else{
            currentsum += num ;
        }
     }
     return subarrays <= k ;
    }
}