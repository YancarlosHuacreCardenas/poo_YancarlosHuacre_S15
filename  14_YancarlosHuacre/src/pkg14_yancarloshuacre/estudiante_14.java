/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_yancarloshuacre;

/**
 *
 * @author Yancarlos
 */
public class estudiante_14 {
    // Atributos
    private String nombre;
    private int edad;
    private double nota;
    private String curso;

    // Constructor
    public estudiante_14(String nombre, int edad, double nota, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.curso = curso;
    }

    // Métodos
    public void estudiar() {
        System.out.println(nombre + " está estudiando en el curso de " + curso);
    }

    public void tomarExamen() {
        System.out.println(nombre + " está tomando un examen.");
    }

    public double obtenerPromedio() {
        return nota;
    }

    public void cambiarCurso(String nuevoCurso) {
        curso = nuevoCurso;
        System.out.println(nombre + " se ha cambiado al curso de " + nuevoCurso);
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

