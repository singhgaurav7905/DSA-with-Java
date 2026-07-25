class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
 
     long windowsum = 0 ;
     long maxsum = 0 ;
     Map<Integer , Integer> map = new HashMap<>();
     for(int i = 0 ; i < k ; i++){
        windowsum += nums[i];
        map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
     }
        if(map.size() == k){
            maxsum = windowsum ;
        }

      for(int i = k ; i < nums.length ; i++){

        windowsum += nums[i];
        map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);

        windowsum -= nums[i-k];
        map.put(nums[i-k] , map.get(nums[i-k]) -1 );

        if(map.get(nums[i-k]) == 0){
            map.remove(nums[i-k]);
        }

        if(map.size() == k){
            maxsum = Math.max(maxsum , windowsum);
        }
      }
      return maxsum ;
    }
}