package y4_SinglyLinkedListQueue;

/**
 * @author yusuf düzgün license : GNU
 */
public class SinglyLinkedListQueue {

    private Node front = null;
    private Node rear = null;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (rear == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Object e) {
        Node nNode = new Node();
        nNode.element = e;
        nNode.next = null;
        if (isEmpty()) {
            front = nNode;
            rear = nNode;
            size++;
        } else {
            front.next = nNode;
            front = nNode;
            size++;
        }
    }

    public Object dequeue() {
        Object temp = null;
        if (isEmpty()) {
            rear = null;
            return temp;
        } else {
            temp = rear.element;
            rear = rear.next;
            size--;
            return temp;
        }
    }

    public Object getRearElement() {
        return rear.element;
    }

    public String nodeS() {
        String nodeText = "";
        Node nNode = new Node();
        nNode = rear;
        while (nNode != null) {
            nodeText = nodeText + nNode.element + " - ";
            nNode = nNode.next;
        }
        return nodeText;
    }
}
