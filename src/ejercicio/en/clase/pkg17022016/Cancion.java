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
public class Cancion {
    
    private String titulo;
    
    public Cancion() {
        
    }
    public Cancion(String titulo){
        this.titulo = "Close to Me";
    }
    public void sonar(){
        System.out.println("Sonando Canción " + this.titulo);
    }
    public void cambiarTitulo(String nuevoTitulo){
        this.titulo = nuevoTitulo;
    }
}
