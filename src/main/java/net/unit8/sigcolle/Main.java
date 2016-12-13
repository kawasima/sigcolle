package net.unit8.sigcolle;

import enkan.system.EnkanSystem;

/**
 * @author kawasima
 */
public class Main {
    public static void main(String[] args) {
        EnkanSystem system = new MyExampleSystemFactory().create();
        Runtime.getRuntime().addShutdownHook(new Thread(
                () -> system.stop()
        ));
        system.start();
    }
}
