class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        List<int[]> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            res.add(new int[]{entry.getValue(), entry.getKey()});
        }
        res.sort((a, b) -> b[0] -  a[0]);
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = res.get(i)[1];
        }
        return arr;
    }
}
