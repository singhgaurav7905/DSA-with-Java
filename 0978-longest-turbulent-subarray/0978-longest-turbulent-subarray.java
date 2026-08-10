class Solution {
    public int maxTurbulenceSize(int[] arr) {
    
    // if(arr.length == 0){
    //     return 0 ;
    // }

     int maxlength = 1 ;
     int left = 0 ;
      for(int right = 1 ; right < arr.length ; right++){

        if(arr[right] == arr[right - 1]){
            left = right ;
        }
        else if(right == 1 || 
        (arr[right] > arr[right - 1] && arr[right-1] < arr[right-2]) || 
        (arr[right] < arr[right - 1] && arr[right - 1] > arr[right - 2])
      )
      { }

      else{
        left = right - 1 ;
      }

      maxlength = Math.max(maxlength , right - left + 1) ;
    }
    return maxlength ;
}
}