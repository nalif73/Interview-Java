package ru.geekbrains.mylinkedlist;

public interface MyIterator<E> {
    boolean hasNext();
    E next();
    E prev();
}
