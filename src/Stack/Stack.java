package Stack;

public class Stack {

    //instance variables:-
    private ListNode top;
    private int length;

    //creating a linked list and passing data by the user:-
    public class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
        }
    }
    public Stack(){
        top = null;
        length = 0;
    }
    public int length(){
        return length;
    }

    public boolean isEmpty()
    {
        return length == 0;

    }

    //push function:-

    public void push(int data)
    {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    //pop function:-
    public int pop()
    {
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    //peek() function to return the top element;
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
        }
        return top.data;
    }

    public static void main(String[] args){

        Stack stack = new Stack();
        stack.push(10);
        stack.push(8);
        stack.push(6);
        stack.push(7);

       // System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }


}
