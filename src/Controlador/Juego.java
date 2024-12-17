/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.List;

/**
 *
 * @author Ian y Jimmy 
 */
public class Juego {
    // Atributos
    private final String jugador1;
    private final String jugador2;
    private String turnoActual;
    private int extremoIzquierdo = -1;
    private int extremoDerecho = -1;
    private boolean primeraFichaColocada = false;

    // El constructor de la Clase y Inicializa jugadores y turno actual 
    public Juego(String jugador1, String jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.turnoActual = jugador1; // El jugador 1 inicia
    }

    public String getTurnoActual() {
        return turnoActual;
    }
    
    // Metodo para cambiar turno 
    public void cambiarTurno() {
        turnoActual = turnoActual.equals(jugador1) ? jugador2 : jugador1;
    }

    // Metodo para validar la ficha 
    public boolean validarFicha(Ficha ficha) {
        if (!primeraFichaColocada) {
            return ficha.getValorIzquierdo() == ficha.getValorDerecho; // Doble para iniciar
        }
        return (ficha.getValorIzquierdo() == extremoIzquierdo || ficha.getValorDerecho() == extremoIzquierdo ||
                ficha.getValorIzquierdo() == extremoDerecho || ficha.getValorDerecho() == extremoDerecho);
    }
    // Metodo para Colocar fichas y verificar los extremos 
    public void colocarFicha(Ficha ficha) {
        if (!primeraFichaColocada) {
            extremoIzquierdo = ficha.getValorIzquierdo();
            extremoDerecho = ficha.getValorDerecho();
            primeraFichaColocada = true;
        } else {
            if (ficha.getValorIzquierdo() == extremoIzquierdo) {
                extremoIzquierdo = ficha.getValorDerecho();
            } else if (ficha.getValorDerecho() == extremoIzquierdo) {
                extremoIzquierdo = ficha.getValorIzquierdo();
            } else if (ficha.getValorIzquierdo() == extremoDerecho) {
                extremoDerecho = ficha.getValorDerecho();
            } else if (ficha.getValorDerecho() == extremoDerecho) {
                extremoDerecho = ficha.getValorIzquierdo();
            }
        }
    }
    // Metodo para verificar el ganador 
    public String verificarGanador(List<Ficha> fichasJugador1, List<Ficha> fichasJugador2) {
        if (fichasJugador1.isEmpty()) {
            return jugador1;
        }
        if (fichasJugador2.isEmpty()) {
            return jugador2;
        }
        return null;
    }
    // Método para que el bot (máquina) juegue automáticamente su turno
public Ficha jugarTurnoBot(List<Ficha> fichasBot) {
    for (Ficha ficha : fichasBot) {
        if (validarFicha(ficha)) {
            colocarFicha(ficha);
            cambiarTurno();
            // Devuelve la ficha jugada
            return ficha; 
        }
    }
    // Si no tiene fichas válidas, el bot pasa su turno
    cambiarTurno();
    return null;
}
}
