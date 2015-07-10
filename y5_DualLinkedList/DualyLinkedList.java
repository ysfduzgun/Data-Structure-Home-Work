/*
 * To change this license front, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package y5_DualLinkedList;

/**
 *
 * @author yusuf
 */
public class DualyLinkedList {

    private dNode front;
    private dNode rear;
    private int size;

    public DualyLinkedList() {
        front = new dNode();
        rear = new dNode();
        front.next = rear;
        front.prev = null;
        rear.prev = front;
        rear.next = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void addFront(Object e) {
        if (isEmpty()) {
            dNode nNode = new dNode();
            nNode.element = e;
            nNode.prev = front;
            nNode.next = rear;
            rear.prev = nNode;
            front.next = nNode;
            size++;
        } else {
            dNode nNode = new dNode();
            front.next.prev = nNode;
            nNode.next = front.next;
            nNode.prev = front;
            front.next = nNode;
            nNode.element = e;
            size++;
        }
    }

    public Object delFront() {
        if (isEmpty()) {
            return null;
        } else {
            Object temp = front.next.element;
            front.next = front.next.next;
            front.next.prev.prev = null;
            front.next.prev.element = null;
            front.next.prev.next = null;
            front.next.prev = front;
            size--;
            return temp;
        }
    }

    public void addRear(Object e) {
        if (isEmpty()) {
            dNode nNode = new dNode();
            nNode.element = e;
            nNode.prev = front;
            nNode.next = rear;
            rear.prev = nNode;
            front.next = nNode;
            size++;
        } else {
            dNode nNode = new dNode();
            nNode.element = e;
            rear.prev.next = nNode;
            nNode.next = rear;
            nNode.prev = rear.prev;
            rear.prev = nNode;
            size++;
        }
    }

    public Object delRear() {
        if (isEmpty()) {
            return null;
        } else {
            Object temp = rear.prev.element;
            rear.prev.next = null;
            rear.prev = rear.prev.prev;
            rear.prev.next.element = null;
            rear.prev.next.prev = null;
            rear.prev.next = rear;
            size--;
            return temp;
        }
    }

    public int getSize() {
        return size;
    }

    public Object selectedNodeAddingToTheRear(String sel, String e) {
        dNode selNode = new dNode();
        selNode = front;
        while (selNode != null) {
            String ysf = "" + selNode.element;
            if (ysf.equals(sel)) {
                size++;
                dNode nNode = new dNode();
                nNode.element = e;
                nNode.next = selNode.next;
                selNode.next.prev = nNode;
                nNode.prev = selNode;
                selNode.next = nNode;
                break;
            }
            selNode = selNode.next;
        }
        return selNode;
    }

    public Object selectedNodeAddingToTheFront(String sel, String e) {
        dNode selNode = new dNode();
        selNode = front;
        while (selNode != null) {
            String ysf = "" + selNode.element;
            if (ysf.equals(sel)) {
                size++;
                dNode nNode = new dNode();
                nNode.element = e;
                nNode.next = selNode;
                selNode.prev.next = nNode;
                nNode.prev = selNode.prev;
                selNode.prev = nNode;
                break;
            }
            selNode = selNode.next;
        }
        return selNode;
    }

    public Object selectedNodeDelete(String sel) {
        if (isEmpty()) {
            return null;
        } else {
            dNode selNode = new dNode();
            selNode = front;
            Object temp = null;
            while (selNode != null) {
                String ysf = ""+selNode.element;
                if (ysf.equals(sel)) {
                    size--;
                    temp = selNode.element;
                    selNode.prev.next = selNode.next;
                    selNode.next.prev = selNode.prev;
                    selNode.next = null;
                    selNode.prev = null;
                    selNode.element = null;
                    break;
                }
                selNode = selNode.next;
            }
            return temp;
        }
    }

    public String NodeS() {
        String nodeText = "";
        dNode textNode = new dNode();
        textNode = front;
        while (textNode != null) {
            nodeText = nodeText + textNode.element + " - ";
            textNode = textNode.next;
        }
        return nodeText;
    }

}
