/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.en.clase.pkg17022016;

/**
 *
 * @author Estudiante
 */
public class EjercicioEnClase17022016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Cancion c = new Cancion("Friday I'm in Love");
        c.sonar();
        Cancion c2 = new Cancion();
        c2.sonar();*/
        
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Nombre");
        String nombre = teclado.next();
        Cliente c = new Cliente(nombre);
        String dato = c.getNombre();
        System.out.println(dato);
    }
}
