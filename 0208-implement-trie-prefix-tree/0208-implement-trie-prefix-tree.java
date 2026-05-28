class Trie {
    class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children=new Node[26];
           
        
        }
    }
    Node root;
    public Trie() {
        root=new Node();
        
    }
    
    public void insert(String word) {
        int idx=0;
        int level=0;
        int len=word.length();
        Node curr=root;
        for(;level<len;level++){
            idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    
    public boolean search(String word) {
        int len=word.length();
        int idx=0;
        Node curr=root;

        for(int level=0;level<len;level++){
            idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow;
        
    }
    
    public boolean startsWith(String prefix) {
        Node curr = root;
       for(int i=0; i<prefix.length(); i++) {
           int idx = prefix.charAt(i)-'a';
           if(curr.children[idx] == null) {
               return false;
           }
           curr = curr.children[idx];
       }
       return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */