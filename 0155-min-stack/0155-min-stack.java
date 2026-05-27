class MinStack {
    Stack<Integer> st;
    int size;
    public MinStack() {
        st=new Stack<Integer>(); 
        size=0;   
    }
    
    public void push(int val) {
        st.add(val);
        size++;
    }
    
    public void pop() {
        st.pop();
        size--;
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int minele=st.peek();
        int idx=0;
        List<Integer> li=new ArrayList<>();
        while(!st.isEmpty()&& idx<size){
            int top=st.pop();
            minele=Math.min(top,minele);
            li.add(top);
            idx++;
        } 
        int i=0;
       while(!li.isEmpty()) {
    st.add(li.remove(li.size() - 1));
}
        return minele;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */