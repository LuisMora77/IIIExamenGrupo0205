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
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se instancian los recievers
        Cancion cancion1 = new Cancion();
        GaleriaDeFotos galeria1 = new GaleriaDeFotos();
        SMS mensaje1 = new SMS();
        Correo correo1 = new Correo();
        
        //Se instancian los commands con su respectivo reciever
        CancionCommand reproducirCancion = new CancionCommand(cancion1);
        GaleriaCommand abrirGaleria = new GaleriaCommand(galeria1);
        SMSCommand enviarMensaje = new SMSCommand(mensaje1);
        CorreoCommand enviarCorreo = new CorreoCommand(correo1);
        
        
        
    }
    
}
