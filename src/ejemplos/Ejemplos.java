/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos; 

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        Scanner teclado= new Scanner(System.in);
        
        String nombre, apellidos, localidad, edad, gustos, sumar, contar= "";
        String nombrePrograma= "";
        String nombrePrograma1= "";
        int codigo= 1;
        int goodBye= 0;
        int numero= 2;
        int numeroUno= 3;
        int numSumaUno, numSumaDos, resultadoSuma= 0;
                
        while (codigo != goodBye){
            
        System.out.println("¿Cual es tu Nombre para dirigirme a ti?");
        nombre= teclado.nextLine();
        
        System.out.println("Muy bien, hola, "+ nombre);
        
        System.out.println("¿Cual quieres que sea mi nombre?: ");
        nombrePrograma= teclado.nextLine();
        
        System.out.println("Fabuloso mi nombre será: " + nombrePrograma);
        
        System.out.println("¿Quieres conocer a mi amigo virtual?: ");
        nombrePrograma1= teclado.nextLine();
        
        System.out.println("Su nombre es: Ralphas. Yo soy más de letras y a Raphals le gusta jugar con cálculo.");
                
        System.out.println("¿Cual son tus Apellidos?");
        apellidos= teclado.nextLine();
        
        System.out.println("Pues mis Apellidos son I. A.");
        
        System.out.println("¿Donde vives?");
        localidad= teclado.nextLine();
        
        System.out.println("Pues yo vivo en el Lenguaje de la POO.");
        
        System.out.println("¿Qué edad tienes?");
        edad= teclado.nextLine();
        
        System.out.println("Yo recien nací de Java el día 12/11/2021.");
        
        System.out.println("¿Qué te gusta hacer?");
        gustos= teclado.nextLine();
                      
        System.out.println(nombrePrograma+ ": A mi enseñar informática.");
        
        System.out.println("Ralphas: ¿Quieres jugar a un juego de cálculo?");
        sumar= teclado.nextLine();
        
        System.out.println("Conforme. Introduce el primer número: ");
        numSumaUno= teclado.nextInt();
        
        System.out.println("Fantástico. Introduce el segundo número: ");
        numSumaDos= teclado.nextInt();
        
        resultadoSuma= numSumaUno + numSumaDos;
        
        System.out.println(nombre + " el resultado de tu suma es: " + resultadoSuma);
        System.out.println();
        
        System.out.println("¿Quieres contar?");
        contar= teclado.nextLine();
        
        System.out.println("Vale. Contamos desde 2 hasta 6.");
        
        do {
            System.out.println(numero + "a " + numeroUno + "b");
            numero++;
            System.out.println(numeroUno + "b " + numero + "a");
            numeroUno++;
            } while (numero<=5);
                       
        System.out.println("¿Quieres hacer tu primer programa en Java? Si escribe 1. No escribe 0.");
        codigo= teclado.nextInt();
        
        if (codigo>goodBye){
            System.out.println("public class MiPrimerPrograma {");
            System.out.println("public static void main(String args []){");
            System.out.println("System.out.println(comilla Mi Primer Programa comilla);} }");
        } else {
            System.out.println("¡GoodBye!");
        }
    }
  }
}
