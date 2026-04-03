class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            minHeap.add(new int[]{entry.getKey(), entry.getValue()});
            if(minHeap.size() > k){
                int[] p = minHeap.poll();
            }
        }
        int[] res = new int[k];

        int j = 0;
        for(int[] i : minHeap){
            res[j++] = i[0];
        }
        return res;
    }
}
