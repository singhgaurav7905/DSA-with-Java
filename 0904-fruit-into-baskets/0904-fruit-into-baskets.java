class Solution {
    public int totalFruit(int[] fruits) {
        
        int maxfruits = 0 ;
        Map<Integer , Integer> basket = new HashMap<>();
        int left = 0 ;

        for(int right = 0 ; right < fruits.length ; right++){
            basket.put(fruits[right] , basket.getOrDefault(fruits[right] , 0) + 1);

            while(basket.size() > 2){
                int fruitcount = basket.get(fruits[left]) ;

                if(fruitcount == 1){
                    basket.remove(fruits[left]) ;
                }
                else{
                    basket.put(fruits[left] , fruitcount - 1) ;
                }
                    left++ ;
            }
            maxfruits = Math.max(maxfruits , right - left + 1) ;
        }

        return maxfruits ;
    }
}