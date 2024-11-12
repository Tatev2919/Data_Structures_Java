public class BST {

    // Node class representing a tree node
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    private Node root;
    private int length;

    // Constructor
    public BST() {
        root = null;
    }

    public boolean is_empty(){
        return length == 0;
    }

    @Override
    public BST clone() {
        BST clonedTree = new BST();
        clonedTree.root = cloneNode(this.root);
        return clonedTree;
    }

    private Node cloneNode(Node tmp) {
        if (tmp == null) {
            return null;
        }

        Node newNode = new Node(tmp.value);
        newNode.left = cloneNode(tmp.left);
        newNode.right = cloneNode(tmp.right);
        return newNode;
    }

    public void add(int value) {
        add(root,value);
    }

    public boolean find(int value){
        if (is_empty()) {
            return false;
        } else {
            return find(root, value);
        }
    }

    private boolean find(Node tmp, int value) {
        if (tmp == null) {
            return false;
        }
        if (value == tmp.value) {
            return true;
        } else if (value > tmp.value) {
            return find(tmp.right, value);
        } else {
            return find(tmp.left, value);
        }
    }

    private void add(Node tmp, int value) {
        Node new_node = new Node(value);
        if (root == null) {
            root = new_node;
            length++;
        } else if (value > tmp.value) {
            if (tmp.right == null) {
                tmp.right = new_node;
                length++;
            } else {
                add(tmp.right,value);
            }
        } else if (value < tmp.value) {
            if (tmp.left == null) {
                tmp.left = new_node;
                length++;
            } else {
                add(tmp.left, value);
            }
        }
    }

    public void remove(int value) {
        root = remove(root, value);
    }

    private Node remove(Node node, int value) {
        if (node == null) {
            return null;
        }

        if (value < node.value) {
            node.left = remove(node.left, value);
        } else if (value > node.value) {
            node.right = remove(node.right, value);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            node.value = findMin(node.right);
            node.right = remove(node.right, node.value);
        }
        return node;
    }

    private int findMin(Node node) {
        int minValue = node.value;
        while (node.left != null) {
            node = node.left;
            minValue = node.value;
        }
        return minValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(Node tmp, StringBuilder sb) {
        if (tmp != null) {
            buildString(tmp.left, sb);
            sb.append(tmp.value).append(" ");
            buildString(tmp.right, sb);
        }
    }
}
