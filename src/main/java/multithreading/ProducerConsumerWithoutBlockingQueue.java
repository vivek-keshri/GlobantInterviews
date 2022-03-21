package multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class MyBlockingQueue<E>{

    private Queue<E> queue;
    private int max = 16;
    private ReentrantLock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public MyBlockingQueue(int size) {
        queue = new LinkedList<>();
        this.max = size;
    }

    public void put(E e){
        lock.lock();
        try {
            while(queue.size() == max){
                notFull.await();
                System.out.println("waiting for queue to be empty");
            }
            queue.add(e);
            System.out.println("Produced :: "+e.toString());
            notEmpty.signalAll();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public E take(){
        E item = null;
        lock.lock();
        try{
            while(queue.size() == 0){
                notEmpty.await();
                System.out.println("waiting for queue to be filled");
            }
            item = queue.remove();
            System.out.println("Consumed :: "+item.toString());
            notFull.signalAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally{
            lock.unlock();
        }
        return item;
    }


}
public class ProducerConsumerWithoutBlockingQueue {

    public static void main(String[] args) throws InterruptedException {
        MyBlockingQueue<Integer> buffer = new MyBlockingQueue(2);

        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                buffer.put(10);
                buffer.put(11);
                buffer.put(12);
            }
        });

        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                buffer.take();
                buffer.take();
                buffer.take();
            }
        });

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
