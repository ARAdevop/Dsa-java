package LinkedList;



public class SingleLinkedList{
    private ListNode head;//instance variable of name head :-
    private static class ListNode{
        private int data;
        private ListNode next;


        private ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }
    //finding length pf list:-
    int count = 0;
    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data + "-->");
            current = current.next;
            count++;
        }
        System.out.println("null");
        System.out.println("length of the given linked list is : " + count);

    }

    //inserting node at beginning of Linked LIst:-
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    //moving last element to first :-


    //inserting node at end of the Linked list:-
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head = newNode;
            return ;
        }
        ListNode Current = head;
        while(Current.next!=null)
        {
            Current = Current.next;
        }
        Current.next = newNode;
    }


    public static void main(String[] args) {
        SingleLinkedList node = new SingleLinkedList();
        node.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(2);

        //now we will connect them together

        node.head.next = second; //10-->1
        second.next = third; //10-->1-->4
        third.next = fourth; //10-->1-->4-->2-->null
        node.insertFirst(11);
    //    node.insertFirst(8);
    //    node.insertFirst(1);

        node.insertLast(23);
        node.display();


    }
}
