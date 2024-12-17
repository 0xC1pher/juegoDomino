/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ian y jimmy 
 */
public class Bolsa {
    
    // Lista de fichas disponibles en la bols
    private final List<Ficha> fichas;

    // Constructor 
    public Bolsa(List<Ficha> fichasIniciales) {
        
        // Crea una copia de la lista de fichas iniciales
        this.fichas = new ArrayList<>(fichasIniciales);
    }

   
     
   //  toma una ficha de la bolsa si la bolsa está vacía, devuelve null.
   //  Si hay fichas, elimina y devuelve la primera ficha de la lista.

    public Ficha tomarFicha() {
        if (fichas.isEmpty()) {
            return null; // Bolsa vacía
        }
        return fichas.remove(0); // Devuelve la primera ficha
    }

    public int cantidadFichas() {
        return fichas.size();
    }
}
