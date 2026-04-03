class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            max = Math.max(i, max);
            min = Math.min(i, min);
            set.add(i);
        }
        int res = 1;
        for(int j: nums){
            int k = j, i = j;
            int temp = 1;
            set.remove(j);
            while(i >= min && !set.isEmpty()){
                System.out.println(i + "" + min + "" + temp);
                if(set.contains(--i)){
                    temp++;
                    set.remove(i);
                }
                else break;
            }
            while(k <= max && !set.isEmpty()){
                if(set.contains(++k)){
                    temp++;
                    set.remove(k);
                }
                else break;
            }
            res = Math.max(temp, res);
            if(set.isEmpty()) break;
        }
        return res;
    }
}
