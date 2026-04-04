class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        HashSet<Character> hs = new HashSet<>();
        int[] count = new int[26];
        int l = 0, r = 0;
        for(char c : s1.toCharArray()){
            count[c - 'a'] += 1;
            hs.add(c);
        }
        while(l < s2.length()){
            while(l < s2.length() && count[s2.charAt(l) - 'a'] == 0) l++;
            if(l >= s2.length()) return false;
            r = l + 1;
            int[] temp = count.clone();
            temp[s2.charAt(l) - 'a'] -= 1;
            while(r < s2.length() && l + s1.length() - 1 >= r){
                if(temp[s2.charAt(r) - 'a'] == 0){
                    break;
                }
                temp[s2.charAt(r) - 'a']--;
                r++;
            }
            System.out.println(l + "" + r);
            boolean flag = false;
            for(int i : temp){
                if(i != 0){
                    flag = true;
                    break;
                }
            }
            if(!flag) return true;
            if(r < s2.length() && !hs.contains(s2.charAt(r))) l = r + 1;
            else l++;
        }
        return false;
    }
}
