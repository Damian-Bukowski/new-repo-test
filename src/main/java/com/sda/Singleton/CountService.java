package com.sda.Singleton;

public class CountService {

    private static CountService instance;

    public synchronized static CountService instanceOf() {
        if (instance == null) {
            System.out.println("Creating CountService");
            instance = new CountService();
            }
            return instance;
    }

    private Integer count = 0;

private CountService() {}

public synchronized void increment() {
    this.count = this.count + 1;
}

public Integer getCount() {
    return count;

}
}