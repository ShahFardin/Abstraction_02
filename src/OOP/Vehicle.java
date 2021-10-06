package OOP;

public abstract class Vehicle {
    Vehicle(){
        System.out.println("Vehicle class called");
    }
    void speedLimit(){
        System.out.println("Control your spedd");
    }
    abstract void run();
}

