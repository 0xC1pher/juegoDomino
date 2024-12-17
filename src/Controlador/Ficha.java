/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Ian y Jimmy 
 */
public class Ficha {
      // Atributos y valorees de las fichas
    private final int valorIzquierdo;
    private final int valorDerecho;
    private final String rutaImagen;
    int getValorDerecho;

    // Constructor de nuestra clase ficha 
    public Ficha(int valorIzquierdo, int valorDerecho, String rutaImagen) {
        this.valorIzquierdo = valorIzquierdo;
        this.valorDerecho = valorDerecho;
        this.rutaImagen = rutaImagen;
    }

    // Metodos Get
    public int getValorIzquierdo() {
        return valorIzquierdo;
    }
    public int getValorDerecho() {
        return valorDerecho;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }
    // Método adicional para validar si esta ficha es válida contra los extremos
  public boolean esFichaValida(int extremoIzquierdo, int extremoDerecho, boolean primeraFichaColocada) {
    if (primeraFichaColocada) {
        // Si es la primera ficha, debe ser un doble
        return valorIzquierdo == valorDerecho;
    }
    // Verificar si la ficha coincide con cualquiera de los extremos
    return (valorIzquierdo == extremoIzquierdo || valorDerecho == extremoIzquierdo ||
            valorIzquierdo == extremoDerecho || valorDerecho == extremoDerecho);
}

}