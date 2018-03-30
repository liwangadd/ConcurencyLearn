package com.concurency.chap3;

public class LockSupportIntDemo {

    public static Object u = new Object();
    static ChangeObjectThread t1 = new ChangeObjectThread("t1");

    public static class ChangeObjectThread extends Thread{

        public ChangeObjectThread(String name){
            super.setName(name);
        }

        @Override
        public void run() {
            super.run();
        }
    }

}
