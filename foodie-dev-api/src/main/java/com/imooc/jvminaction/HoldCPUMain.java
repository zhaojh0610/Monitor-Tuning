package com.imooc.jvminaction;

/**
 * @author : zhaojh
 * @date : 2020/12/6 10:59
 * @description : 模拟CPU高占用率
 */
public class HoldCPUMain{

    //  大量占用CPU
    public static class HoldCPUTask implements Runnable {
        @Override
        public void run() {
            while (true) {
                double v = Math.random() * Math.random();
                System.out.println(v);
            }
        }
    }

    //  大量空闲CPU
    public static class LazyTask implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        //  开启线程占用CPU
        new Thread(new HoldCPUTask()).start();
        //  开启空闲线程
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
    }
}
