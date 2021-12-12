import Hilos.HiloRunnable;
import Hilos.HiloThread;

public class Main {
    public static void main(String[] args) {


        metodosreacionHilos();

    }

    private static void metodosreacionHilos() {
        //Diferentes metodos para la creacion de hilos
        //implementando Runnable y extendiendo de Thread
        Thread hilo_runnable = new Thread(new HiloRunnable());
        HiloThread hilo_thread = new HiloThread();

        hilo_runnable.start();
        hilo_thread.start();
    }
}
