/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author DevísDavidVergaraDia
 */
public class PosicionFichaDomino {
    private String nombreImagene;  
    private int posicion;
    private int numeroFichaArriba;
    private int numeroFichaAbajo;
    private int rotacion;

    public PosicionFichaDomino(String nombreImagene, int posicion, int numeroFichaArriba, int numeroFichaAbajo, int rotacion) {
        this.nombreImagene = nombreImagene;
        this.posicion = posicion;
        this.numeroFichaArriba = numeroFichaArriba;
        this.numeroFichaAbajo = numeroFichaAbajo;
        this.rotacion = rotacion;
    }

    public String getNombreImagene() {
        return nombreImagene;
    }

    public void setNombreImagene(String nombreImagene) {
        this.nombreImagene = nombreImagene;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNumeroFichaArriba() {
        return numeroFichaArriba;
    }

    public void setNumeroFichaArriba(int numeroFichaArriba) {
        this.numeroFichaArriba = numeroFichaArriba;
    }

    public int getNumeroFichaAbajo() {
        return numeroFichaAbajo;
    }

    public void setNumeroFichaAbajo(int numeroFichaAbajo) {
        this.numeroFichaAbajo = numeroFichaAbajo;
    }

    public int getRotacion() {
        return rotacion;
    }

    public void setRotacion(int rotacion) {
        this.rotacion = rotacion;
    }
    
    

  
}