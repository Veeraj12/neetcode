class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int max = 0;
        // int area = height * (nse - pse) - 1;

        for (int i = 0; i <= heights.length; i++){
            
            int currentHeight = (i == heights.length) ? 0 : heights[i];

            while(!stack.isEmpty() && heights[stack.peek()] > currentHeight){

                int height = heights[stack.pop()];
                int nse = i;
                int pse = stack.isEmpty() ? -1 : stack.peek();

                int width = nse - pse - 1;
                max = Math.max(max,  height * width );
            }

            if( i < heights.length){
                stack.push(i);
            }
        
        }
        return max;
    }
}
