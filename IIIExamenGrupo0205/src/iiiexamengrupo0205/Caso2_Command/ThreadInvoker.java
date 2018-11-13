/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo0205.Caso2_Command;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author Luis
 */
public class ThreadInvoker{

    private LinkedBlockingQueue<Command> listaDeComandos;
    private Thread[] hilos;
    private boolean apagar;
    
 
    public ThreadInvoker(int n){
        listaDeComandos = new LinkedBlockingQueue<Command>();
        hilos = new Thread[n];
        
        for (int i = 0; i < n; i++) {
            hilos[i] = new hilo("Hilo numero " + i);
            hilos[i].start();
        }
    }
 
    public void agregarComando(Command comando)
    {
        listaDeComandos.add(comando);
    }
 
    public void detener(){
        while (!listaDeComandos.isEmpty()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }

        apagar = true;
        for (Thread workerThread : hilos) {
            workerThread.interrupt();
        }
    }
 
    private class hilo extends Thread
    {
        public hilo(String name)
        {
            super(name);
        }
 
        public void run()
        {
            while (!apagar) {
                Command comando;
                try {
                    comando = listaDeComandos.take();
                    comando.run();
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                
            }
        }
    }

}
