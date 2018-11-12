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
        /* 
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
        */
        // FIN PRUEBAS AUTOMATICAS

        
        
        // PRUEBAS HECHAS POR EL USUARIO DE MANERA DINAMICA (Simplemente descomentar esta seccion y comentar a anterior para hacer uso
        //del menu a continuacion)
        
        
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
           System.out.println("7. Generar SAVEPOINT");
           System.out.println("8. Deshacer un paso");
           System.out.println("9. Deshacer a paso requerido");
           System.out.println("10. Deshacer todo");
           System.out.println("11. Setear variable x");
           System.out.println("12. Setear variable y");
           System.out.println("13. Setear variable z");
           System.out.println("14. Salir");
           
           try{
           System.out.println("Escriba una de las opciones:   ");
           opcion = scan.nextInt();
           
           switch (opcion) {
                    case 1:
                        System.out.println("Ha seleccionado la opcion de sumar");
                        System.out.println("Introduzca la variable en la que desea guardar el resultado (x,y,z).");
                        String variable = scan.nextLine();
                        variable = scan.nextLine();
                        System.out.println("Digite el numero que desea sumarle a la variable " + variable + " (puede ser otra variable de las descritas anteriormente)");
                        String valor = scan.nextLine();
                        switch (variable){
                            case "x":
                                switch(valor){
                                    case "x":
                                        origin.setX(origin.getX() + origin.getX());
                                        System.out.println("Suma realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setX(origin.getX() + origin.getY());
                                        System.out.println("Suma realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setX(origin.getX() + origin.getZ());
                                        System.out.println("Suma realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setX(origin.getX() + Double.parseDouble(valor));
                                        System.out.println("Suma realizada con exito " + origin.valoresActuales());
                                }
                            break;
                            
                            case "y":
                                switch(valor){
                                    case "x":
                                        origin.setY(origin.getY() + origin.getX());
                                        System.out.println("Suma realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setY(origin.getY() + origin.getY());
                                        System.out.println("Suma realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setY(origin.getY() + origin.getZ());
                                        System.out.println("Suma realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setY(origin.getY() + Double.parseDouble(valor));
                                        System.out.println("Suma realizada con exito " + origin.valoresActuales());
                                }
                            break;
                            
                            case "z":
                                switch(valor){
                                    case "x":
                                        origin.setZ(origin.getZ() + origin.getX());
                                        System.out.println("Suma realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setZ(origin.getZ() + origin.getY());
                                        System.out.println("Suma realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setZ(origin.getZ() + origin.getZ());
                                        System.out.println("Suma realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setZ(origin.getZ() + Double.parseDouble(valor));
                                        System.out.println("Suma realizada con exito " + origin.valoresActuales());
                                }
                            break;
                        }
                        break;
                        
                    case 2:
                        System.out.println("Ha seleccionado la opcion de restar");
                        System.out.println("Introduzca la variable en la que desea guardar el resultado (x,y,z).");
                        String variable2 = scan.nextLine();
                        variable2 = scan.nextLine();
                        System.out.println("Digite el numero que desea restarle a la variable " + variable2 + " (puede ser otra variable de las descritas anteriormente)");
                        String valor2 = scan.nextLine();
                        switch (variable2){
                            case "x":
                                switch(valor2){
                                    case "x":
                                        origin.setX(origin.getX() - origin.getX());
                                        System.out.println("Resta realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setX(origin.getX() - origin.getY());
                                        System.out.println("Resta realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setX(origin.getX() - origin.getZ());
                                        System.out.println("Resta realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setX(origin.getX() - Double.parseDouble(valor2));
                                        System.out.println("Resta realizada con exito " + origin.valoresActuales());
                                }
                            break;
                            
                            case "y":
                                switch(valor2){
                                    case "x":
                                        origin.setY(origin.getY() - origin.getX());
                                        System.out.println("Resta realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setY(origin.getY() - origin.getY());
                                        System.out.println("Resta realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setY(origin.getY() - origin.getZ());
                                        System.out.println("Resta realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setY(origin.getY() - Double.parseDouble(valor2));
                                        System.out.println("Resta realizada con exito " + origin.valoresActuales());
                                }
                            break;
                            
                            case "z":
                                switch(valor2){
                                    case "x":
                                        origin.setZ(origin.getZ() - origin.getX());
                                        System.out.println("Resta realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setZ(origin.getZ() - origin.getY());
                                        System.out.println("Resta realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setZ(origin.getZ() - origin.getZ());
                                        System.out.println("Resta realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setZ(origin.getZ() - Double.parseDouble(valor2));
                                        System.out.println("Resta realizada con exito " + origin.valoresActuales());
                                }
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("Ha seleccionado la opcion de multiplicar");
                        System.out.println("Introduzca la variable en la que desea guardar el resultado (x,y,z).");
                        String variable3 = scan.nextLine();
                        variable3 = scan.nextLine();
                        System.out.println("Digite el numero que desea multiplicarle a la variable " + variable3 + " (puede ser otra variable de las descritas anteriormente)");
                        String valor3 = scan.nextLine();
                        switch (variable3){
                            case "x":
                                switch(valor3){
                                    case "x":
                                        origin.setX(origin.getX() * origin.getX());
                                        System.out.println("Multiplicacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setX(origin.getX() * origin.getY());
                                        System.out.println("Multiplicacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setX(origin.getX() * origin.getZ());
                                        System.out.println("Multiplicacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setX(origin.getX() * Double.parseDouble(valor3));
                                        System.out.println("Multiplicacion realizada con exito " + origin.valoresActuales());
                                }
                            break;
                            
                            case "y":
                                switch(valor3){
                                    case "x":
                                        origin.setY(origin.getY() * origin.getX());
                                        System.out.println("Multiplicacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setY(origin.getY() * origin.getY());
                                        System.out.println("Multiplicacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setY(origin.getY() * origin.getZ());
                                        System.out.println("Multiplicacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setY(origin.getY() * Double.parseDouble(valor3));
                                        System.out.println("Multiplicacion realizada con exito " + origin.valoresActuales());
                                }
                            break;
                            
                            case "z":
                                switch(valor3){
                                    case "x":
                                        origin.setZ(origin.getZ() * origin.getX());
                                        System.out.println("Multiplicacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setZ(origin.getZ() * origin.getY());
                                        System.out.println("Multiplicacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setZ(origin.getZ() * origin.getZ());
                                        System.out.println("Multiplicacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setZ(origin.getZ() * Double.parseDouble(valor3));
                                        System.out.println("Multiplicacion realizada con exito " + origin.valoresActuales());
                                }
                            break;
                        }
                        break;
                    case 4:
                        System.out.println("Ha seleccionado la opcion de division");
                        System.out.println("Introduzca la variable en la que desea guardar el resultado (x,y,z).");
                        String variable4 = scan.nextLine();
                        variable4 = scan.nextLine();
                        System.out.println("Digite el numero qpor el que desea dividir la variable " + variable4 + " (puede ser otra variable de las descritas anteriormente)");
                        String valor4 = scan.nextLine();
                        switch (variable4){
                            case "x":
                                switch(valor4){
                                    case "x":
                                        origin.setX(origin.getX() / origin.getX());
                                        System.out.println("Division realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setX(origin.getX() / origin.getY());
                                        System.out.println("Division realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setX(origin.getX() / origin.getZ());
                                        System.out.println("Division realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setX(origin.getX() / Double.parseDouble(valor4));
                                        System.out.println("Division realizada con exito " + origin.valoresActuales());
                                }
                            break;
                            
                            case "y":
                                switch(valor4){
                                    case "x":
                                        origin.setY(origin.getY() / origin.getX());
                                        System.out.println("Division realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setY(origin.getY() / origin.getY());
                                        System.out.println("Division realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setY(origin.getY() / origin.getZ());
                                        System.out.println("Division realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setY(origin.getY() / Double.parseDouble(valor4));
                                        System.out.println("Division realizada con exito " + origin.valoresActuales());
                                }
                            break;
                            
                            case "z":
                                switch(valor4){
                                    case "x":
                                        origin.setZ(origin.getZ() / origin.getX());
                                        System.out.println("Division realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setZ(origin.getZ() / origin.getY());
                                        System.out.println("Division realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setZ(origin.getZ() / origin.getZ());
                                        System.out.println("Division realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setZ(origin.getZ() / Double.parseDouble(valor4));
                                        System.out.println("Division realizada con exito " + origin.valoresActuales());
                                }
                            break;
                        }
                        break;
                    case 5:
                        System.out.println("Ha seleccionado la opcion de potenciacion");
                        System.out.println("Introduzca la variable en la que desea guardar el resultado (x,y,z).");
                        String variable5 = scan.nextLine();
                        variable5 = scan.nextLine();
                        System.out.println("Digite el numero por el que desea potenciar la variable " + variable5 + " (puede ser otra variable de las descritas anteriormente)");
                        String valor5 = scan.nextLine();
                        switch (variable5){
                            case "x":
                                switch(valor5){
                                    case "x":
                                        origin.setX(Math.pow(origin.getX(), origin.getX()));
                                        System.out.println("Potenciacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setX(Math.pow(origin.getX(), origin.getY()));
                                        System.out.println("Potenciacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setX(Math.pow(origin.getX(), origin.getZ()));
                                        System.out.println("Potenciacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setX(Math.pow(origin.getX(), Double.parseDouble(valor5)));
                                        System.out.println("Potenciacion realizada con exito " + origin.valoresActuales());
                                }
                            break;
                            
                            case "y":
                                switch(valor5){
                                    case "x":
                                        origin.setY(Math.pow(origin.getY(), origin.getX()));
                                        System.out.println("Potenciacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setY(Math.pow(origin.getY(), origin.getY()));
                                        System.out.println("Potenciacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setY(Math.pow(origin.getY(), origin.getZ()));
                                        System.out.println("Potenciacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setY(Math.pow(origin.getY(), Double.parseDouble(valor5)));
                                        System.out.println("Potenciacion realizada con exito " + origin.valoresActuales());
                                }
                            break;
                            
                            case "z":
                                switch(valor5){
                                    case "x":
                                        origin.setZ(Math.pow(origin.getZ(), origin.getX()));
                                        System.out.println("Potenciacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setZ(Math.pow(origin.getZ(), origin.getY()));
                                        System.out.println("Potenciacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setZ(Math.pow(origin.getZ(), origin.getZ()));
                                        System.out.println("Potenciacion realizada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setZ(Math.pow(origin.getZ(), Double.parseDouble(valor5)));
                                        System.out.println("Potenciacion realizada con exito " + origin.valoresActuales());
                                }
                            break;
                        }
                        break;
                    case 6:
                        System.out.println("Ha seleccionado la opcion de raiz cuadrada");
                        System.out.println("Introduzca la variable en la que desea guardar el resultado (x,y,z).");
                        String variable6 = scan.nextLine();
                        variable6 = scan.nextLine();
                        System.out.println("Digite el numero al que le desea sacar raiz cuadrada (puede ser otra variable de las descritas anteriormente)");
                        String valor6 = scan.nextLine();
                        switch (variable6){
                            case "x":
                                switch(valor6){
                                    case "x":
                                        origin.setX(Math.sqrt(origin.getX()));
                                        System.out.println("Raiz cuadrada calculada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setX(Math.sqrt(origin.getY()));
                                        System.out.println("Raiz cuadrada calculada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setX(Math.sqrt(origin.getZ()));
                                        System.out.println("Raiz cuadrada calculada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setX(Math.sqrt(Double.parseDouble(valor6)));
                                        System.out.println("Raiz cuadrada calculada con exito " + origin.valoresActuales());
                                }
                            break;
                            
                            case "y":
                                switch(valor6){
                                    case "x":
                                        origin.setY(Math.sqrt(origin.getX()));
                                        System.out.println("Raiz cuadrada calculada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setY(Math.sqrt(origin.getY()));
                                        System.out.println("Raiz cuadrada calculada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setY(Math.sqrt(origin.getZ()));
                                        System.out.println("Raiz cuadrada calculada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setY(Math.sqrt(Double.parseDouble(valor6)));
                                        System.out.println("Raiz cuadrada calculada con exito " + origin.valoresActuales());
                                }
                            break;
                            
                            case "z":
                                switch(valor6){
                                    case "x":
                                        origin.setZ(Math.sqrt(origin.getX()));
                                        System.out.println("Raiz cuadrada calculada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "y":
                                        origin.setZ(Math.sqrt(origin.getY()));
                                        System.out.println("Raiz cuadrada calculada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    case "z":
                                        origin.setZ(Math.sqrt(origin.getZ()));
                                        System.out.println("Raiz cuadrada calculada con exito " + origin.valoresActuales());
                                    break;
                                    
                                    default:
                                        origin.setZ(Math.sqrt(Double.parseDouble(valor6)));
                                        System.out.println("Raiz cuadrada calculada con exito " + origin.valoresActuales());
                                }
                            break;
                        }
                        break;
                    case 7:
                        origin.generarSavepoint();
                        break;
                    case 8:
                        origin.deshacerUnPaso();
                        break;
                    case 9:
                        System.out.println("Digite el numero de SAVEPOINT al que desea regresar:");
                        int savepoint = scan.nextInt();
                        origin.deshacerARequerido(savepoint);
                        break;
                    case 10:
                        origin.deshacerTodo();
                        break;
                    case 11:
                        System.out.println("Digite el valor con el que desea setear la variable x:");
                        int valorX = scan.nextInt();
                        origin.setX(valorX);
                        System.out.println("Variable x seteada con exito, " + origin.valoresActuales());
                        break;
                    case 12:
                        System.out.println("Digite el valor con el que desea setear la variable y:");
                        int valorY = scan.nextInt();
                        origin.setY(valorY);
                        System.out.println("Variable y seteada con exito, " + origin.valoresActuales());
                        break;
                    case 13:
                        System.out.println("Digite el valor con el que desea setear la variable z:");
                        int valorZ = scan.nextInt();
                        origin.setZ(valorZ);
                        System.out.println("Variable z seteada con exito, " + origin.valoresActuales());
                        break;
                    case 14:
                        System.out.println("Gracias por utilizar la calculadora. Hasta pronto.");
                        terminado = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 14");
                }
           
           
           }
           catch(InputMismatchException in){
               System.out.println("Debe insertar un numero de los presentes en el menu");
               scan.next();
           }
            
       }
        
    }
    
}
