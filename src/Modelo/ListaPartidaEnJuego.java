/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DevísDavidVergaraDia
 */
public class ListaPartidaEnJuego {

    private static List<PosicionFichaDomino> listaFichasPartida = new ArrayList<>();

    public void agregarFicha(PosicionFichaDomino fichaActual) {
        listaFichasPartida.add(fichaActual);
    }

    public List<PosicionFichaDomino> obtenerListaPartida() {
        return listaFichasPartida;
    }

    public void limpiarListaPartidaEnJuego() {
        listaFichasPartida.clear();
    }

}
