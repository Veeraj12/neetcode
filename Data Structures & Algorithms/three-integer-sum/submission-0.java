class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // [ -4, -1, -1, 0, 1, 2]
        int k = 0, j = 0;
        int sum = 0;

        List<List<Integer>> set = new ArrayList<>();

        for(int i = 0; i<nums.length-1; i++){

            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            j = i + 1;
            k = nums.length-1;

            while( j < k ){
                
                sum = nums[i] + nums[j] +  nums[k];

                if (sum == 0){ 
        
                    set.add(Arrays.asList( nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }

                    while(j < k && nums[k] == nums[k+1]){
                        k--;
                    }

                }else if(sum < 0){
                    j++; 
                }else {
                    k--;
                }
            }
        }
        return set;
    }
}


