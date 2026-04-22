class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans=new ArrayList<>();
        
        for(int i=0;i<queries.length;i++){
            String key=queries[i];
            for(int j=0;j<dictionary.length;j++){
                String key2=dictionary[j];
                int k=0;
                int count=0;
                while(k<key.length()){
                    if(key.charAt(k)!=key2.charAt(k)){
                
                        count++;
                    }
                    k++;
                }
                if(count<=2){
                    ans.add(key);
                  break;
                }
            }
        }
        return ans;
    }
}