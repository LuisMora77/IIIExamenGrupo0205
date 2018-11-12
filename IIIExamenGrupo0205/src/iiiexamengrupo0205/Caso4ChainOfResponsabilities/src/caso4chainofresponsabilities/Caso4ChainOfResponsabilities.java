/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso4chainofresponsabilities;

import java.util.ArrayList;

/**
 *
 * @author Monserrath
 */
public class Caso4ChainOfResponsabilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Archivos de "prueba"
        Archivo texto = new Archivo("Recet.txt", "txt", "C:\\Users\\Monserrath\\Documents\\Paciente123");
        Archivo doc = new Archivo("Diagnostico.doc","doc","C:\\Users\\Monserrath\\Documents\\Paciente123");
        Archivo audio = new Archivo("Latidos.mp3","mp3","C:\\Users\\Monserrath\\Paciente123");
        Archivo video = new Archivo("Ultrasonido.mp4", "mp4", "C:\\Users\\Monserrath\\Paciente123");
        Archivo imagenes = new Archivo("Radiografia.png","png","C:\\Users\\Monserrath\\Paciente123");
        Archivo pdf = new Archivo("Radiografia.png","pdf","C:\\Users\\Monserrath\\Paciente123");
        //--------------------------------------
        
        //--------------------------------------
        
        Cliente clienteArchivo = new Cliente();
        
        System.out.println("El archivo a procesar es un: " + texto.getTipo());
        clienteArchivo.almacenar(texto);
        System.out.println("\n");
        
        System.out.println("El archivo a procesar es un: " + imagenes.getTipo());
        clienteArchivo.almacenar(imagenes);
        System.out.println("\n");
        
        System.out.println("El archivo a procesar es un: " + video.getTipo());
        clienteArchivo.almacenar(video);
        System.out.println("\n");
        
        System.out.println("El archivo a procesar es un: " + doc.getTipo());
        clienteArchivo.almacenar(doc);
        System.out.println("\n");
        
        System.out.println("El archivo a proceasr es un: " + audio.getTipo());
        clienteArchivo.almacenar(audio);
        System.out.println("\n");
        
        System.out.println("El archivo a procesar es un: " + pdf.getTipo());
        clienteArchivo.almacenar(pdf);

    }
}
