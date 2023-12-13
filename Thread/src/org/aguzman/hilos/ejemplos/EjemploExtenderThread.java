package org.aguzman.hilos.ejemplos;

import org.aguzman.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) {
      
                Thread hilo = new NombreThread("Zeus");
                hilo.start();
                //Thread.sleep(10000);
                Thread hilo2 =new NombreThread("kratos");
                hilo2.start();

                NombreThread hilo3 = new NombreThread("Athenea"); 
                hilo3.start();

                System.out.println(hilo.getState());
                System.out.println(hilo2.getState());
    }

}
