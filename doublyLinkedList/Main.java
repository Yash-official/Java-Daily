package com.yashh.doublyLinkedList;
public class Main {
public static void main(String[] args) {
        Person yashwanth =new Person("Yashwanth",7);
        Person aakash =new Person("Aakash",8);
        Person sanjai =new Person("Sanjai",9);
        PersonDoublyLinkedList list=new PersonDoublyLinkedList();
        list.addtoFront(yashwanth);
        list.addtoFront(aakash);
        list.addtoFront(sanjai);
        list.addToEnd(yashwanth);
        list.removeFromFront();
        list.PrintLinkedList();
}
}