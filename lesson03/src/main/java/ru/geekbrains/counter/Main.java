package ru.geekbrains.counter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NewCounter counter = new NewCounter();

        Thread t1 =
                new Thread(
                        () -> {
                            for (int i = 0; i < 1000; i++) {
                                System.out.println(
                                Thread.currentThread().getName() + " " + counter.increaseAndGet());
                            }
                        });
        Thread t2 =
                new Thread(
                        () -> {
                            for (int i = 0; i < 1000; i++) {
                                System.out.println(
                                Thread.currentThread().getName() + " " + counter.increaseAndGet());
                            }
                        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Счетчик = " + counter.get());
    }
}
