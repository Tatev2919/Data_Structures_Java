class LinkedList{
    Node head;
    Node tail;

    static class Node{
        public Node next;
        public Node prev;
        int value;
        public Node(int value){
            this.value = value;
        }
    }

    public boolean isEmpty(){
        return head==null;
    }


    public void push_back(int x){
        Node temp = new Node(x);
        if(isEmpty()){
            head = tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }


    public void push_front(int x){
        Node temp = new Node(x);
        if (isEmpty()) {
            head = tail = temp;
        } else {

            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    public void insert_middle_elem(int x, int i) {
        Node temp = new Node(x);
        if (isEmpty()) {
            head = tail = temp;
        } else {
            int j = 0;
            Node n = head;
            while (n != null && j != i) {
                n = n.next;
                j++;
            }

            if (n != null && n.prev != null) {
                temp.prev = n.prev;
                temp.next = n;
                n.prev.next = temp;
                n.prev = temp;
            }
        }
    }

    public void delete_node(int x){
        if (isEmpty()) {
            return;
        }

        Node temp = head;
        if ( head.value == x ) {
            if (head == tail ) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }

        while (temp != null && temp.value != x) {
            temp = temp.next;
        }

        assert temp != null;
        temp.prev.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    public int get(int index) {
        Node temp = head;
        int i = 1;
        while ( temp!= null && i !=index ) {
            temp = temp.next;
            i++;
        }
        assert temp != null;
        return temp.value;
    }

    public int pop_back() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return -1;
        }
        int val = tail.value;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        return val;
    }

    public boolean remove(int index) {
        if (isEmpty()) {
            return false;
        }

        Node temp = head;

        int i = 1;
        while (temp != null && i != index) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            return false;
        }
        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        return true;
    }

    public boolean find(int x){
        Node temp = head;

        while (temp!=null) {
            if (temp.value == x ) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size(){
        int size = 0;
        for (Node temp = head; temp != null; temp = temp.next) {
            size+=1;
        }
        return size;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Node temp = head; temp != null; temp = temp.next) {
            s.append(temp.value).append(" ");
        }
        return s.toString().trim();
    }

    @Override
    public LinkedList clone() { //In Object class there is Clone function: needs to be overridden -> LinkedList L = current.clone();
        LinkedList ll = new LinkedList();
        Node temp = this.head;

        while (temp != null) {
            ll.push_back(temp.value);
            temp = temp.next;
        }

        return ll;
    }

}