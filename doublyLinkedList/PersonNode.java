package com.yashh.doublyLinkedList;

import com.yashh.doublyLinkedList.Person;

public class PersonNode {
    private Person node;
    private PersonNode previous;
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

    public void setNode(Person node) {
        this.node = node;
    }

    public Person getPrevious() {
        return previous.getNode();
    }

    public void setPrevious(PersonNode previous) {
        this.previous = previous;
    }

    public void setNext(PersonNode next) {

        this.next = next;
    }


}
