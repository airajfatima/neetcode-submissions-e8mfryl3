class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] charS = new int[26];
        int[] charT = new int[26];
        for(int i=0; i<t.length(); i++){
            charS[s.charAt(i) - 'a'] += 1;
            charT[t.charAt(i) - 'a'] += 1;
        }
        for(int i=0; i<26; i++){
            if(charS[i] != charT[i])
                return false;
        }
        return true;
    }
}
