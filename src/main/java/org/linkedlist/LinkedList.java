package org.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;


    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    //printList
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println("Head : " + head.value);
    }
    public void getTail(){
        System.out.println("Tail : " + tail.value);
    }
    public void getLength(){
        System.out.println("Length : " + length);
    }

    //Append
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
            length = 1;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //RemoveLast
    public Node removeLast(){

        if(length == 0) return null;

        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length --;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;

    }
    //Prepend
    public void prepend(int value){

        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length ++;
    }
    public Node removeFirst(){

        if(length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }

    //Get
    public Node get(int index){
       if(index < 0 || index >= length){
           return null;
       }
       Node temp = head;
       for(int i = 0 ; i < index; i++){
           temp = temp.next;
       }
       return temp;
    }

    //Set
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    //Insert
    public boolean insert(int index, int value){
        Node newNode = new Node(value);
        if(index < 0 || index >= length){
            return false;
        }
        if(index == 0){
            newNode.next = head;
            head = newNode;
            length++;
            return true;
        }
        if(index == length){
            tail.next = newNode;
            tail = newNode;
            length ++;
            return true;
        }
        Node temp = head;
        Node prev = head;
        for(int i = 0 ; i < index ; i++){
            prev = temp;
            temp = temp.next;
        }
        newNode.next = temp;
        prev.next = newNode;
        length++;
        return true;
        }

        //Remove
        public Node remove (int index){
        if(index < 0 || index > length){
            return null;
        }
        if(index == 0){
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            return temp;
        }
        if(index == length){
            Node temp = head;
            for(int i = 0; i < length-1 ; i++){
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            length--;
            return  temp;
        }
        Node temp = head;
        Node prev = head;
        for(int i = 0; i < index; i++){
            prev = temp ;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
        }

        //Reverse
    public void reverse(){

        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int  i = 0; i < length; i++){
           after = temp.next;
           temp.next = before;
           before = temp;
           temp = after;
        }
        }
    }
