package com.example.gscoderpad.high.list;

public class SinglyLL {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.setNext(null);
        // if head is null
        if (head == null)
            head = newNode;
        else {
            Node lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext(); //finding last node of list
            }
            lastNode.setNext(newNode);//setting newNode to last node
        }
    }

    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println("\n");

    }
    //Display

    public String display() {
        StringBuilder sb = new StringBuilder();
        if (head == null) {
            return sb.append("[]").toString();
        } else {

            Node currentNode = head;
            sb.append('[');
            while (currentNode != null) {
                sb.append(currentNode.getData());
                currentNode = currentNode.getNext();
                if (currentNode == null) {
                    return sb.append(']').toString();
                }
                sb.append(',');
            }
        }

        return sb.toString();
    }

    public int length() {
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getNext();
        }
        return count;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }


    public boolean isEmpty() {
        return (head == null) ? true : false;
    }

    public boolean deleteFirst() {
        if (head == null) {
            return false;
        }
        head = head.getNext();
        return true;
    }

    public void reverse() {
        if (head == null) {
            return;
        }
        Node currentNode = head;
        Node previous = null;
        Node next = null;

        while (currentNode != null) {
            next = currentNode.getNext();
            currentNode.setNext(previous);
            previous = currentNode;
            currentNode = next;
        }
        head = previous;

    }

    public int findData(int searchValue) {
        if (head == null)
            return -1;
        Node currentNode = head;
        while (currentNode!= null) {
            if (currentNode.getData() == searchValue)
                return currentNode.getData();
            currentNode = currentNode.getNext();
        }
        return -1;
    }



    public static void main(String[] args) {
        SinglyLL singlyLL = new SinglyLL();
       // System.out.println("IsEmpty:" + singlyLL.isEmpty());
        //System.out.println(singlyLL.length());
        singlyLL.insert(1);
        singlyLL.insert(2);
        singlyLL.insert(3);
        singlyLL.insert(4);
        singlyLL.insert(5);
        singlyLL.insert(6);
       // System.out.println("IsEmpty:" + singlyLL.isEmpty());
       // singlyLL.print();
       // singlyLL.insertFirst(11);
       // singlyLL.print();
       // System.out.println(singlyLL.length());
       // singlyLL.print();
       // System.out.println(singlyLL.deleteFirst());
        singlyLL.print();
        System.out.println(singlyLL.findData(6));
        //System.out.println(singlyLL.findData(20));
        //singlyLL.print();
      //  singlyLL.reverse();
      // System.out.println(singlyLL.display());
    }


}
