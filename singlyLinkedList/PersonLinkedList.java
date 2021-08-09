package com.yashh.singlyLinkedList;

public class PersonLinkedList {
    private PersonNode head;
    private int size;

    public void addtoFront(Person person){
        PersonNode personNode=new PersonNode(person);
        personNode.setNext(head);
        head=personNode;
        size++;
    }
    public PersonNode removeNode(){
        if(size<0){
            return null;
        }
        PersonNode removeNode=head;
        removeNode.setNext(null);
        head=head.getNext();
        size--;
        return removeNode;
    }
    public void PrintLinkedList(){
        PersonNode currentNode=head;
        System.out.print("HEAD - >");
        while (currentNode!=null){
            System.out.print(currentNode.getNode().toString()+" -> ");
            currentNode=currentNode.getNext();
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }
}
