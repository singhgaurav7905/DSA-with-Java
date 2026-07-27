class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
       int sum = 0 ;
       int minlength = Integer.MAX_VALUE ;

       int low = 0 ;
       int high = 0 ;

       while(high < nums.length){
        sum += nums[high];
        high++ ;

        while(sum >= target){
            int currentsize = high - low ;
            minlength = Math.min(currentsize , minlength);

            sum -= nums[low];
            low++ ;
        }
       }
     return minlength == Integer.MAX_VALUE ? 0 : minlength ;
    }
}