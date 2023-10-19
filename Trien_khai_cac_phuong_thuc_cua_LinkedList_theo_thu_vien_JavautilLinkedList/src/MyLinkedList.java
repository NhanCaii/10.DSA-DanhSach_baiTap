public class MyLinkedList {
    private Node head;
    private int numNodes;
    public MyLinkedList(Object data){
        head=new Node(data);
        numNodes++;
    }
    private class Node{
        private Node next;
        private Object data;

        private Node(Object data) {
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }
    public void add(int index, Object data){
        Node temp=head;
        Node holder;

        for (int i = 0; i < index-1 && temp.next!=null; i++) {
            temp=temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next=holder;
        numNodes++;
    }
    public void addFirst(int value){
        Node temp=new Node (value);
        temp.next=head;
        head=temp;
        numNodes++;
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }
    public void remove(int index){
        Node temp=head;
        int count=0;
        while (temp.next!=null){
            count++;
            if(count == index){
                temp.next=temp.next.next;
            } else {
                temp=temp.next;
            }
        }
        numNodes--;
    }
    public int size(){
        return numNodes;
    }
    public boolean contain(Object num){
        Node temp=head;
        while(temp.next!=null){
            if(num == temp.data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}
