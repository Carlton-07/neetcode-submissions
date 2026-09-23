class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> yeu = new HashSet<>();
            for ( int num : nums){
                if(yeu.contains(num)){
                    return true;
                }
                yeu.add(num);
            }
            return false;

       
                
                
         
    }
}