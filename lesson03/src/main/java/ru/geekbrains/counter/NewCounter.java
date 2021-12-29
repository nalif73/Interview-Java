package ru.geekbrains.counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NewCounter {

    private final Lock counterLock = new ReentrantLock();
    private int counter = 0;

    public int get() {
        counterLock.lock();
        int localCounter;
        try {
            localCounter = counter;
        } finally {
            counterLock.unlock();
        }
        return localCounter;
    }

    public int increaseAndGet() {
        int localCounter;
        counterLock.lock();
        try {
            counter++;
            localCounter = counter;
        } finally {
            counterLock.unlock();
        }
        return localCounter;
    }
}
