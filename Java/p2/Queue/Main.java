package Queue;
import QueueException.*;

class Queue{
    int arr[];
    int front=0,rear=-1;
    int capacity;

    public Queue(int c){
        capacity=c;
        arr = new int[capacity];
    }

    public void enqueue(int x) throws Overflow{
        if(rear>=capacity-1) {
            throw new Overflow("Queue Full");
        }
        rear++;
        arr[rear]=x;
        System.out.println("Added: "+x);
    }
    public int dequeue() throws Underflow{
        if(front>rear){
            throw new Underflow("Queue Empty.");
        }
        int x=arr[front];
        front++;
        System.out.println("Removed "+x);
        return x;
    }

    public void display(){
        if(front>rear) System.out.println("Queue Empty.");
        else{
            for(int i=front;i<=rear;i++){
                System.out.println(arr[i] + " ");
                System.out.println();
            }
        }
    }

}

public class Main{
    public static void main(String[] args) {
        Queue q=new Queue(3);

        try{
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
        }
        catch(Overflow e){
            System.out.println("Error caught:"+e.getMessage());
        }
        try {
            q.dequeue();
            q.dequeue();
            q.dequeue(); 
            
            q.dequeue(); // 🚨 Triggers Underflow Exception
            
        }
        catch (Underflow e) {
            System.out.println("ERROR CAUGHT: " + e.getMessage());
        }
    }
}