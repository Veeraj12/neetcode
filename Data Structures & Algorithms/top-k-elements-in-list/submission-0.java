class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, Integer> hash = new HashMap<>();
        int []ans = new int[k];

       for(int i=0; i<nums.length; i++){
        if(!hash.containsKey(nums[i])){
            hash.put(nums[i], 0);
        }

        int oldval = hash.get(nums[i]);
        hash.put(nums[i], oldval+1);
       }

         List<Map.Entry<Integer, Integer> > list = 
        new ArrayList<>(hash.entrySet());

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        for(int i=0; i<k; i++){
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }
}
