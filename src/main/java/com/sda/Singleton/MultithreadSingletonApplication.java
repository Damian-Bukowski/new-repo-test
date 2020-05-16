package com.sda.Singleton;

import java.util.Arrays;
import java.util.List;

public class MultithreadSingletonApplication {
    public static void main(String[] args) throws InterruptedException {
        //CountService countService = CountService.instanceOf();

        CountAction countAction = new CountAction();
        CountAction countAction2 = new CountAction();
        CountAction countAction3 = new CountAction();
        CountAction countAction4 = new CountAction();

        Thread thread = new Thread(countAction);
        Thread thread2 = new Thread(countAction2);
        Thread thread3 = new Thread(countAction3);
        Thread thread4 = new Thread(countAction4);

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep (300);


        System.out.println(CountService.instanceOf().getCount());

    }
}
