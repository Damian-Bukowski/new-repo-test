package com.sda.Singleton;

public class SingletonApplication {
    public static void main(String[] args) {
      Queue queue1 = Queue.instanceOf();
      Queue queue2 = Queue.instanceOf();
      Queue queue3 = Queue.instanceOf();
      Queue queue = Queue.instanceOf();

      QueueSingletonEnum instance = QueueSingletonEnum.INSTANCE;
      queue.push("Szymon");
      queue.push("Jan");
      queue.push("Damian");

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue.pop());
    }
}
