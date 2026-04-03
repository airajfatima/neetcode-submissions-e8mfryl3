class Solution {
    public String sortString(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return (new String(c));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String sum = sortString(strs[i]);
            if(hm.containsKey(sum)){
                List<String> list = hm.get(sum);
                list.add(strs[i]);
                hm.put(sum, list);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hm.put(sum, list);
            }
        }
        for(List<String> a: hm.values()){
            res.add(a);
        }
        return res;
    }
}
