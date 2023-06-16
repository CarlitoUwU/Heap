public class PriorityQueueHeap<T extends Comparable<T>> {
    
    private Heap<Node<T>> heap;

    public PriorityQueueHeap() {
        heap = new Heap<>();
    }

    public void enqueue(T item, int priority) {
        Node<T> element = new Node<>(item, priority);
        heap.insert(element);
    }

    public T dequeue() {
        Node<T> element = heap.remove();
        return element.item;
    }

    public T front() {
        Node<T> element = heap.remove();
        heap.insert(element);
        return element.item;
    }

    public T back() {
        return heap.remove().item;
    }

    public boolean isEmpty() {
        return true;
    }
}