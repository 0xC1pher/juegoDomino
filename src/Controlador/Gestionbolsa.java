/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Ian y Jimmy
 */
public class Gestionbolsa {
    // Lista con todas las fichas disponibles inicialmente.
    private final List<String> fichasDisponibles;
    // Lista que representará el bolso de fichas restantes.
    private final List<String> bolso;

   public Gestionbolsa(List<String> fichasDisponibles) {
        this.fichasDisponibles = fichasDisponibles;
        this.bolso = new ArrayList<>();
    }
    public List<String> inicializarBolso(JButton[] botones) {
        // Lista temporal para almacenar las rutas exactas de las fichas asignadas
        List<String> fichasAsignadas = new ArrayList<>();
        for (JButton boton : botones) {
            if (boton.getIcon() != null) {
                ImageIcon icono = (ImageIcon) boton.getIcon();
                
                // Ruta de la ficha asignada
                String path = icono.getDescription();
                if (path != null && !path.isEmpty()) {
                    fichasAsignadas.add(path);
                }
           }
        }
        // Llenar el bolso solo con las fichas restantes que no están asignadas
        for (String ficha : fichasDisponibles) {
            if (!fichasAsignadas.contains(ficha)) {
                bolso.add(ficha);
            }
        }
        return bolso;
    }
    public int obtenerCantidadFichas() {
        return bolso.size();
    }
    public List<String> getBolso() {
        return bolso;
    }
}
