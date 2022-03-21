package multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class PublisherSubscriber<E> {

    private Queue<E> queue;
    private int max;
    private ReentrantLock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    PublisherSubscriber(int size){
        queue = new LinkedList<>();
        max = size;
    }

    public void publish(E e){
        lock.lock();
        try {
            if(queue.size() == max){
                notFull.await();
                System.out.println("waiting for queue to be empty");
            }
            queue.add(e);
            System.out.println("Published :: "+e.toString());
            notEmpty.signalAll();
        }catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public E Subscribe(){
        E item = null;
        lock.lock();
        try {
            if(queue.size() == 0){
                notEmpty.await();
                System.out.println("waiting for queue to be Filled");
            }
            item = queue.remove();
            System.out.println("Consumed :: "+item.toString());
            notFull.signalAll();
        }catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return item;
    }
}

public class PublisherSubscriberDemo {

    public static void main(String[] args) throws InterruptedException {
        PublisherSubscriber<Integer> buffer = new PublisherSubscriber(1);

        Thread publisherThread = new Thread(new Runnable() {
            @Override
            public void run() {
                buffer.publish(10);
                buffer.publish(11);
                buffer.publish(12);
            }
        });

        Thread subscriberThread = new Thread(new Runnable() {
            @Override
            public void run() {
                buffer.Subscribe();
                buffer.Subscribe();
                buffer.Subscribe();
            }
        });

        publisherThread.start();
        subscriberThread.start();

        publisherThread.join();
        subscriberThread.join();
    }
}
