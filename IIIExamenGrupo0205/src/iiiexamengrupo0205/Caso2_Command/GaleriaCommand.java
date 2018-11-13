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
public class GaleriaCommand implements Command{

    public GaleriaDeFotos galeria;

    public GaleriaCommand(GaleriaDeFotos galeria) {
        this.galeria = galeria;
    }
    
    @Override
    public void run() {
        System.out.println("Ejecutando comandos de Galeria" );
        galeria.metodoEncapsulado();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
}
