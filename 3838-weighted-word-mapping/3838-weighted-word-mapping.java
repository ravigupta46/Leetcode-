class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans=new StringBuilder();
        for(String s:words){
            int sum=0;
            for(int i=0;i<s.length();i++){
                int idx=s.charAt(i)-'a';
                sum=(sum+weights[idx])%26;
            }
            char ch=(char)(25-sum+'a');
            ans.append(ch);
        }
        return ans.toString();
    }
}