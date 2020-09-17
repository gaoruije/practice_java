package java_0917;

public class TestLinkedList {
    private static void testAddFrist(){
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(0);
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.display();
        System.out.println();
    }
    private static void testAddLast(){
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(0);
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.display();
        System.out.println();
    }
    private static void testAddIndex(){
        LinkedList linkedList = new LinkedList();
        linkedList.addIndex(0,0);
        linkedList.addIndex(0,1);
        linkedList.addIndex(1,2);
        linkedList.addIndex(1,3);
        linkedList.addIndex(1,4);
        linkedList.display();
        System.out.println();
    }
    private static void testContains(){
        LinkedList linkedList = new LinkedList();
        linkedList.addIndex(0,0);
        linkedList.addIndex(0,1);
        linkedList.addIndex(1,2);
        linkedList.addIndex(1,3);
        linkedList.addIndex(1,4);
        System.out.println(linkedList.contains(2));
        System.out.println(linkedList.contains(10));
        System.out.println();
    }
    private static void testRemove(){
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(0);
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.toremove(2);
        linkedList.display();

    }
    public static void main(String[] args) {
        testAddFrist();
        testAddLast();
        testAddIndex();
        testContains();
        testRemove();

    }
}

