package ru.geekbrains.mylinkedlist;

public interface MyLinkedList<E> extends MyIterable<E> {
    void add(E val);
    boolean remove(E val);
    int size();
    E get(int index);

}
