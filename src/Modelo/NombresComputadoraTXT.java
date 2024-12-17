/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jimmy y Ian 


 */
public class NombresComputadoraTXT {

    
    private static final String ARCHIVO_NOMBRES = "nombres_computadora.txt";
    private static final String[] NOMBRES_PREDETERMINADOS = {
        "Manuel", "Andrés", "Antonia", "Chibolo", "Alfredito", "Astuar"
    };

    public static void crearArchivo() throws IOException {
        File archivo = new File(ARCHIVO_NOMBRES);
        if (!archivo.exists()) {
            archivo.createNewFile();
            agregarNombresPredeterminados();
        }
    }

    private static void agregarNombresPredeterminados() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_NOMBRES, true))) {
            for (String nombre : NOMBRES_PREDETERMINADOS) {
                writer.write(nombre);
                writer.newLine();
            }
        }
    }

    public static String obtenerNombreAleatorio() throws IOException {
        List<String> nombres = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_NOMBRES))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                nombres.add(linea);
            }
        }
        if (nombres.isEmpty()) {
            return "Computadora"; // Nombre por defecto si no hay nombres en el archivo
        }
        Random random = new Random();
        int index = random.nextInt(nombres.size());
        return nombres.get(index);
    }    
}
