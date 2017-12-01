package Queue.CircularQueue;

import java.util.NoSuchElementException;

public class _2CircularQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public _2CircularQueue(int capacity) {
        queue = new Employee[capacity];
    }
    public void add(Employee employee) {
        //resize or not
        if (queue.length == size()) {
            //save the current size
            int numItems = size();
            Employee[] newQueue = new Employee[ 2 * queue.length];
//            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            System.arraycopy(queue, front, newQueue, 0, queue.length - front);
            System.arraycopy(queue, 0, newQueue, queue.length - front, back);
            queue = newQueue;

            front = 0;
            back = numItems;
        }

        queue[back] = employee;
        if (back < queue.length - 1){
            back++;
        }else {
            back = 0;
        }
    }
    /*
    0   jane
    1   john
    2   -   -back
    3   mike    -front
    4   bill
    front could back to 0
     */
    public Employee remove(){
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        //empty after remove
        if (size() == 0) {
            front = 0;
            back = 0;
        }else if (front == queue.length) {
            front = 0;
        }
        return employee;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size() {
        if (front <= back){
            return back - front;
        }else{
            return back - front + queue.length;
        }

    }
    public void printQueue(){
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }

    }

    public static void main(String[] args) {

    }
}
