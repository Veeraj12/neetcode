class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int current = 0;
        int len = 0;
        int max = 0;

        for(int num: nums){
            set.add(num);
        }

        for(int num: nums){
            if(!set.contains(num-1)){
                current = num;
                len = 1;
        
                while(set.contains(current+1)){
                    current++;
                    len++;
                }
            
                max = Math.max(max, len);
            }
        }
    return max;
    }
}
