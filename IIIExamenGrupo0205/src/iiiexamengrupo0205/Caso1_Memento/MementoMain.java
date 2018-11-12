/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo0205.Caso1_Memento;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class MementoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caretaker care = new Caretaker();
        Originator origin = new Originator(care);
        
        // PRUEBAS AUTOMATICAS DE LAS DISTINTAS FUNCIONALIDADES
        
        origin.setX(origin.getX() + 4); // Prueba de suma a X
        System.out.println("\nSumado 4 a X");
        System.out.println(origin.valoresActuales()); // Se imprimen los valores actuales de las variables
        
        origin.setY(origin.getY()+ origin.getX()); // Prueba de la suma 
        System.out.println("\nSuma entre Y, X realizada"); // Notar que la primera variable del print es donde se almacena el resultado
        System.out.println(origin.valoresActuales()); // Se imprimen los valores actuales de las variables
        
        origin.setZ(origin.getZ()+5); //  Seteo del valor inicial de z
        System.out.println("\nSumado 5 a Z");
        System.out.println(origin.valoresActuales()); // Se imprimen los valores actuales de las variables
        
        origin.deshacerUnPaso(); //Se deshace un paso en la calculadora
        origin.generarSavepoint(); // Se genera el SAVEPOINT 1 (con indice 0 en el Array de SAVEPOINTS)
        origin.deshacerUnPaso();
        
        origin.setX(origin.getX()*origin.getY()); // Prueba de la multiplicacion entre variables
        System.out.println("\nmultiplicacion entre X,Y realizada");
        System.out.println(origin.valoresActuales()); // Se imprimen los valores actuales de las variables
        
        origin.generarSavepoint(); // Se genera el SAVEPOINT 2
        origin.deshacerUnPaso();
        
        origin.setY(Math.pow(origin.getY(), origin.getZ())); // Prueba de elevar una variable a otra
        System.out.println("\nElevado Y a la potencia Z");
        System.out.println(origin.valoresActuales()); // Se imprimen los valores actuales de las variables
        
        origin.generarSavepoint();// Se genera el SAVEPOINT 3
        origin.setZ(origin.getZ() - 2.5); // Prueba de resta a Z
        System.out.println("\nRestado 2.5 a Z");
        System.out.println(origin.valoresActuales()); // Se imprimen los valores actuales de las variables
        
        origin.generarSavepoint(); // Se genera el SAVEPOINT 4
        origin.setX(Math.sqrt(origin.getX()));// Prueba de sacar raiz cuadrada a X
        System.out.println("\nCalculada raiz cuadrada de X");
        System.out.println(origin.valoresActuales()); // Se imprimen los valores actuales de las variables
        
        origin.generarSavepoint(); // Se genera SAVEPOINT 5
        origin.deshacerUnPaso(); // Se deshace un paso en la calculadora
        origin.deshacerARequerido(1); // Se regresa al paso requerido por el usuario (recordar que siempre es -1 al numero de SAVEPOINT que se desea)
        origin.deshacerTodo(); // Setea todas las variables en 0
        
        // FIN PRUEBAS AUTOMATICAS

        
        
        // PRUEBAS HECHAS POR EL USUARIO DE MANERA DINAMICA (Simplemente descomentar esta seccion y comentar a anterior para hacer uso
        //del menu a continuacion)
        
        /*
       Scanner scan = new Scanner(System.in);
       boolean terminado = false;
       int opcion; //Guardaremos la opcion del usuario
        System.out.println("Bienvenido/a al programa de calculadora basica. A continuacion, seleccione una de las opciones presentes en el menu:");
       
       while(!terminado){
           
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Potenciar");
           System.out.println("6. Sacar raiz cuadrada");
           System.out.println("7. Sacar raiz cuadrada");
           System.out.println("8. Sacar raiz cuadrada");
           System.out.println("9. Sacar raiz cuadrada");
           System.out.println("10. Sacar raiz cuadrada");
           System.out.println("11. Salir");
           
           try{
           System.out.println("Escriba una de las opciones:   ");
           opcion = scan.nextInt();
           
           switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        break;
                    case 6:
                        System.out.println("");
                        break;
                    case 7:
                        System.out.println("");
                        break;
                    case 8:
                        System.out.println("");
                        break;
                    case 9:
                        System.out.println("");
                        break;
                    case 10:
                        System.out.println("");
                        break;
                    case 11:
                        terminado = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
           
           
           }
           catch(InputMismatchException in){
               System.out.println("Debe insertar un numero de los presentes en el menu");
               scan.next();
           }
            
       }
        */
    }
    
}
