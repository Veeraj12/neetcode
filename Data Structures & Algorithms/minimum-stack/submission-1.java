class MinStack {

    Deque<Integer> minstack;
    Deque<Integer> stack;

    public MinStack() {
        this.minstack = new ArrayDeque<>();
        this.stack = new ArrayDeque<>();
    }

    public void push(int val) {
        if(  minstack.isEmpty() || val <= minstack.peekLast() ){
            minstack.offerLast(val);
        }
        stack.offerLast(val);
    }
    
    public void pop() {
        if(minstack.peekLast().equals(stack.peekLast())){
            minstack.pollLast();
        }
        stack.pollLast();
    }
    
    public int top() {
        return stack.peekLast();
    }
    
    public int getMin() {
        return minstack.peekLast();
    }
}
