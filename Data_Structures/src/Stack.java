public class Stack {
    private LinkedList ll;

    public Stack() {
        ll = new LinkedList();
    }

    public void push(int x){
        ll.push_back(x);
    }

    public int pop(){
        if (ll.isEmpty()) {
            System.out.println("The Stack is empty");
            return -1;
        }
        return ll.pop_back();
    }

    public int peek(){
        if (ll.isEmpty()) {
            System.out.println("The Stack is empty");
            return -1;
        }
        return ll.get(1);
    }

    public boolean is_Empty() {
        return ll.isEmpty();
    }

    public int size() {
        return ll.size();
    }

    @Override
    public String toString() {
        return ll.toString();
    }

    @Override
    public Stack clone(){
        Stack cloned_s = new Stack();

        for (LinkedList.Node temp = this.ll.head; temp != null; temp = temp.next) {
            cloned_s.push(temp.value);
        }
        return cloned_s;
    }
}