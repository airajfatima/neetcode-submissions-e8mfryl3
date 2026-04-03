class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] charray = new char[26];
            for(int j = 0; j < strs[i].length() ; j++){
                charray[strs[i].charAt(j) - 'a'] += 1;
            }
            String s = new String(charray);
            if(hm.containsKey(s)){
                ArrayList<String> list = hm.get(s);
                list.add(strs[i]);
                hm.put(s, list);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                hm.put(s, list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String, ArrayList<String>> entry : hm.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
// O()
