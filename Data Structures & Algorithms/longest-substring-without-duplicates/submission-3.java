class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1){
            return s.length();
        }
        int largest=1;
        String subs="";
        for(int i=0;i<s.length()-1;i++) {
            subs = ""+s.charAt(i);
            for(int j=i+1;j<s.length();j++) {
                String c = ""+s.charAt(j);
                if(!subs.contains(c)) {
                    subs += c;
                }else {
                    if(subs.length() > largest) {
                        largest = subs.length();
                    }
                    break;
                }
            }
            if(subs.length() > largest) {
                largest = subs.length();
            }

        }
        if(largest > subs.length()) {
            return largest;
        }
        return subs.length();
    }
}
