package com.sda.prototype;

public class PrototypeApplication {
    public static void main(String[] args) {
        QueuePrototypeEnum.A.push("one");
        QueuePrototypeEnum.A.push("two");
        QueuePrototypeEnum.A.push("three");

        QueuePrototypeEnum.A.pop();

        QueuePrototypeEnum.B.push("one-b");

        QueuePrototype.instanceOf(0).push("Szymon");
        QueuePrototype.instanceOf(0).push("Jan");

        QueuePrototype.instanceOf(0).push("Anna");
        QueuePrototype.instanceOf(0).push("Karolina");


    }
}
