class MyQueue {
    Deque<Integer> queue = new ArrayDeque<Integer>();
    Deque<Integer> aux = new ArrayDeque<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        queue.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while (queue.size() != 0) aux.push(queue.pop());
        aux.pop();
        while (aux.size() != 0) queue.push(aux.pop());
    }

    // Get the front element.
    public int peek() {
        while (queue.size() != 0) aux.push(queue.pop());
        int ret = aux.peek();
        while (aux.size() != 0) queue.push(aux.pop());
        
        return ret;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return queue.size() == 0 ? true : false;
    }
}
