class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s : strs){
            res.append(s.length()).append("#").append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<String>();
        for(int i = 0; i < str.length();){
            StringBuilder len = new StringBuilder();
            while(str.charAt(i) != '#'){
                len.append(str.charAt(i++));
            }
            Integer sz = Integer.parseInt(len.toString());
            i++;
            res.add(str.substring(i, i + sz));
            i = i + sz;
        }
        return res;
    }
}
