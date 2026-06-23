class Solution {
    public boolean isValid(String s){
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }
            else{
                count--;
            }
            if(count<0) return false;
        }
        return count==0;
    }
     List<String> list=new ArrayList<>();

    public void solve(StringBuilder sb,int n){
        if(sb.length()==2*n){
            if(isValid(sb.toString())){
                list.add(new StringBuilder(sb).toString());
                
            }
            return;
        }

        sb.append('(');
        solve(sb,n);
        sb.deleteCharAt(sb.length()-1);

        sb.append(')');
        solve(sb,n);
        sb.deleteCharAt(sb.length()-1);
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        solve(sb,n);
        return list;
    }
}