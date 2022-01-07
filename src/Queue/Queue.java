package Queue;


//creating queue:-
public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

//Queue created.

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }


    //Enqueue() : adding elements in queue:-


    public void enqueue(int data)
    {
        ListNode temp = new ListNode(data);
        if (isEmpty()){
            front = temp;
        }
        else{
            rear.next = temp;
        }

        rear = temp;
        length++;
    }

       // for printing queue:-
    public void display(){
        if (isEmpty()){
            return;
        }
        ListNode current = front;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    //Dequeue() :- deleting elements from front.
        public int dequeue(){
        if (isEmpty()){
            System.out.print("QueueisEmpty");
        }
        int result = front.data;
        front = front.next;
        if (front==null)
        {
            rear = null;   //for deleting last node.
        }
        length--;
        return result;
        }

        public static void main(String[] args){

            Queue queue = new Queue();
            queue.enqueue(10);
            queue.enqueue(11);
            queue.enqueue(-1);
            queue.enqueue(5);

            queue.dequeue();
            queue.dequeue();
            queue.display();
            System.out.print(queue.front.data + "  This is the front element ");

        }
}
