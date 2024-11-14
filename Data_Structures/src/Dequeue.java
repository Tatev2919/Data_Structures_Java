public class Dequeue {
    private LinkedList ll;

    public Dequeue() {
        ll = new LinkedList();
    }
    // Adds an element to the front of the deque
    public void addFront(int x){
        ll.push_front(x);
    }

    // Adds an element to the back of the deque
    public void addBack(int x){
        ll.push_back(x);
    }

    // Removes and returns the element at the front of the deque
    public int removeFront(){
        if (isEmpty()) {
            throw new IllegalStateException("The DeQueue is empty, cannot dequeue.");
        }
        int val = ll.get(1);
        ll.remove(1);
        return val;
    }

    // Removes and returns the element at the back of the deque
    public int removeBack(){
        if (isEmpty()) {
            throw new IllegalStateException("The DeQueue is empty, cannot dequeue.");
        }
        return ll.pop_back();
    }

    // Returns the element at the front of the deque without removing it
    public int peekFront(){
        if (isEmpty()) {
            throw new IllegalStateException("The DeQueue is empty, cannot dequeue.");
        }
        return ll.get(1);
    }

    // Returns the element at the back of the deque without removing it
    public int peekBack(){
        if (isEmpty()) {
            throw new IllegalStateException("The DeQueue is empty, cannot dequeue.");
        }
        return ll.tail.value;
    }

    // Checks if the deque is empty
    public boolean isEmpty(){
        return ll.isEmpty();
    }

    // Returns the number of elements in the deque
    public int size(){
        return ll.size();
    }

    // Clears all elements from the deque
    public void clear(){
        ll.head = null;
        ll.tail = null;
    }

    // Returns a string representation of the deque
    @Override
    public String toString(){
        return ll.toString();
    }

    // Creates and returns a deep copy of the deque
    @Override
    public Dequeue clone(){
        Dequeue cloned_d = new Dequeue();

        for (LinkedList.Node temp = this.ll.head; temp != null; temp = temp.next) {
            cloned_d.addBack(temp.value);
        }
        return cloned_d;
    }
}
