class LinkedListMap {
    Node head;
    Node tail;

    static class Node {
        public Node next;
        public Node prev;
        int key;
        int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int key, int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.key == key) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }

        Node newNode = new Node(key, value);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Integer get(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }
        throw new LinkedListMapExceptions.KeyNotFoundException(key);
    }

    public boolean remove(int key) {
        if (isEmpty()) {
            throw new LinkedListMapExceptions.KeyNotFoundException(key);
        }

        Node temp = head;
        while (temp != null) {
            if (temp.key == key) {
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
            temp = temp.next;
        }
        return false;
    }

    public boolean containsKey(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.key == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Node temp = head; temp != null; temp = temp.next) {
            s.append("[").append(temp.key).append(" -> ").append(temp.value).append("] ");
        }
        return s.toString().trim();
    }
}
