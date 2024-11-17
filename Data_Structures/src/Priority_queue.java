public class Priority_queue {
    private LinkedList ll;

    public Priority_queue() {
        ll = new LinkedList();
    }

    public void add(int x){
        LinkedList.Node temp = new LinkedList.Node(x);

        if (ll.isEmpty()) {
            ll.head = ll.tail  = temp;
            return;
        }
        if (x < ll.head.value) {
            temp.next = ll.head;
            ll.head.prev = temp;
            ll.head = temp;
            return;
        }
        LinkedList.Node current = ll.head;
        while (current!= null && x > current.value){
            current = current.next;
        }
        if (current == null) {
            ll.tail.next = temp;
            temp.prev = ll.tail;
            ll.tail = temp;
        } else {
            temp.prev = current.prev;
            temp.next = current;
            current.prev.next = temp;
            current.prev = temp;
        }
    }

    // Removes and returns the element at the front of the queue
    public int dequeue() throws LinkedListExceptions, LinkedListEmptyException {
        if (ll.isEmpty()) {
            throw new IllegalStateException("The Queue is empty, cannot dequeue.");
        }
        int val = ll.get(1);
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
    public Priority_queue clone(){
        Priority_queue cloned_q = new Priority_queue();

        for (LinkedList.Node temp = this.ll.head; temp != null; temp = temp.next) {
            cloned_q.add(temp.value);
        }
        return cloned_q;
    }
}
