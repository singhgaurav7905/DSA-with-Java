class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer , Integer> map = new HashMap<>();
        int maxlength = 0 ;
        int prefixsum = 0 ;
        map.put(0,-1) ;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                prefixsum-- ;
            }
            else{
                prefixsum++ ;
            }

            if(map.containsKey(prefixsum)){
                int length = i - map.get(prefixsum) ;
                maxlength = Math.max(maxlength , length) ;
            }

            else{
                map.put(prefixsum , i) ;
            }
        }
        return maxlength ;
    }
}