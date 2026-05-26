class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        Set<Character> visited=new HashSet<>();
        for(char c:word.toCharArray()){
            if(!visited.contains(c)&& Character.isLowerCase(c)){
                char ch=Character.toUpperCase(c);
                if(word.contains(String.valueOf(ch))){
                    count++;
                }
                visited.add(c);
            }
        }
        return count;
    }
}