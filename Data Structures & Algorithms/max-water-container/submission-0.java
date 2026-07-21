class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = 0;

        while(l < r){

            int minHeight = (heights[l]<heights[r]) ? heights[l] : heights[r]; 
            int res = minHeight * ( r - l );
 
            max = Math.max(max, res);
            
            if(minHeight == heights[l]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
