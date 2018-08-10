package se.javierdlc;

import se.javierdlc.products.Processor;

public class Main {
    public static void main(String[] args) {
        Processor cpu = new Processor(1,"Intel Core I7",true, 3000, 0);
        cpu.describe();
    }
}
