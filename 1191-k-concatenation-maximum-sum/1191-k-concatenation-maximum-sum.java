class Solution {
    
    public long kadane(int[] arr){
        long currentmax = 0 ;
        long maxsum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            currentmax = Math.max(currentmax + arr[i] , arr[i]) ;
            maxsum = Math.max(currentmax , maxsum) ;
        }
        return maxsum ;
    }

    public long kadanesoftwo(int[] arr){
        int[] narr = new int[arr.length *2] ;

        for(int i = 0 ; i < arr.length ; i++){
            narr[i] = arr[i] ;
        }

        for(int i = 0 ; i < arr.length ; i++){
            narr[i + arr.length] = arr[i] ;
        }

        return kadane(narr) ;
    }
    public int kConcatenationMaxSum(int[] arr, int k) {
        long sum = 0 ;
        long answer = 0 ;
        for(int num : arr){
            sum += num ;
        }
        if( k == 1){
            answer =  kadane(arr) ;
        }
        else if(sum <= 0){
            answer =  kadanesoftwo(arr) ;
        }
        else{
           answer = (kadanesoftwo(arr) + (k-2) * sum) ; 
        }

        return (int)(answer % 1_000_000_007) ;
    }
}