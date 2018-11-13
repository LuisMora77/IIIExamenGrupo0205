/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo0205.Caso2_Command;

/**
 *
 * @author Luis
 */
public class ThreadInvoker implements Runnable{

    private Command command;

    public ThreadInvoker(Command command) {
        this.command = command;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Iniciando Comando = "+ command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" Fin.");
    }
    
    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
