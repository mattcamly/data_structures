package printMiddleSLL;


public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList sll=new MySinglyLinkedList();
        for (int i = 1; i <= 6; i++) {
            sll.add(i);
        }
        printMiddle(sll);
    }

    public static void printMiddle(MySinglyLinkedList sll){
        //create two pointers
        Node a =sll.head;
        Node b= sll.head;
        //iterate over the linkedlist
        while(b!=sll.tail && b.next != sll.tail){
            a = a.next; // single jump
            b = b.next.next; // double jump
        }
        // b is located either on tail or before tail
        if(b==sll.tail) System.out.println(a.id);
        else System.out.println(a.id +","+a.next.id);
    }

}
