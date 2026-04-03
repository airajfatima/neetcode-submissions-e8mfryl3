class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int res = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while(r < s.length()){
            if(hm.containsKey(s.charAt(r))){
                if(hm.get(s.charAt(r)) >= l)
                    l = hm.get(s.charAt(r)) + 1;
            }
            res = Math.max(res, r - l + 1);
            hm.put(s.charAt(r), r);
            r++;
        }
        return res;
    }
}
