public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyLinkedList list=new MyLinkedList(8);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);

        list.printList();
        System.out.println();
        System.out.println(list.contain(4));
    }
}