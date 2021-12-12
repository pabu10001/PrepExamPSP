package Hilos;

public class HiloThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Extends Thread --" + i);
        }
    }

    public HiloThread() {
    }
}
