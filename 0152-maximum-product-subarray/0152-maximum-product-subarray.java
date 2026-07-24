class Solution {
    public int maxProduct(int[] nums) {
        
        int currentmax = nums[0];
        int currentmin = nums[0];
        int maxsofar = nums[0];

        for(int i = 1 ; i < nums.length ; i++){

            if(nums[i] < 0)
            {
                int temp = currentmax ;
                currentmax = currentmin ;
                currentmin = temp ;
            }
            currentmax = Math.max(nums[i] , nums[i] * currentmax);
            currentmin = Math.min(nums[i] , nums[i] * currentmin);

            maxsofar = Math.max(currentmax , maxsofar);
        }
         return maxsofar ;
    }
}