class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sortedKey = new String(c);
            if(!hm.containsKey(sortedKey)) {
                hm.put(sortedKey,new ArrayList<>());
            }
            hm.get(sortedKey).add(strs[i]);
        }
        //System.out.println(hm);
        return new ArrayList<>(hm.values());
    }
}
