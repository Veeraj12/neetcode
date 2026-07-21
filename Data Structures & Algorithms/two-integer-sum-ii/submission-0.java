class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int l = 0;
        int r = numbers.length-1;
        int sum = 0;

        while( l < r ){
            sum = numbers[l] + numbers[r];
            if( sum == target ){
                return new int[]{ l+1, r+1};
            }else if( sum < target ){
                l++;
            }else{
                r--;
            }

        }
        return new int[]{};
    }
}
/*
    twoSum( numbers, target)
        l = start (0)
        r = end (numbers.len -1 )
        sum = 0
        int [] result = new int[3]
        while( l < r ):
            sum = nums[l] + nums[r]
            if( sum == target ):
                result[0] = l
                result[1] = r
            else if ( sum < target ):
                l++
            else if ( sum > target ):
                r--
        return result
            
*/









