package com.yashh.doublyLinkedList;


public class PersonDoublyLinkedList {
    private PersonNode head;
    private PersonNode tail;
    private int size;

    public void addtoFront(Person person){
        PersonNode personNode=new PersonNode(person);
       personNode.setNext(head);
       if(head==null){
           tail=personNode;
       }else{
           head.setPrevious(personNode);
       }
        head=personNode;
        size++;
    }
    public void addToEnd(Person person){
     PersonNode personNode=new PersonNode(person);
     if(tail==null){
         personNode=head;
     }else{
         personNode.setPrevious(tail);

     }
     tail=personNode;
     size++;
    }
    public PersonNode removeFromFront(){
       PersonNode removeNode=head;
        if(head.getNext()==null){
            tail=null;
        }
        else{
            head.getNext().setPrevious(null);
        }

        head=head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }
    public void PrintLinkedList(){
        PersonNode currentNode=head;
        System.out.print("HEAD - >");
        while (currentNode!=null){
            System.out.print(currentNode.getNode().toString()+" <=> ");
            currentNode=currentNode.getNext();
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }
}
