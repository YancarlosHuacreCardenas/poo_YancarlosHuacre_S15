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
public class animal_14 {
    // Atributos
    private String nombre;
    private String especie;
    private int edad;
    private boolean domesticado;

    // Constructor
    public animal_14(String nombre, String especie, int edad, boolean domesticado) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.domesticado = domesticado;
    }

    // Métodos
    public void emitirSonido() {
        System.out.println(nombre + " emite un sonido.");
    }

    public void envejecer() {
        edad++;
        System.out.println(nombre + " ha envejecido un año.");
    }

    public boolean esDomesticado() {
        return domesticado;
    }

    public String obtenerEspecie() {
        return especie;
    }
}

