class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty() || s.length() == 1){
            return true;
        }

        int l = 0, r = s.length()-1;
        
        while( l<r ){
            char left = Character.toLowerCase(s.charAt(l));
            char right =  Character.toLowerCase(s.charAt(r));
            if( !Character.isLetterOrDigit(left) ){
                l++;
            }else if( !Character.isLetterOrDigit(right) ){
                r--;
            }else{
                if( left == right ){
                    l++;
                    r--;
                }else{
                    return false;
                }
            }
        }
        return true;
      
    }
}
