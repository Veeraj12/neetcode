class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int len = temp.length;//7
        int [] result = new int[len];

        Deque<Integer> stack  = new ArrayDeque<>();

        if(len == 0){
            return result;
        }

        stack.push(0);//30,
        result[0] = 0;

        for(int i=1; i<len; i++){
            //38 > 30 -> true [30] -> []
            //30 > 38 -> false [] -> [38]
            //36 > 30 -> true  [30, 38] -> [36, 38]
            //35 > 36 -> false  [36, 38] -> [35, 36, 38]
            //40 > 35 -> true  [35, 36, 38] -> [36, 38]
            //40 > 36 -> true  [36, 38] -> [38]
            //40 > 38 -> true [38] -> []
            //28 > 40 -> false [40] -> [28, 40]
            while( !stack.isEmpty() && temp[i] > temp[stack.peek()] ){

                int index = stack.pop();// 30:0, 30:2, 35:4, 36:3, 38:1
            //  1 - 0 = 1
            //  3 - 2 = 1
            //  5 - 4 = 1
            //  5 - 3 = 2
            //  5 - 1 = 4
                result[index] = i - index; 

            }
                stack.push(i); // 1:38, 2:30, 3:36, 4:35, 5:40, 6:28
        }
        return result;
    }
}
