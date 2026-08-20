class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first = findfirst(nums , target) ;
        int last = findlast(nums , target) ;

        return new int[]{first , last} ;
    }

    public int findfirst (int[] nums , int target){
        int first = -1 ;
        int left = 0 ;
        int right = nums.length - 1 ;

        while(left <= right){
            int mid = left + (right - left)/2 ;
            if(nums[mid] == target){
                first = mid ;
                right = mid - 1 ;
            }
            else if(nums[mid] < target){
                left = mid + 1 ;
            }
            else{
                right = mid - 1; 
            }
        }
        return first ;
    }

     public int findlast (int[] nums , int target){
        int last = -1 ;
        int left = 0 ;
        int right = nums.length - 1 ;

        while(left <= right){
            int mid = left + (right - left)/2 ;
            if(nums[mid] == target){
                last = mid ;
                left = mid + 1 ;
            }
            else if(nums[mid] < target){
                left = mid + 1 ;
            }
            else{
                right = mid - 1; 
            }
        }
        return last ;
    }
}