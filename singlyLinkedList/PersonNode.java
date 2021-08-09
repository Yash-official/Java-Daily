package com.yashh.singlyLinkedList;

public class PersonNode {
    private Person node;
    private PersonNode next;
    PersonNode(Person person){
        node=person;
    }

    public Person getNode() {
        return node;
    }
    public PersonNode getNext() {
        return next;
    }

    public void setNext(PersonNode next) {
        this.next = next;
    }


}
