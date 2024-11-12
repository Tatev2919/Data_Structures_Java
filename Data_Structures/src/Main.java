//Stack, Queue, Deque isEmpty, toString clone(), class Map,  BinarySearchTree, PriorityQueue(on LinkedList) , JVM
public class Main
{
    public static void main(String[] args) {
        /*System.out.println("Testing the LinkedList push_back function ----------");
        LinkedList l1 = new LinkedList();
        l1.push_back(10);
        l1.push_back(20);
        l1.push_back(30);
        System.out.println(l1);
        System.out.println("Testing the LinkedList push_front function ----------");
        l1.push_front(5);
        l1.push_front(1);
        System.out.println(l1);
        System.out.println("Testing the LinkedList delete_node function ----------");
        l1.delete_node(1);
        System.out.println(l1);
        l1.delete_node(30);
        System.out.println(l1);
        l1.delete_node(10);
        System.out.println(l1);
        System.out.println("Testing the LinkedList insert_middle_elem function ----------");
        l1.insert_middle_elem(15,1);
        System.out.println(l1);
        System.out.println("Testing the LinkedList get_by_index function ----------");
        System.out.println(l1.get(2));
        System.out.println(l1);
        System.out.println("Testing the LinkedList remove_by_index function ----------");
        l1.remove(1);
        System.out.println(l1);
        System.out.println("Testing the LinkedList find function ----------");
        System.out.println(l1.find(15));
        System.out.println(l1.find(27));
        System.out.println("Testing the LinkedList clone functionality ----------");
        LinkedList cloned_ll = l1.clone();

        System.out.println("cloned version : " + cloned_ll);
        cloned_ll.push_front(5);
        System.out.println("cloned version push 5" +  cloned_ll);
        System.out.println("original version: " + l1);

        System.out.println(l1.remove(1));

        System.out.println("Testing of Stack push --------------------");

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println("Testing of Stack pop --------------------");
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println("Size is equal to: " + s.size());
        System.out.println("Is empty or not ? " + s.is_Empty());
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println("Peek return value is: " + s.peek());

        System.out.println("Size is equal to: " + s.size());
        System.out.println("Is empty or not ? " + s.is_Empty());
        System.out.println("Testing of Stack clone functionality --------------------");
        Stack s1 = s.clone();
        System.out.println(s1);
        s1.push(15);

        System.out.println(s);
        System.out.println(s1);

        System.out.println("Testing the queue functionalities");

        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(15);
        q.enqueue(37);
        System.out.println("Queue after adding the elements " + q);
        q.dequeue();
        System.out.println("Queue after pop the elements  " + q);
        q.dequeue();
        System.out.println("Queue after pop the elements  " + q);
        q.dequeue();
        System.out.println("Queue after pop the elements  " + q);
        System.out.println(q.size());

        q.enqueue(1);
        q.enqueue(15);
        q.enqueue(37);

        System.out.println("Print queue peek : " + q.peek());

        Queue q1 = q.clone();
        q1.enqueue(16);
        System.out.println("Cloned version: " + q1);
        System.out.println("Original version:  " + q);

        q.clear();
        System.out.println("Queue size after removing all the elements: " + q.size());

        System.out.println("Testing the dequeue functionalities");

        Dequeue d = new Dequeue();
        d.addBack(1);
        d.addBack(2);
        d.addBack(45);
        d.addFront(43);
        System.out.println("Testing add back front for dequeue: " + d);
        d.removeBack();
        d.removeFront();
        System.out.println("Testing remove back front for dequeue: " + d);
        System.out.println("Dequeue peek back: " + d.peekBack());
        System.out.println("Dequeue peek back: " + d.peekFront());

        Dequeue d1 = d.clone();
        d1.addBack(24);
        System.out.println("Cloned dequeue" + d1);
        System.out.println("Original dequeue" + d);

        d.clear();
        System.out.println("The size of after removing all the elements " + d.size());*/

        Priority_queue p_q = new Priority_queue();
        p_q.add(1);
        p_q.add(17);
        p_q.add(8);
        System.out.println("Printing the priority queue: " + p_q);
        p_q.add(9);
        p_q.add(13);

        System.out.println("Printing the priority queue: " + p_q);
        p_q.dequeue();
        p_q.dequeue();
        System.out.println("Printing the priority dequeue: " + p_q);

        System.out.println("Testing the Map functions--------------");
        LinkedListMap m = new LinkedListMap();
        m.add(5,1);
        m.add(6,2);
        m.add(7,3);
        System.out.println("LinkedlistMap is : " + m);
        m.remove(5);
        System.out.println("LinkedlistMap is : " + m);
    }
}