/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jimmy y Ian 

 */
public class JugadoresHumanosTXT {

    
    private static final String ARCHIVO_JUGADORES = "jugadores.txt";

    public static void crearArchivo() throws IOException {
        File archivo = new File(ARCHIVO_JUGADORES);
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
    }

    public static void registrarJugador(String nombre, String alias, String fechaNacimiento, String tipo) throws IOException {
        crearArchivo();  // Asegura que el archivo exista antes de intentar escribir en él.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_JUGADORES, true))) {
            writer.write(nombre + "," + alias + "," + fechaNacimiento + "," + tipo);
            writer.newLine();
        }
    }

    public static void registrarPartida(String jugador1, String jugador2, int puntaje) throws IOException {
        crearArchivo();  // Asegura que el archivo exista antes de intentar escribir en él.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_JUGADORES, true))) {
            writer.write("Partida: Jugador1=" + jugador1 + ", Jugador2=" + jugador2 + ", Puntaje=" + puntaje);
            writer.newLine();
        }
    }
}
