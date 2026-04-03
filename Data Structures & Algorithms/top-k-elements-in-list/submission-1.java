class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer>[] freq = new ArrayList[nums.length + 1];
        for(int i = 0; i < nums.length + 1; i++){
            freq[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int j = 0;
        for(int i = nums.length; i >= 0 && j < k; i--){
            for(int l = 0; l < freq[i].size() && j < k; l++){
                res[j++] = freq[i].get(l);
            }
            if(j>=k) break;
        }
        return res;
    }
}
