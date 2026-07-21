class Solution {
    
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;

        while( l <= r){
        //  0+(2) = 2
        //  3+(2)/2 = 4
        //  3+(3-3)/2 = 3
            int m = l + (r-l)/2;

            if( nums[m] == target ){//F, F, T
                return m;
            }else if( nums[m] > target ){// 2>4:F, 6>4:T
                r = m - 1;// r = 3
            }else{// l = 3,
                l = m + 1;
            }
        }

    return -1;

    }
}
