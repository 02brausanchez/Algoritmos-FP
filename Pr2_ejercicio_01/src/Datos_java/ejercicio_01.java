/* ********************* DOCUMENTACION**********************
 
 * Autor:Sanchez Morales Braulio Eduardo 
 * 
 * Descripcion: Programa que hace el interactue con el usario a traves de ciertas preguntas 
 *   
 * Datos de entrada: la información del alumno (nombre, edad, promedio de prepa, nombre
 * de prepa e inicial de carrera)
 * 
 * Datos de salida: Saludo, resumen de información dada, despedida
 
 */

package Datos_java;
import java.util.Scanner;

public class Ejercicio_01 {
static Scanner teclado = new Scanner(System.in);
public static void main(String[] args) {
		
String nombre,escuela;
int edad; 
float promedio; 
char carrera;		
System.out.println(" Hola! ");		
System.out.println("¿Cual es tu nombre?");
nombre = teclado.nextLine();		
System.out.println( " Que tal " + nombre   );		

System.out.println(" ¿Que edad tienes? " );
edad = teclado.nextInt();		

System.out.println(" ¿Con que promedio saliste de la preparatoria? " );
promedio = teclado.nextFloat();		

System.out.println(" ¿Como se llamo tu preparatoria? ");
escuela = teclado.nextLine();		

System.out.println("Escribe la primera letra de tu carrera: B (Ing. Biomedica), E (Ing Electronica), C (Lic. en Computacion)");
carrera = teclado.next().charAt(0);		

System.out.println( nombre + " tienes " +  edad + " años"  + " estuviste en " + escuela + " y sacaste " + promedio + " de calificacion " + "la inicial de tu carrera es:" + carrera ); 
System.out.println(" Hasta luego! " + nombre );

 }
}



