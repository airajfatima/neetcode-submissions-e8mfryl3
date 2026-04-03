class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<String> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            // a + b + c = 0 => a + b = -c
            int target = -1 * nums[i];
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                if(nums[j] + nums[k] == target){
                    StringBuilder str = new StringBuilder();
                    str.append(nums[i]).append(nums[j]).append(nums[k]);
                    if(!set.contains(str.toString())){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);temp.add(nums[j]);temp.add(nums[k]);
                        res.add(temp);
                        set.add(str.toString());
                    }
                    j++;k--;
                }
                else if(nums[j] + nums[k] > target)
                    k--;
                else j++;
            }
        }
        return res;
    }
}
