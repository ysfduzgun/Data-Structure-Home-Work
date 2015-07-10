
package y2_StaticQueue;

/**
 *
 * @author yusuf
 */
public class staticQueue {
    private int front =-1;
    private int rear =-1;
    private int counter =0;
    private int maxSize = 5;
    private int sQueue[] = new int[maxSize];
    
    public boolean isFull(){
        if(counter==maxSize) return true;
        else return false;
    }
    public boolean isEmpty(){
        if(counter == 0 ) return true;
        else return false;
    }
    
    
    public boolean enqueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return false;
        }else {
            rear = (getRear()+1)%maxSize;
            sQueue[getRear()]=data;
            counter++;
            return true;
        }
    }
    
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            front=(getFront()+1)%maxSize;
            int temp = sQueue[getFront()];
            sQueue[getFront()]=-1;
            counter--;
            return temp;
        }
    }

    /**
     * @return the front
     */
    public int getFront() {
        return front;
    }

    /**
     * @return the rear
     */
    public int getRear() {
        return rear;
    }
    
    
}
