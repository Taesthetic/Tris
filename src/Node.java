public class Node<T> {
    private int id;
    private T value;
    private Node leftChild;
    private Node rightChild;

    public Node(T value) {
        this.value = value;
        leftChild = null;
        rightChild = null;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}