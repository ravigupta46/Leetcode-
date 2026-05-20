class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int n=s.length();
        int j=n-1;
        while(i<j){
          
            while(i<j&&!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j&&!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            String front=String.valueOf(s.charAt(i)).toLowerCase();
            String rear=String.valueOf(s.charAt(j)).toLowerCase();
            i++;
            j--;
            if(!front.equals(rear)) {
                return false;
            }
        }

        return true;
    }
}