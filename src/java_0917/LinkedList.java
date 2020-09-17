package java_0917;

public class LinkedList {//单向不带环非傀儡链表
    class Node{
        public int data;//存的是数据
        public Node next = null;//表示的是下一个节点的位置

        public Node(int data) {
            this.data = data;
        }
    }

        private Node head = null;//表示空链表

        //头插法
        public void addFirst(int data){
            //要是链表本来为空
            Node node  = new Node(data);
            if(head == null){
                head = node;
                return;
            }
            //若链表不为空
            node.next = head;
            head = node;
        }

        //尾插法
        public void addLast(int data){
            //先判断链表是否为空
            Node node = new Node(data);
            if(head == null){
                head = node;
                return;
            }
            //链表不为空的情况下的
            Node tail = head;//先让tail从head开始
            //while循环，为了找到最后一个节点，只要找到最后一个节点，直接tail.next指向node即可。
            while(tail.next != null){
                tail = tail.next;
            }//while循环后，这时已经找到了最后一个节点了。
            tail.next = node;//就是说tail.next 直接指向node了，node 就是要插入的元素。
        }
        //打印元素的方法，为了测试写的代码
        public void display(){
            for(Node cur = head; cur != null; cur =cur.next){
                System.out.print(cur.data + "  ");
            }
        }

        //任意位置插入
        //先写一个getsize方来获取链表的长度
        public int getSize(){
            int size = 0;
            for(Node cur = head; cur != null; cur = cur.next){
                size ++;
            }
            return size;
        }
        boolean addIndex(int index, int data) {
            //判定一下下标元素是否合法
            int size = getSize();//为了将getsize存起来，下边就不用一直遍历了
            if (index < 0 || index > size) {
                return false;
            }
            //如果index = 0,是头插
            if (index == 0) {
                addFirst(data);
                return true;
            }
            //如果index = size,则是尾插。
            if (index == size) {
                addLast(data);
                return true;
            }
            Node node = new Node(data);
            //如果index是中间位置,要想插入就需要找到index的前一个节点
            Node prev = getPos(index - 1);
            node.next = prev.next;
            prev.next = node;
            return true;
        }
        //给定元素下标 index ，找到对应节点。
        private Node getPos(int index){
            Node cur = head;
            for(int i = 0; i < index; i++){
                cur = cur.next;
            }
            return cur;
        }
        //在链表中找到任意一个元素，如果有就返回ture,没有则返回false
        public boolean contains(int toFind) {
            for (Node cur = head; cur != null; cur = cur.next) {
                if (cur.data == toFind) {
                    return true;
                }
            }
            return false;
        }

        //删除链表中第一个节点出现的元素，toremove方法。
        public void toremove(int toRemove){
            //如果要删除的元素是头节点
            if(head.data == toRemove){
                head = head.next;
                return;
            }
            //要是删除的元素不是头节点，则需要找到要删除元素的上一个节点，
            Node prev = searchPrev(toRemove);//找到toremove的前一个节点。
            // 让上一个元素直接指向下下一个节点。
            //prev.next = prev.next.next;
            Node toDelete = prev.next;
            prev.next = toDelete.next;
        }
        private Node searchPrev(int toRemove){
            for(Node cur = head; cur != null && cur.next != null; cur = cur.next){
                //如果cur.next = toRemove,则说明prev（前一个节点找到了）
                if(cur.next.data == toRemove){//要保证cur.next也不为空，给前边加条件即可
                    return cur;
                }
            }
            return null;
        }
    }


