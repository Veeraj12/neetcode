// import java.util.Arrays;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer>  checkDup = new Hashtable<>();
        for(int i = 0; i < nums.length; i++){

            if(checkDup.containsKey(nums[i]) == false){
                checkDup.put(nums[i], 1);
            }else{
                return true;
            }
        }
        return false;
    }
}