package ru.geekbrains.myarraylist;

public interface MyArrayList<T> {
        void add(T value);

        void insert(T value, int index);

        T get(int index);

        boolean remove(T value);
        T remove(int index);

        int indexOf(T value);

        int size();

        default boolean isEmpty() {
            return size() == 0;
        }

        void display();
}
