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
public class CorreoCommand implements Command {
    
    public Correo correo;

    public CorreoCommand(Correo correo) {
        this.correo = correo;
    }
    
    @Override
    public void run() {
        System.out.println("Ejecutando comandos de Correo" );
        correo.metodoEncapsulado();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
}
