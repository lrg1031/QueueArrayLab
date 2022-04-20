package com.mycompany.queuearray;

public class QueueArray {
    
    private int[] queue;
    private int front;
    private int rear;

    public QueueArray() {
        queue = new int[10];
        front = 0;
        rear = 0;
    }
    
    public int incrementIndex(int index) {
        index++;
        return index % queue.length;
    }
    
    public void enqueue(int item) {
        //rear++;
        //rear = rear % queue.length;
        rear = incrementIndex(rear);
        queue[rear] = item;
    }
    
    public int dequeue() {
        front = incrementIndex(front);
        return queue[front];
    }
    
    public void show() {
        //normal for loop will show 0's and all things not logically on queue
        if(front == rear) {
            System.out.print("Empty queue");
            return;
        }
        int curr = incrementIndex(front);
        
        while(curr != rear) {
            System.out.println(queue[curr]);
            curr = incrementIndex(curr);
        }
        System.out.println(queue[rear]);
    }
    
    public void makeEmpty() {
        front = rear;
    }
    
    public boolean isEmpty() {
        if(front == rear) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean isFull() {
        return true;
    }
    
    public void copy(QueueArray surce) {
        
    }
    
    public static void main(String[] args) {
        QueueArray qa = new QueueArray();
        qa.enqueue(10);
        qa.enqueue(20);
        qa.enqueue(30);
        qa.enqueue(40);
        qa.enqueue(50);
        qa.enqueue(60);
        qa.show();
        System.out.println();
        System.out.println(qa.dequeue());
        System.out.println();
        qa.show();
        qa.enqueue(70);
        qa.enqueue(80);
        qa.enqueue(90);
        qa.enqueue(100);
        System.out.println();
        qa.show();
    }
    
}
