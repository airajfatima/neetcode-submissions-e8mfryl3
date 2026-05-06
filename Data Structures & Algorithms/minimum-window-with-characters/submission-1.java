class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return  "";
        int start = 0, end = 0;
        int resLen = Integer.MAX_VALUE;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            hm1.put(t.charAt(i), hm1.getOrDefault(t.charAt(i), 0) + 1);
        }
        int have = 0, need = hm1.size();
        int l = 0, r = 0;
        if(hm1.containsKey(s.charAt(r))){
            hm2.put(s.charAt(r), hm2.getOrDefault(s.charAt(r), 0) + 1);
            if(hm2.get(s.charAt(r)) == hm1.get(s.charAt(r))) have++;
        }
        while(r < s.length() && l < s.length()){
            System.out.println(s.charAt(r) + " " + hm2.getOrDefault(s.charAt(r), 0));
            System.out.println(l + " " + r + " " + have + " " + need + " " + resLen);
            if(have == need){
                if(resLen > r - l + 1){
                    resLen = r - l + 1;
                    start = l;
                    end = r;
                }
                if(l < s.length()){
                    if(hm1.containsKey(s.charAt(l))){
                        System.out.println(s.charAt(l) + " " + hm2.get(s.charAt(l)));
                        hm2.put(s.charAt(l), hm2.get(s.charAt(l)) - 1);
                        if(hm2.get(s.charAt(l)) < hm1.get(s.charAt(l))) have--;
                    }
                    l++;
                }
            }
            else{
                r++;
                if(r < s.length() && hm1.containsKey(s.charAt(r))){
                    hm2.put(s.charAt(r), hm2.getOrDefault(s.charAt(r), 0) + 1);
                    if(hm2.get(s.charAt(r)) == hm1.get(s.charAt(r))) have++;
                }
            }
            System.out.println(l + " " + r + " " + have + " " + need + " " + resLen);
        }
        if(resLen == Integer.MAX_VALUE) return "";
        StringBuilder re = new StringBuilder(s);
        return (re.substring(start, end + 1)).toString();
    }
}
