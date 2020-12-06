package Day10;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void add(int value) {
        root = addTo(root, value);
    }

    private Node addTo(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeft(addTo(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(addTo(current.getRight(), value));
        } else {
            return current;
        }
        return current;
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            preOrderTraversal(node.getLeft());
            System.out.println(node.getValue());
            preOrderTraversal(node.getRight());
        }
    }
}
