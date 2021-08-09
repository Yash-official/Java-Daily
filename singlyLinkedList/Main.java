package com.yashh.singlyLinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person yashwanth =new Person("Yashwanth",7);
        Person aakash =new Person("Aakash",8);
        Person sanjai =new Person("Sanjai",9);
        PersonLinkedList list=new PersonLinkedList();
        list.addtoFront(yashwanth);
        list.addtoFront(aakash);
        list.addtoFront(sanjai);
        list.PrintLinkedList();
        list.removeNode();
        list.PrintLinkedList();
    }
}
