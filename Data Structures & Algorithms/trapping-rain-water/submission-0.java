class Solution {
    public int trap(int[] height) {
        int trappedWater = 0;
        int left = 0;
        int right = height.length-1;
        int prefixMax = 0, suffixMax = 0;

        while(left < right){
            
            if(height[left] <= height[right]){
                if( prefixMax > height[left]){
                    trappedWater += prefixMax - height[left];
                }else{
                    prefixMax = height[left];
                }
                left++;

            }else{
                if( suffixMax > height[right] ){
                    trappedWater += suffixMax - height[right];
                }else{
                    suffixMax = height[right];
                }
                right--;
            } 
        }
        return trappedWater;
        

    }
}
