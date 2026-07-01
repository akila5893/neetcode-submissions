class Solution {
    public boolean isPalindrome(String s) {
        String word1 = "";
        Character c;
        for(int i=0;i<s.length();i++) {
            c = s.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <='9')) {
                word1 += c;
            }
        }
        word1 = word1.toLowerCase();
        String word2 = new StringBuilder(word1).reverse().toString();
        if(word1.equals(word2)) {
            return true;
        }
        return false;
    }
}
