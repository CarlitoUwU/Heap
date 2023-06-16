public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    T item;
    int priority;

    Node(T item, int priority) {
        this.item = item;
        this.priority = priority;
    }

    public int compareTo(Node<T> other) {
        return this.priority - other.priority;
    }
}