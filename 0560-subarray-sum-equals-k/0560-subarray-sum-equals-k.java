class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int prefixsum = 0 ;
        int result = 0 ;
        Map<Integer , Integer> map = new HashMap<>();
        map.put(0,1);

        for(int num : nums){
            prefixsum += num ;

            if(map.containsKey(prefixsum - k)){
             result += map.get(prefixsum - k) ;
            }

            map.put(prefixsum , map.getOrDefault(prefixsum , 0) + 1) ;
        }
        return result ;
    }
}