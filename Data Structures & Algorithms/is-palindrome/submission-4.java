class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        Character c,d;
        while(i!=j && i<s.length() && j>=0) {
            c = s.charAt(i);
            d = s.charAt(j);
            if(isValidCharacter(c)) {
                if(isValidCharacter(d)) {
                    if(Character.toLowerCase(c) == Character.toLowerCase(d)) {
                        i++;
                        j--;
                    } else {
                        return false;
                    }
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return true;
    }

    public boolean isValidCharacter(Character c) {
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
        {
            return true;
        }
        return false;
    }
}
