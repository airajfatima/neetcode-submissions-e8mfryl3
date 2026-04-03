class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> hs = new HashSet<>();
            hs.add(s.charAt(i));
            int temp = 1;
            for(int j = i + 1; j < s.length(); j++){
                if(hs.contains(s.charAt(j))){
                    res = Math.max(res, temp);
                    break;
                }
                temp++;
                hs.add(s.charAt(j));
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}
