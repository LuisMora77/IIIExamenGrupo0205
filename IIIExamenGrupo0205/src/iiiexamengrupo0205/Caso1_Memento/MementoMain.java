/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo0205.Caso1_Memento;

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
        origin.valoresActuales(); // Se imprimen los valores actuales de las variables
        origin.setY(origin.getY()+ origin.getX()); // Prueba de la suma 
        System.out.println("\nSuma entre Y, X realizada"); // Notar que la primera variable del print es donde se almacena el resultado
        origin.valoresActuales(); // Se imprimen los valores actuales de las variables
        origin.setZ(origin.getZ()+5); //  Seteo del valor inicial de z
        System.out.println("\nSumado 5 a Z");
        origin.valoresActuales(); // Se imprimen los valores actuales de las variables
        origin.generarSavepoint(); // Se genera el SAVEPOINT 1 (con indice 0 en el Array de SAVEPOINTS)
        origin.setX(origin.getX()*origin.getY()); // Prueba de la multiplicacion entre variables
        System.out.println("\nmultiplicacion entre X,Y realizada");
        origin.valoresActuales(); // Se imprimen los valores actuales de las variables
        origin.generarSavepoint(); // Se genera el SAVEPOINT 2
        origin.setY(Math.pow(origin.getY(), origin.getZ())); // Prueba de elevar una variable a otra
        System.out.println("\nElevado Y a la potencia Z");
        origin.valoresActuales(); // Se imprimen los valores actuales de las variables
        origin.generarSavepoint();// Se genera el SAVEPOINT 3
        origin.setZ(origin.getZ() - 2.5); // Prueba de resta a Z
        System.out.println("\nRestado 2.5 a Z");
        origin.valoresActuales(); // Se imprimen los valores actuales de las variables
        origin.generarSavepoint(); // Se genera el SAVEPOINT 4
        origin.setX(Math.sqrt(origin.getX()));// Prueba de sacar raiz cuadrada a X
        System.out.println("\nCalculada raiz cuadrada de X");
        origin.valoresActuales(); // Se imprimen los valores actuales de las variables
        origin.generarSavepoint(); // Se genera SAVEPOINT 5
        origin.deshacerUnPaso(); // Se deshace un paso en la calculadora
        origin.deshacerARequerido(1); // Se regresa al paso requerido por el usuario (recordar que siempre es -1 al numero de SAVEPOINT que se desea)
        origin.deshacerTodo(); // Setea todas las variables en 0
        
        // FIN PRUEBAS AUTOMATICAS
    }
    
}
