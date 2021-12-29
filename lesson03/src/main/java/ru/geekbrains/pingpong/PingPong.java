package ru.geekbrains.pingpong;

public class PingPong {

     void test(){
        Thread ping = new Thread(new Message("ping"));
        Thread pong = new Thread(new Message("     pong"));
        pong.start();
        ping.start();
    }


    protected synchronized void printMessage(String message) throws InterruptedException {
        System.out.println(message);
        notify();
        wait();
    }

    protected class Message implements Runnable{

        private String message;
        public Message(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            while (true){
                try {
                    printMessage(message);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
