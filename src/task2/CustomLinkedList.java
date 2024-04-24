package task2;

import java.util.LinkedList;
import java.util.Objects;

public class CustomLinkedList<E> {
    private Node head;
    private Node last;
    private int size = 0;

    public class Node<E> {
        E val;
        private Node next;
        private Node prev;   // for doubly

        public Node(E val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(E val) {
            this.val = val;
        }
    }

    public void add(E element) {
        if (Objects.isNull(head)) {
            head = new Node(element);
            last = head;
            size++;
            return;
        }
        if (last.next == null) {
            last.next = new Node(element);
            last.next.prev = last.next;   // for doubly
            last = last.next;
            size++;
        }
    }

    public void remove(int ind) {
        if (ind == 0) {
            head = head.next;
            size--;
            return;
        }
        if (ind == size - 1) {
            last = null;

            size--;
        }

        Node temp = head;
        for (int i = 0; i < ind - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public E get(int ind) {

        Node temp = head;
        for (int i = 0; i <= ind; i++) {
            temp = temp.next;
        }
        return (E) temp.val;
    }


    public boolean contains(E element) {
        Node temp = head;
        while (temp != null) {
            if(temp.val.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder("[");
        Node temp = head;
        while (temp.next != null){
            sb.append(temp.val).append(",");
            temp = temp.next;
        }
        sb.append(temp.val).append("]");
        return sb.toString();
    }


    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();

        list.add(23);
        list.add(84);
        list.add(2);
        list.add(13);
        list.add(41);
        list.get(1);
       // list.remove(4);
        System.out.println(list);
      //  System.out.println(list.contains(23));
    }
}
