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
public class CancionCommand implements Command {
    
    public Cancion cancion;

    public CancionCommand(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public void run() {
        cancion.metodoEncapsulado();
    }
    
}
