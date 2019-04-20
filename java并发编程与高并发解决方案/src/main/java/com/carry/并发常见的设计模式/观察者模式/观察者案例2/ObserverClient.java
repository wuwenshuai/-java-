package com.carry.并发常见的设计模式.观察者模式.观察者案例2;

public class ObserverClient {
    public static void main(String[] args) {

        Subject subject = new Subject();
        BinaryObserver binaryObserver = new BinaryObserver();
        OctalObserver octalObserver = new OctalObserver();
        subject.addObserver(binaryObserver);
        subject.addObserver(octalObserver);
        subject.setState(10);
        System.out.println("=============");
        subject.setState(100);
    }
}
