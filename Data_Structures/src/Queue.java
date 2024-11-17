public class Queue {
    private LinkedList ll;

    public Queue() {
        ll = new LinkedList();
    }

    // Adds an element to the end of the queue
    public void enqueue(int x){
        ll.push_back(x);
    }

    // Removes and returns the element at the front of the queue
    public int dequeue() throws LinkedListExceptions, LinkedListEmptyException {
        if (isEmpty()) {
            throw new IllegalStateException("The Queue is empty, cannot dequeue.");
        }
        int val = ll.get(0);
        ll.remove(1);
        return val;
    }

    // Returns the element at the front of the queue without removing it
    public int peek() throws LinkedListExceptions {
        if (isEmpty()) {
            throw new IllegalStateException("The Queue is empty, cannot dequeue.");
        }
        return ll.get(1);
    }

    // Checks if the queue is empty
    public boolean isEmpty(){
        return ll.isEmpty();
    }

    // Returns the number of elements in the queue
    public int size(){
        return ll.size();
    }

    // Clears all elements from the queue
    public void clear(){
        ll.head = null;
        ll.tail = null;
    }

    // Returns a string representation of the queue
    @Override
    public String toString(){
        return ll.toString();
    }

    // Creates and returns a deep copy of the queue
    @Override
    public Queue clone(){
        Queue cloned_q = new Queue();

        for (LinkedList.Node temp = this.ll.head; temp != null; temp = temp.next) {
            cloned_q.enqueue(temp.value);
        }
        return cloned_q;
    }
}
