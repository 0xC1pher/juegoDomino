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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GuardarPartida {

    private String jugador1;
    private String jugador2;
    private boolean contraComputadora;
    private String jugadorConTurno;
    private List<PosicionFichaDomino> listaFichasJugadas;
    private List<String> fichasJugador1;
    private List<String> fichasJugador2;

    public GuardarPartida(String jugador1, String jugador2, boolean contraComputadora, 
                          String jugadorConTurno, List<PosicionFichaDomino> listaFichasJugadas,
                          List<String> fichasJugador1, List<String> fichasJugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.contraComputadora = contraComputadora;
        this.jugadorConTurno = jugadorConTurno;
        this.listaFichasJugadas = listaFichasJugadas;
        this.fichasJugador1 = fichasJugador1;
        this.fichasJugador2 = fichasJugador2;
    }

    public void guardarPartida() {
        try {
            File directorio = new File("src/partidasGuardada");
            if (!directorio.exists()) {
                directorio.mkdirs();
            }

            int contador = 1;
            File archivo;
            do {
                archivo = new File(directorio, "partida_guardada_" + contador + ".txt");
                contador++;
            } while (archivo.exists());

            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));
            escritor.write("Jugador 1: " + jugador1 + "\n");
            escritor.write("Jugador 2: " + (contraComputadora ? "Computadora" : jugador2) + "\n");
            escritor.write("Turno de: " + jugadorConTurno + "\n\n");
            
            escritor.write("Fichas jugadas en el tablero:\n");
            for (PosicionFichaDomino ficha : listaFichasJugadas) {
                escritor.write("Ficha: " + ficha.getNombreImagene() + 
                               " | Posición: " + ficha.getPosicion() + 
                               " | Arriba: " + ficha.getNumeroFichaArriba() + 
                               " | Abajo: " + ficha.getNumeroFichaAbajo() + 
                               " | Rotación: " + ficha.getRotacion() + "\n");
            }

            escritor.write("\nFichas restantes del Jugador 1:\n");
            for (String ficha : fichasJugador1) {
                escritor.write(ficha + "\n");
            }

            escritor.write("\nFichas restantes del Jugador 2:\n");
            for (String ficha : fichasJugador2) {
                escritor.write(ficha + "\n");
            }

            escritor.close();
            System.out.println("Partida guardada en: " + archivo.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
