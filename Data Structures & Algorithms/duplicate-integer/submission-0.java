// import java.util.Arrays;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums); //[1, 2, 3, 3]
        int j = 0; //0 1 2 
        for(int i = 1; i < nums.length; i++){

            // if(j == nums.length) return false
                   
            if(nums[j] == nums[i]){
                return true;
            }
            j++;    
        }
        return false;
    }
}