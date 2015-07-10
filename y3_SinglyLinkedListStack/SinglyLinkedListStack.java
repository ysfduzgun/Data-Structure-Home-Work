/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package y3_SinglyLinkedListStack;

/**
 *
 * @author yusuf
 */
public class SinglyLinkedListStack {

    Node top;
    int size;

    //Constructer Method
    public SinglyLinkedListStack() {
        top = null;
        size = 0;
    }

    //isEmpty
    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    //push method
    public void push(Object e) {
        Node nNode = new Node();
        nNode.element = e;
        nNode.next = top;
        top = nNode;
        size++;
    }

    //pop method
    public Object pop() {
        Object temp = null;
        if (isEmpty()) {
            return -1;
        } else {
            temp = top.element;
            top = top.next;
            size--;
            return temp;
        }
    }

    //top element
    public Object getTopElement() {
        if (isEmpty()) {
            return -1;
        } else {
            return top.element;
        }
    }

    //size
    public int getSize() {
        return size;
    }

    //top Node
    public Node getTop() {
        return top;
    }

    public String nodeS() {
        String node = "";
        Node nNode = new Node();
        nNode = top;
        while (nNode != null) {
            node = node + nNode.element + " - ";
            nNode = nNode.next;
        }
        return node;
    }
}
