/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso4chainofresponsabilities;

/**
 *
 * @author Monserrath
 */
public class Cliente {
    private GestorAlmacenamiento gestor = new Texto();
    private Archivo archivo;
    
    public void almacenar(Archivo archivo){
        gestor.procesarArchivo(archivo);
    }
}
