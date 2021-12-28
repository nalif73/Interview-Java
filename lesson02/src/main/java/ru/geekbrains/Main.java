package ru.geekbrains;

import ru.geekbrains.myarraylist.*;
import ru.geekbrains.mylinkedlist.*;


public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> arrayList = new MyArrayListImpl<>(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        arrayList.insert(100, 4);

        System.out.println(arrayList.get(4));

        System.out.println(arrayList);

        arrayList.display();

        System.out.println(arrayList.isEmpty());

        arrayList.remove(7);

        arrayList.display();

        System.out.println(arrayList.size());

        System.out.println(arrayList.indexOf(5));

        System.out.println("-----------------------------------------");

        MyLinkedList<String> myLinkedList = new MyLinkedListImpl();

        myLinkedList.add("Ivanov");
        myLinkedList.add("Petrov");
        myLinkedList.add("Sidorov");
        myLinkedList.add("Kuznetsov");

        System.out.println(myLinkedList.size());

        myLinkedList.remove("Petrov");

        System.out.println(myLinkedList.size());

        System.out.println(myLinkedList.get(1));

        MyIterator<String> iterator = myLinkedList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.print(next+" ");
        }
    }


}
