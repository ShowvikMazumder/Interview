public class Doubt {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Doubt(){
        head=null;
    }
    void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    void reverseList(){
        if(head==null || head.next==null) return;
        Node previous = null;
        Node current=head;

        while (current!=null){
            Node front=current.next;

            current.next=previous;
            previous=current;
            current=front;
        }
        head=previous;
    }
    void printList(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" , ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        Doubt list = new Doubt(); // new instance. Dont go with the name of the class
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();
        list.reverseList();
        System.out.println();
        list.printList();
    }
}
