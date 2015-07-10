/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package y1_StaticStack;

import javax.swing.JOptionPane;

/**
 *
 * @author karboran
 */
public class staticStack {
    //array index TOP

    private int top = -1;
    //array size
    private int arraySize = 5;
    //data stack array
    private int stackArray[] = new int[arraySize];

    public boolean isFull() {
        if (top == (arraySize - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean push(int data) {
        if (isFull()) {
            return false;
        } else {
            top++;
            stackArray[top] = data;
            return true;
        }
    }

    public int pop() {
        int temp;
        if (isEmpty()) {
            return -1;
        }else {
            temp = stackArray[top];
            top--;
            return temp;
        }
    }
    
    
    public int getTop(){
        return top;
    }
    public int getArraySize(){
        return arraySize;
    }
}
