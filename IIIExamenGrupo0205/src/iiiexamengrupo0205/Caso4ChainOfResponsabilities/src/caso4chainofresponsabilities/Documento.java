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
public class Documento extends GestorAlmacenamiento{

    public Documento() {
        this.nombreGestor = "Gestor de Documentos";
        this.siguienteGestor = new Audio();
    }
    public void setSiguienteGestor(GestorAlmacenamiento siguienteGestor) {
        this.siguienteGestor = siguienteGestor;
    }

    @Override
    public void procesarArchivo(Archivo archivo) {
        if(archivo.getTipo().equals("doc")){
            System.out.println("El archivo fue procesado por: "+ nombreGestor);
	}
        else if(siguienteGestor!=null){
            System.out.println(nombreGestor+" no puede procesarlo, entonces pasa a:  "+ siguienteGestor.nombreGestor);
	    siguienteGestor.procesarArchivo(archivo);
	}
        else{
            System.out.println("Ese tipo de archivo no puede ser almacenado");
	}
    }
}
