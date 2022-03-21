package multithreading;


import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.LinkedList;

class Vehicle{
    private String name;
    private int size;

    public Vehicle(String v){
        this.name = v;
        if(v.equalsIgnoreCase("car")){
            size = 2;
        }
        else if(v.equalsIgnoreCase("van")){
            size = 3;
        }
        else{
            size = 1;
        }
    }

    public int getSize() { return size; }

    public String getName() {
        return name;
    }
}

class parkingLot{

    private Queue<Vehicle> parkingLotQueue;
    private int max;
    private int available_space;
    private ReentrantLock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();
    private static Map<String,Integer> distribution = new HashMap();

    parkingLot(int size){
        parkingLotQueue = new LinkedList<Vehicle>();
        this.max = size;
        this.available_space = max;
    }

    public int emptySpots(){
        System.out.println("Available Space : "+available_space);
        return available_space;
    }

    public int totalSpots(){
        System.out.println("Total Spots : "+max);
        return max;
    }

    public void park(Vehicle veh){
        lock.lock();
        try{
            while(parkingLotQueue.size() == max){
                System.out.println("Waiting for Slots Availability");
                notFull.await();
            }
            if(veh.getName().equalsIgnoreCase("van") && available_space>=3){
                parkingLotQueue.add(veh);
                parkingLotQueue.add(veh);
                parkingLotQueue.add(veh);
                System.out.println("Van Parked");
                int slots = 3;
                if(distribution.containsKey("van")){
                    slots = distribution.get("van");
                    slots+=3;
                }
                distribution.put("van",slots);
                available_space-=slots;
            }
            else if(veh.getName().equalsIgnoreCase("car") && available_space>=2){
                parkingLotQueue.add(veh);
                parkingLotQueue.add(veh);
                System.out.println("Car Parked");
                int slots = 2;
                if(distribution.containsKey("car")){
                    slots = distribution.get("car");
                    slots+=2;
                }
                distribution.put("car",slots);
                available_space-=slots;
            }
            else if(veh.getName().equalsIgnoreCase("bike") && available_space>=1) {
                parkingLotQueue.add(veh);
                System.out.println("bike Parked");
                int slots = 1;
                if (distribution.containsKey("bike")) {
                    slots = distribution.get("bike");
                    slots += 1;
                }
                distribution.put("bike", slots);
                available_space-=slots;
            }
            else{
                System.out.println("There is not enough Space to Park Vehicle");
            }
            notEmpty.signalAll();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }

    public void remove(Vehicle veh){
        lock.lock();
        try{
            while(parkingLotQueue.size() == 0){
                System.out.println("Waiting for Vehicle to be Parked");
                notEmpty.await();
            }
            if(distribution.containsKey(veh.getName())){
                parkingLotQueue.remove(veh);
                if(veh.getName().equalsIgnoreCase("van")){
                    available_space+=3;
                }
                else if(veh.getName().equalsIgnoreCase("car"))
                {
                    available_space+=2;
                }
                else{
                    available_space+=1;
                }
                System.out.println(veh.getName()+" Removed");
            }
            notFull.signalAll();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }


}

class ParkingLotDemo {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");

        parkingLot parking_lot = new parkingLot(3);
        Vehicle car = new Vehicle("car");
        Vehicle bike = new Vehicle("bike");
        Vehicle van = new Vehicle("van");

        Thread parkingThread = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                parking_lot.park(van);
                parking_lot.emptySpots();
                Thread.sleep(1000);
                parking_lot.park(car);
                parking_lot.emptySpots();
                parking_lot.park(bike);
                parking_lot.emptySpots();
                Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread removingThread = new Thread(new Runnable() {

            @Override
            public void run() {
                try{
                    parking_lot.remove(van);
                    parking_lot.emptySpots();
                    Thread.sleep(5000);
                    parking_lot.remove(car);
                    parking_lot.emptySpots();
                    Thread.sleep(2000);
                    parking_lot.remove(bike);
                    parking_lot.emptySpots();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        parkingThread.start();
        removingThread.start();
        parkingThread.join();
        removingThread.join();
    }
}
