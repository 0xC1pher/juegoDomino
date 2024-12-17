/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Ficha;
import Modelo.GuardarPartida;
import Modelo.ListaPartidaEnJuego;
import Modelo.PosicionFichaDomino;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jimmy y Ian
 */
public class PantallaTablero extends javax.swing.JFrame {

    ListaPartidaEnJuego listaPartidaEnJuego = new ListaPartidaEnJuego();
    private List<PosicionFichaDomino> tablero = new ArrayList<>();
    boolean esIzquierdo;
    boolean esDerecho;
    private int contadorIzquierda = 0;
    private int contadorDerecha = 0;
    private boolean esPrimeraFicha = true;
    private boolean fichasJugador2Visibles = false;
    private boolean contraComputadora;
    private  String jugador1="";
    private  String jugador2="";

    private final String[] fichas = {
        "/fichas/Ficha_0_0.png", "/fichas/Ficha_1_0.png", "/fichas/Ficha_1_1.png", "/fichas/Ficha_1_2.png", "/fichas/Ficha_1_3.png",
        "/fichas/Ficha_1_4.png", "/fichas/Ficha_1_5.png", "/fichas/Ficha_1_6.png", "/fichas/Ficha_2_0.png",
        "/fichas/Ficha_2_2.png", "/fichas/Ficha_2_3.png", "/fichas/Ficha_2_4.png", "/fichas/Ficha_2_5.png", "/fichas/Ficha_2_6.png",
        "/fichas/Ficha_3_0.png", "/fichas/Ficha_3_3.png", "/fichas/Ficha_3_4.png",
        "/fichas/Ficha_3_5.png", "/fichas/Ficha_3_6.png", "/fichas/Ficha_4_0.png", "/fichas/Ficha_4_4.png", "/fichas/Ficha_4_5.png",
        "/fichas/Ficha_4_6.png", "/fichas/Ficha_5_0.png", "/fichas/Ficha_5_5.png", "/fichas/Ficha_5_6.png", "/fichas/Ficha_6_0.png",
        "/fichas/Ficha_6_6.png"
    };

    /**
     * Creates new form PantallaTablero
     */
    public PantallaTablero(String alias1, String alias2, boolean contraComputadora, boolean cargarPartida) {
         this.jugador1 = alias1;
    this.jugador2 = alias2;
    this.contraComputadora = contraComputadora; 
    turnoJugador1 = true;
    initComponents();
    setLocationRelativeTo(null);
    setTitle("Tablero");
    
    lb_nombre1.setText("Jugador 1: " + jugador1);
    lb_jugador2.setText("Jugador 2: " + jugador2);
    lb_turnoactual.setText("Turno actual: " + jugador1);
    
    // Ocultar botones del jugador 2 al inicio
    cambiarVisibilidadBotonesJugador2(false);

    if (cargarPartida) {
        cargarPartida(alias1);
    } else {
        asignarImagenesAFichas();
        inicializarBolso();

        System.out.println("Contra Computadora: " + this.contraComputadora);

        SwingUtilities.invokeLater(() -> mostrarInicioTurno());
    }
    }
   
    private void mostrarInicioTurno() {
        JOptionPane.showMessageDialog(this, "El jugador que inicia la partida es: " + jugador1);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Tablero = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_cambiarturno = new javax.swing.JButton();
        btntomar = new javax.swing.JButton();
        btn_guardarpartida = new javax.swing.JButton();
        btn_salirjuego = new javax.swing.JButton();
        lb_fichas = new javax.swing.JLabel();
        lb_turnoactual = new javax.swing.JLabel();
        btn_fichajugadorhumano1 = new javax.swing.JButton();
        btn_fichajugadorhumano2 = new javax.swing.JButton();
        btn_fichajugadorhumano3 = new javax.swing.JButton();
        btn_fichajugadorhumano4 = new javax.swing.JButton();
        btn_fichajugadorhumano5 = new javax.swing.JButton();
        btn_fichajugadorhumano6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_ficha1jugador2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_ficha2jugador2 = new javax.swing.JButton();
        btn_ficha3jugador2 = new javax.swing.JButton();
        btn_ficha4jugador2 = new javax.swing.JButton();
        btn_ficha5jugador2 = new javax.swing.JButton();
        btn_ficha6jugador2 = new javax.swing.JButton();
        lb_jugador2 = new javax.swing.JLabel();
        lb_nombre1 = new javax.swing.JLabel();
        btn_fichajugadorhumano7 = new javax.swing.JButton();
        btn_ficha7jugador2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Tablero.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Tablero.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 0)));
        Panel_Tablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_TableroMouseClicked(evt);
            }
        });
        Panel_Tablero.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 2, 18)); // NOI18N
        jLabel1.setText("Domino Latina");

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 3, 14)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 3, 14)); // NOI18N
        jLabel4.setText("Piezas Disponibles ");

        btn_cambiarturno.setBackground(new java.awt.Color(255, 0, 0));
        btn_cambiarturno.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        btn_cambiarturno.setText("Pasar turno");
        btn_cambiarturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarturnoActionPerformed(evt);
            }
        });

        btntomar.setBackground(new java.awt.Color(255, 0, 0));
        btntomar.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        btntomar.setText("Tomar Pieza");
        btntomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntomarActionPerformed(evt);
            }
        });

        btn_guardarpartida.setBackground(new java.awt.Color(255, 0, 0));
        btn_guardarpartida.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        btn_guardarpartida.setText("Guardar Partida");
        btn_guardarpartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarpartidaActionPerformed(evt);
            }
        });

        btn_salirjuego.setBackground(new java.awt.Color(255, 0, 0));
        btn_salirjuego.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        btn_salirjuego.setText("Salir del Juego ");
        btn_salirjuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirjuegoActionPerformed(evt);
            }
        });

        lb_fichas.setFont(new java.awt.Font("Showcard Gothic", 3, 14)); // NOI18N
        lb_fichas.setText(".");

        lb_turnoactual.setFont(new java.awt.Font("Showcard Gothic", 3, 14)); // NOI18N
        lb_turnoactual.setText(".");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_fichas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_guardarpartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cambiarturno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntomar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salirjuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(lb_turnoactual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_fichas)
                .addGap(26, 26, 26)
                .addComponent(btntomar)
                .addGap(51, 51, 51)
                .addComponent(btn_guardarpartida)
                .addGap(49, 49, 49)
                .addComponent(btn_cambiarturno)
                .addGap(64, 64, 64)
                .addComponent(btn_salirjuego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_turnoactual)
                .addGap(42, 42, 42))
        );

        btn_fichajugadorhumano6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fichajugadorhumano6ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 3, 14)); // NOI18N
        jLabel2.setText("Fichas Jugador  2  o Máquina");

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 3, 14)); // NOI18N
        jLabel5.setText("Fichas Jugador  : 1");

        lb_jugador2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        lb_jugador2.setText(".");

        lb_nombre1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        lb_nombre1.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Panel_Tablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_fichajugadorhumano1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_fichajugadorhumano2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_fichajugadorhumano3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_fichajugadorhumano4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_fichajugadorhumano5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_fichajugadorhumano6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_fichajugadorhumano7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(145, 145, 145))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addComponent(btn_ficha1jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_ficha2jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ficha3jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ficha4jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ficha5jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ficha6jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ficha7jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lb_jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1)
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel2)
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel3))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_ficha6jugador2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                        .addComponent(btn_ficha5jugador2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_ficha4jugador2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_ficha3jugador2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_ficha2jugador2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_ficha1jugador2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_ficha7jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lb_jugador2)
                        .addGap(53, 53, 53)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Tablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lb_nombre1)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_fichajugadorhumano7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_fichajugadorhumano3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(btn_fichajugadorhumano1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_fichajugadorhumano2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_fichajugadorhumano5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_fichajugadorhumano4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_fichajugadorhumano6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String fichaSeleccionada = null;  // Almacena la ruta de la imagen seleccionada
    private JButton botonSeleccionado = null;
    private boolean primeraFichaColocada = false;
    private int extremoIzquierdo = -1;
    private int extremoDerecho = -1;
    private final int cellWidth = 100;
    private final int cellHeight = 50;
    private List<String> bolso;
    private boolean turnoJugador1 = true;
    private static int x = 400;
    private static int y = 200;
    private static int xLadoIzquierdo = 400;
    private static int xLadoDerecho = 400;
    private static int yLadoIzquierdo = 200;
    private static int yLadoDerecho = 200;

    private void asignarImagenesAFichas() {
        // Array de botones para las fichas del jugador humano
        JButton[] botones = {
            btn_fichajugadorhumano1, btn_fichajugadorhumano2, btn_fichajugadorhumano3, btn_fichajugadorhumano4,
            btn_fichajugadorhumano5, btn_fichajugadorhumano6, btn_fichajugadorhumano7, btn_ficha1jugador2, btn_ficha2jugador2,
            btn_ficha3jugador2, btn_ficha4jugador2, btn_ficha5jugador2, btn_ficha6jugador2, btn_ficha7jugador2
        };

        // Lista para almacenar las rutas de fichas disponibles (sin repeticiones)
        List<String> fichasDisponibles = new ArrayList<>(Arrays.asList(fichas));
        Random random = new Random();

        for (int i = 0; i < botones.length; i++) {
            String fichaPath = null;
            ImageIcon icon = null;

            // Buscar una ficha válida
            while (!fichasDisponibles.isEmpty() && icon == null) {
                // Seleccionar una ficha aleatoria
                int indiceAleatorio = random.nextInt(fichasDisponibles.size());
                fichaPath = fichasDisponibles.get(indiceAleatorio);

                // Verificar si la imagen existe
                if (getClass().getResource(fichaPath) != null) {
                    icon = new ImageIcon(getClass().getResource(fichaPath));
                    icon.setDescription(fichaPath); // Asignar la descripción al icono
                    fichasDisponibles.remove(indiceAleatorio); // Eliminar ficha asignada de la lista
                } else {
                    // Si la imagen no existe, eliminar la ficha de la lista y continuar buscando
                    fichasDisponibles.remove(indiceAleatorio);
                }
            }

            // Asignar la imagen al botón si se encontró una ficha válida
            if (icon != null) {
                botones[i].setIcon(icon);

                // Listener para detectar la selección de una ficha
                final String fichaSeleccionadaPath = fichaPath; // Necesario para el scope de la fichaPath
                botones[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        fichaSeleccionada = fichaSeleccionadaPath;
                        botonSeleccionado = (JButton) e.getSource();
                    }
                });
            } else {
                // Si no quedan fichas válidas para asignar, detener el bucle
                break;
            }
        }
    }
    private void btn_salirjuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirjuegoActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salirjuegoActionPerformed

    private void cambiarTurno() {
     turnoJugador1 = !turnoJugador1; // Cambia de jugador
    String jugadorActual = turnoJugador1 ? jugador1 : jugador2;
    lb_turnoactual.setText("Turno actual: " + jugadorActual);

    // Si es el turno del jugador 2 y las fichas no son visibles aún, mostrarlas
    if (!turnoJugador1 && !fichasJugador2Visibles) {
        cambiarVisibilidadBotonesJugador2(true);
        fichasJugador2Visibles = true; // Marcar las fichas del jugador 2 como visibles permanentemente
    }

    verificarGanador(); // Verifica si alguien ganó

    // Si es el turno de la máquina, juega automáticamente
    if (!turnoJugador1 && contraComputadora) {
        System.out.println("Turno de la máquina iniciado.");
        jugarTurnoBot();
    }
    }


    private void Panel_TableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_TableroMouseClicked
        // TODO add your handling code here:
        // Verificar que una ficha esté seleccionada y que sea el turno correcto
        if (fichaSeleccionada == null || botonSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor selecciona una ficha.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Verificar si es el turno del jugador 1 o del jugador 2
        if (turnoJugador1) {
            if (esFichaDelJugador1(botonSeleccionado)) {
                procesarFichaSeleccionada(evt); // Solo permite si es el turno de jugador 1
            } else {
                JOptionPane.showMessageDialog(this, "Es el turno del jugador 1.", "Turno incorrecto", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            if (esFichaDelJugador2(botonSeleccionado)) {
                procesarFichaSeleccionada(evt); // Solo permite si es el turno de jugador 2
            } else {
                JOptionPane.showMessageDialog(this, "Es el turno del jugador 2.", "Turno incorrecto", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private boolean esFichaDelJugador1(JButton boton) {
        return boton == btn_fichajugadorhumano1 || boton == btn_fichajugadorhumano2
            || boton == btn_fichajugadorhumano3 || boton == btn_fichajugadorhumano4
            || boton == btn_fichajugadorhumano5 || boton == btn_fichajugadorhumano6
            || boton == btn_fichajugadorhumano7;
    }

    private boolean esFichaDelJugador2(JButton boton) {
        // Verifica si el botón pertenece a las fichas del jugador 2
        return boton == btn_ficha1jugador2 || boton == btn_ficha2jugador2
            || boton == btn_ficha3jugador2 || boton == btn_ficha4jugador2
            || boton == btn_ficha5jugador2 || boton == btn_ficha6jugador2
            || boton == btn_ficha7jugador2;
    }

    private void procesarFichaSeleccionada(java.awt.event.MouseEvent evt) {
        String descripcionFicha = fichaSeleccionada;

        try {
            // Extraer los valores de los extremos desde el nombre de la ficha
            int[] valores = obtenerValoresDesdeNombre(descripcionFicha);
            int numeroArriba = valores[0];
            int numeroAbajo = valores[1];

            System.out.println("Ficha seleccionada: [" + numeroArriba + "|" + numeroAbajo + "]");
            System.out.println("Extremos actuales antes de colocar ficha: Izquierdo=" + extremoIzquierdo + ", Derecho=" + extremoDerecho);

            if (!primeraFichaColocada) {
                if (numeroArriba == numeroAbajo) {
                    PosicionFichaDomino posicionFichaDomino = new PosicionFichaDomino(descripcionFicha, 0, numeroArriba, numeroAbajo, 0);
                    guardarFicha(posicionFichaDomino);
                    colocarFichaEnTablero();
                    extremoIzquierdo = numeroArriba;
                    extremoDerecho = numeroAbajo;
                    primeraFichaColocada = true;

                    System.out.println("Primera ficha colocada: [" + numeroArriba + "|" + numeroAbajo + "]");
                    System.out.println("Nuevos extremos: Izquierdo=" + extremoIzquierdo + ", Derecho=" + extremoDerecho);

                    botonSeleccionado.setIcon(null); // Eliminar visualmente la ficha jugada
                    cambiarTurno(); // Cambiar turno después de colocar la primera ficha
                } else {
                    JOptionPane.showMessageDialog(this,
                            "La primera ficha debe ser un doble (ejemplo: [" + numeroArriba + "|" + numeroArriba + "]).",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                boolean fichaValida = false;
                boolean puedeColocarseEnAmbosLados = false;

// Verificar si
                if (numeroArriba == extremoIzquierdo) {
                    extremoIzquierdo = numeroAbajo;
                    fichaValida = true;
                    contadorIzquierda--;
                    PosicionFichaDomino posicionFichaDomino = new PosicionFichaDomino(descripcionFicha, contadorIzquierda, numeroArriba, numeroAbajo, 90);
                    guardarFicha(posicionFichaDomino);
                } else if (numeroAbajo == extremoIzquierdo) {
                    extremoIzquierdo = numeroArriba;
                    fichaValida = true;
                    contadorIzquierda--;
                    PosicionFichaDomino posicionFichaDomino = new PosicionFichaDomino(descripcionFicha, contadorIzquierda, numeroArriba, numeroAbajo, -90);
                    guardarFicha(posicionFichaDomino);
                } else if (numeroArriba == extremoDerecho) {
                    extremoDerecho = numeroAbajo;
                    fichaValida = true;
                    contadorDerecha++;
                    PosicionFichaDomino posicionFichaDomino = new PosicionFichaDomino(descripcionFicha, contadorDerecha, numeroArriba, numeroAbajo, -90);
                    guardarFicha(posicionFichaDomino);
                } else if (numeroAbajo == extremoDerecho) {
                    extremoDerecho = numeroArriba;
                    fichaValida = true;
                    contadorDerecha++;
                    PosicionFichaDomino posicionFichaDomino = new PosicionFichaDomino(descripcionFicha, contadorDerecha, numeroArriba, numeroAbajo, +90);
                    guardarFicha(posicionFichaDomino);

                }

                if (fichaValida) {

                    colocarFichaEnTablero();
                    System.out.println("Ficha colocada: [" + numeroArriba + "|" + numeroAbajo + "]");
                    System.out.println("Nuevos extremos después de colocar ficha: Izquierdo=" + extremoIzquierdo + ", Derecho=" + extremoDerecho);
                    botonSeleccionado.setIcon(null); // Eliminar visualmente la ficha jugada
                    cambiarTurno(); // Cambiar turno después de colocar la ficha
                } else {
                    JOptionPane.showMessageDialog(this,
                            "La ficha seleccionada [" + numeroArriba + "|" + numeroAbajo + "] "
                            + "no coincide con los extremos del tablero: [" + extremoIzquierdo + "] [" + extremoDerecho + "]",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al procesar la ficha seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Agregamos esto para depuración adicional
        }

        fichaSeleccionada = null;
        botonSeleccionado = null;
    }

    private int[] obtenerValoresDesdeNombre(String nombreArchivo) {
        int[] valores = new int[2];
        try {
            String[] partes = nombreArchivo.replace("/fichas/Ficha_", "").replace(".png", "").split("_");
            valores[0] = Integer.parseInt(partes[0]);
            valores[1] = Integer.parseInt(partes[1]);
        } catch (Exception e) {
            System.out.println("Error al obtener valores desde el nombre: " + nombreArchivo);
        }
        return valores;
    }
    
    int contarFichasJugadaIzquierda = 0;
    int contarFichasJugadaDerecha = 0;

    private void colocarFichaEnTablero() {

        Panel_Tablero.removeAll();
        List<PosicionFichaDomino> listaFichasJugadas = listaPartidaEnJuego.obtenerListaPartida();
        if (listaFichasJugadas.isEmpty()) {
            return;
        }
        contarFichasJugadaIzquierda = 0;
        contarFichasJugadaDerecha = 0;
        x = 400;
        y = 200;
        xLadoIzquierdo = 400;
        xLadoDerecho = 400;
        yLadoIzquierdo = 200;
        yLadoDerecho = 200;
        for (PosicionFichaDomino posicion : listaFichasJugadas) {
            double angulo = determinarAnguloRotacion(posicion);

            // Carga la imagen y aplica la rotación directamente
            ImageIcon icon = new ImageIcon(getClass().getResource(posicion.getNombreImagene()));
            ImageIcon iconRotado = rotarImagen(icon, angulo);

            JLabel fichaEnTablero = new JLabel();
            fichaEnTablero.setIcon(iconRotado);

            fichaEnTablero.setBounds(x, y, fichaEnTablero.getIcon().getIconWidth(), fichaEnTablero.getIcon().getIconHeight());

            Panel_Tablero.add(fichaEnTablero);
            Panel_Tablero.repaint();
        }

    }

// Método para rotar una imagen en un ángulo específico
    private ImageIcon rotarImagen(ImageIcon icon, double angulo) {
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        BufferedImage rotada = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = rotada.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Mueve al centro, rota, y mueve de regreso
        g2d.translate(w / 2, h / 2);
        g2d.rotate(Math.toRadians(angulo));
        g2d.translate(-w / 2, -h / 2);

        g2d.drawImage(icon.getImage(), 0, 0, null);
        g2d.dispose();

        return new ImageIcon(rotada);
    }

// Método para determinar el ángulo de rotación según los valores de los extremos
    private double determinarAnguloRotacion(PosicionFichaDomino posicionFichaDomino) {
        int ajuste = 80;
        int posicion = posicionFichaDomino.getPosicion();
        int numeroFichaArriba = posicionFichaDomino.getNumeroFichaArriba();
        int numeroFichaAbajo = posicionFichaDomino.getNumeroFichaAbajo();
        int rotacion = posicionFichaDomino.getRotacion();
        if (posicion == 0) {
            return 0;
        }
        if (posicion < 0) {
            contarFichasJugadaIzquierda++;

            //si esta aqui es porque el numero es negativo y la ficha va al lado izquierdo
            //si esta aqui significa que el numero es par y no necesita rotar la imagen
            if (contarFichasJugadaIzquierda < 6) {
                ajuste = (numeroFichaAbajo == numeroFichaArriba) ? 65 : ajuste;
                if (contarFichasJugadaIzquierda == 1) {
                    ajuste = 65;
                }
                x = xLadoIzquierdo - ajuste;
                xLadoIzquierdo = x;
                return (numeroFichaAbajo == numeroFichaArriba) ? 0 : rotacion;
            } else if (contarFichasJugadaIzquierda == 6) {
                x = xLadoIzquierdo - 10;
                xLadoIzquierdo = x;
                y = yLadoIzquierdo - ajuste + 20;
                yLadoIzquierdo = y;
                if (extremoIzquierdo != numeroFichaArriba) {
                    return 180;
                }
                return 0;

            } else if (contarFichasJugadaIzquierda > 6
                    && contarFichasJugadaIzquierda <= 15) {
                if (contarFichasJugadaIzquierda == 7) {
                    y = yLadoIzquierdo - ajuste + 30;
                    yLadoIzquierdo = y;
                    ajuste = 40;
                }
                if (rotacion < 0) {
                    x = xLadoIzquierdo + ajuste;
                    xLadoIzquierdo = x;
                    return (numeroFichaAbajo == numeroFichaArriba) ? 0 : 90;
                } else {
                    x = xLadoIzquierdo - ajuste;
                    xLadoIzquierdo = x;
                    return (numeroFichaAbajo == numeroFichaArriba) ? 0 : -90;
                }

            } else if (contarFichasJugadaIzquierda == 16) {
                x = xLadoIzquierdo + 20;
                xLadoIzquierdo = x;
                y = yLadoIzquierdo - ajuste + 15;
                yLadoIzquierdo = y;
                return 0;
            } else {
                return (numeroFichaAbajo == numeroFichaArriba) ? 0 : rotacion;
            }

        } else {
            contarFichasJugadaDerecha++;

            if (contarFichasJugadaDerecha < 5) {
                ajuste = (numeroFichaAbajo == numeroFichaArriba) ? 65 : ajuste;
                if (contarFichasJugadaDerecha == 1) {
                    ajuste = 65;
                }
                x = xLadoDerecho + ajuste;
                xLadoDerecho = x;
                return (numeroFichaAbajo == numeroFichaArriba) ? 0 : rotacion;
            } else if (contarFichasJugadaDerecha == 5) {
                x = xLadoDerecho + 10;
                xLadoDerecho = x;
                y = yLadoDerecho + ajuste - 20;
                yLadoDerecho = y;
                if (extremoIzquierdo != numeroFichaArriba) {
                    return 180;
                }
                return 0;

            } else if (contarFichasJugadaIzquierda > 5
                    && contarFichasJugadaIzquierda <= 15) {
                if (contarFichasJugadaIzquierda == 6) {
                    y = yLadoIzquierdo + ajuste - 25;
                    yLadoIzquierdo = y;
                    ajuste = 25;
                }
                if (rotacion < 0) {
                    x = xLadoIzquierdo - ajuste;
                    xLadoIzquierdo = x;
                    return (numeroFichaAbajo == numeroFichaArriba) ? 0 : 90;
                } else {
                    x = xLadoIzquierdo - ajuste;
                    xLadoIzquierdo = x;
                    return (numeroFichaAbajo == numeroFichaArriba) ? 0 : -90;
                }

            } else if (contarFichasJugadaIzquierda == 16) {
                x = xLadoIzquierdo - 20;
                xLadoIzquierdo = x;
                y = yLadoIzquierdo + ajuste - 15;
                yLadoIzquierdo = y;
                return 0;
            } else {
                return (numeroFichaAbajo == numeroFichaArriba) ? 0 : rotacion;
            }
        }
    }

    private void guardarFicha(PosicionFichaDomino posicionFichaDomino) {
        listaPartidaEnJuego.agregarFicha(posicionFichaDomino);
    }

    private void inicializarBolso() {
        bolso = new ArrayList<>();  // Inicializamos la bolsa vacía

        // Lista de botones de fichas del jugador
        JButton[] botones = {
            btn_fichajugadorhumano1, btn_fichajugadorhumano2, btn_fichajugadorhumano3, btn_fichajugadorhumano4,
            btn_fichajugadorhumano5, btn_fichajugadorhumano6, btn_fichajugadorhumano7, btn_ficha1jugador2, btn_ficha2jugador2,
            btn_ficha3jugador2, btn_ficha4jugador2, btn_ficha5jugador2, btn_ficha6jugador2, btn_ficha7jugador2
        };

        // Crear una lista temporal para almacenar las rutas exactas de las fichas ya asignadas a los botones
        List<String> fichasAsignadas = new ArrayList<>();
        for (JButton boton : botones) {
            if (boton.getIcon() != null) {
                ImageIcon icono = (ImageIcon) boton.getIcon();
                // Verificar si el icono tiene una ruta de recurso válida
                String path = icono.getDescription();
                if (path != null && !path.isEmpty()) {
                    fichasAsignadas.add(path);
                }
            }
        }

        // Llenar el bolso solo con las fichas restantes que no están asignadas a los botones
        for (String ficha : fichas) {
            if (!fichasAsignadas.contains(ficha)) {
                bolso.add(ficha);
            }
        }

        // Actualizar el label lb_fichas para mostrar la cantidad de fichas en la bolsa
        lb_fichas.setText("Fichas en bolsa: " + bolso.size());

    }//GEN-LAST:event_Panel_TableroMouseClicked


    private void btntomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntomarActionPerformed
        // TODO add your handling code here:

        // Verificar si la bolsa tiene fichas disponibles
        if (bolso.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No quedan fichas en la bolsa.", "Bolsa Vacía", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Selecciona los botones correspondientes al jugador que tiene el turno
        JButton[] botones;
        if (turnoJugador1) {
            // Botones del jugador 1
            botones = new JButton[]{
                btn_fichajugadorhumano1, btn_fichajugadorhumano2, btn_fichajugadorhumano3,
                btn_fichajugadorhumano4, btn_fichajugadorhumano5, btn_fichajugadorhumano6, btn_fichajugadorhumano7
            };
        } else {
            // Botones del jugador 2
            botones = new JButton[]{
                btn_ficha1jugador2, btn_ficha2jugador2, btn_ficha3jugador2,
                btn_ficha4jugador2, btn_ficha5jugador2, btn_ficha6jugador2, btn_ficha7jugador2
            };
        }

        // Asignar la ficha al primer botón vacío del jugador actual
        for (JButton boton : botones) {
            if (boton.getIcon() == null) {
                // Tomar la primera ficha de la bolsa y asignarla
                String fichaPath = bolso.remove(0);
                ImageIcon icon = new ImageIcon(getClass().getResource(fichaPath));
                boton.setIcon(icon);

                // Actualizar el contador de fichas en lb_fichas
                lb_fichas.setText("Fichas en bolsa: " + bolso.size());
                break; // Asignada una ficha, salimos del bucle
            }
        }


    }//GEN-LAST:event_btntomarActionPerformed

    private void btn_cambiarturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarturnoActionPerformed
        // TODO add your handling code here:

        cambiarTurno();


    }//GEN-LAST:event_btn_cambiarturnoActionPerformed

    private void btn_fichajugadorhumano6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fichajugadorhumano6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_fichajugadorhumano6ActionPerformed

    private void btn_guardarpartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarpartidaActionPerformed
        List<PosicionFichaDomino> listaFichasJugadas = listaPartidaEnJuego.obtenerListaPartida();
        List<String> fichasRestantesJugador1 = obtenerFichasRestantesJugador1();
        List<String> fichasRestantesJugador2 = obtenerFichasRestantesJugador2();
        String jugadorConTurno="";
        if(turnoJugador1){
            jugadorConTurno = "jugador1";
        }else{
            jugadorConTurno = "otroJugador";
        }
        GuardarPartida partida = new GuardarPartida(jugador1, jugador2, contraComputadora, jugadorConTurno,
                listaFichasJugadas,
                fichasRestantesJugador1,
                fichasRestantesJugador2);
        partida.guardarPartida();


    }//GEN-LAST:event_btn_guardarpartidaActionPerformed

    private List<String> obtenerFichasRestantesJugador1() {
        List<String> fichasJugador1 = new ArrayList<>();

        // Verifica los botones asignados al jugador 1
        JButton[] botonesJugador1 = {
            btn_fichajugadorhumano1, btn_fichajugadorhumano2, btn_fichajugadorhumano3,
            btn_fichajugadorhumano4, btn_fichajugadorhumano5, btn_fichajugadorhumano6, btn_fichajugadorhumano7
        };

        for (JButton boton : botonesJugador1) {
            if (boton.getIcon() != null) {
                ImageIcon icono = (ImageIcon) boton.getIcon();
                String path = icono.getDescription();  // Obtener la ruta de la ficha
                if (path != null && !path.isEmpty()) {
                    fichasJugador1.add(path);
                }
            }
        }
        return fichasJugador1;
    }

    private List<String> obtenerFichasRestantesJugador2() {
        List<String> fichasJugador2 = new ArrayList<>();

        // Verifica los botones asignados al jugador 2
        JButton[] botonesJugador2 = {
            btn_ficha1jugador2, btn_ficha2jugador2, btn_ficha3jugador2,
            btn_ficha4jugador2, btn_ficha5jugador2, btn_ficha6jugador2, btn_ficha7jugador2
        };

        for (JButton boton : botonesJugador2) {
            if (boton.getIcon() != null) {
                ImageIcon icono = (ImageIcon) boton.getIcon();
                String path = icono.getDescription();  // Obtener la ruta de la ficha
                if (path != null && !path.isEmpty()) {
                    fichasJugador2.add(path);
                }
            }
        }
        return fichasJugador2;
    }

    private boolean sinFichas(boolean esJugador1) {
        JButton[] botones = esJugador1
                ? new JButton[]{btn_fichajugadorhumano1, btn_fichajugadorhumano2, btn_fichajugadorhumano3, btn_fichajugadorhumano4, btn_fichajugadorhumano5, btn_fichajugadorhumano6,btn_fichajugadorhumano7}
                : new JButton[]{btn_ficha1jugador2, btn_ficha2jugador2, btn_ficha3jugador2, btn_ficha4jugador2, btn_ficha5jugador2, btn_ficha6jugador2,btn_ficha7jugador2};

        for (JButton boton : botones) {
            if (boton.getIcon() != null) {
                return false;
            }
        }
        return true;
    }

    private void verificarGanador() {
        if (sinFichas(true)) {
            JOptionPane.showMessageDialog(this, jugador1 + " ha ganado al quedarse sin fichas!", "¡Ganador!", JOptionPane.INFORMATION_MESSAGE);
        } else if (sinFichas(false)) {
            JOptionPane.showMessageDialog(this, jugador2 + " ha ganado al quedarse sin fichas!", "¡Ganador!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void jugarTurnoBot() {
        System.out.println("Turno de la máquina iniciado.");
        System.out.println("Extremo izquierdo: " + extremoIzquierdo + ", Extremo derecho: " + extremoDerecho);

        List<Ficha> fichasBot = obtenerFichasDeBotones();

        // Depurar fichas disponibles del bot
        System.out.println("Fichas de la máquina disponibles: ");
        for (Ficha ficha : fichasBot) {
            System.out.println("[" + ficha.getValorIzquierdo() + "|" + ficha.getValorDerecho() + "]");
        }

        boolean fichaColocada = false;

        // Buscar una ficha válida para jugar
        for (Ficha ficha : fichasBot) {
            boolean esFichaValida = ficha.esFichaValida(extremoIzquierdo, extremoDerecho, false); // Ignorar primera ficha
            System.out.println("Ficha [" + ficha.getValorIzquierdo() + "|" + ficha.getValorDerecho() + "] válida: " + esFichaValida);

            if (esFichaValida) {
                System.out.println("Ficha válida encontrada: [" + ficha.getValorIzquierdo() + "|" + ficha.getValorDerecho() + "]");

                // Colocar la ficha válida en el tablero
                colocarFichaEnTableroAutomaticamente(ficha);
                actualizarBotonFicha(ficha); // Eliminar la ficha del bot visualmente
                fichaColocada = true;
                break;
            }
        }

        // Si no se colocó ninguna ficha, el bot pasa el turno
        if (!fichaColocada) {
            System.out.println("La máquina no tiene fichas válidas y pasa su turno.");
            JOptionPane.showMessageDialog(this, "La máquina no tiene fichas válidas y pasa su turno.");
        }

        cambiarTurno();
    }

    private void actualizarBotonFicha(Ficha fichaJugada) {
        JButton[] botonesBot = {
            btn_ficha1jugador2, btn_ficha2jugador2, btn_ficha3jugador2,
            btn_ficha4jugador2, btn_ficha5jugador2, btn_ficha6jugador2,btn_ficha7jugador2
        };

        for (JButton boton : botonesBot) {
            if (boton.getIcon() != null && ((ImageIcon) boton.getIcon()).getDescription().equals(fichaJugada.getRutaImagen())) {
                boton.setIcon(null); // Elimina la ficha del botón
                break;
            }
        }
    }

    private List<Ficha> obtenerFichasDeBotones() {
        List<Ficha> fichasBot = new ArrayList<>();
        JButton[] botonesBot = {
            btn_ficha1jugador2, btn_ficha2jugador2, btn_ficha3jugador2,
            btn_ficha4jugador2, btn_ficha5jugador2, btn_ficha6jugador2,btn_ficha7jugador2
        };

        for (JButton boton : botonesBot) {
            if (boton.getIcon() != null) {
                String descripcion = ((ImageIcon) boton.getIcon()).getDescription(); // Obtener la descripción
                int[] valores = obtenerValoresDesdeNombre(descripcion); // Extraer los valores izquierdo y derecho
                String rutaImagen = descripcion; // La ruta de la imagen es la descripción
                fichasBot.add(new Ficha(valores[0], valores[1], rutaImagen)); // Crear la ficha correctamente
            }
        }

        return fichasBot;
    }

    private void colocarFichaEnTableroAutomaticamente(Ficha ficha) {
        System.out.println("Colocando ficha automática: [" + ficha.getValorIzquierdo() + "|" + ficha.getValorDerecho() + "]");

        // Determinar posición automática en el tablero
        int x = Panel_Tablero.getWidth() / 2; // Posición central (puedes ajustar)
        int y = Panel_Tablero.getHeight() / 2; // Posición central (puedes ajustar)

        // Colocar la ficha en el tablero
        // colocarFichaEnTablero(ficha.getValorIzquierdo(), ficha.getValorDerecho(), ficha.getRutaImagen());
        // Actualizar los extremos del tablero
        if (ficha.getValorIzquierdo() == extremoIzquierdo) {
            contadorIzquierda--;
            PosicionFichaDomino posicionFichaDomino = new PosicionFichaDomino(ficha.getRutaImagen(), contadorIzquierda, ficha.getValorIzquierdo(), ficha.getValorDerecho(), 90);
            guardarFicha(posicionFichaDomino);
            extremoIzquierdo = ficha.getValorDerecho();
            colocarFichaEnTablero();
        } else if (ficha.getValorDerecho() == extremoIzquierdo) {
            contadorIzquierda--;
             PosicionFichaDomino posicionFichaDomino = new PosicionFichaDomino(ficha.getRutaImagen(), contadorIzquierda, ficha.getValorIzquierdo(), ficha.getValorDerecho(), -90);
                    guardarFicha(posicionFichaDomino);
            extremoIzquierdo = ficha.getValorIzquierdo();
            colocarFichaEnTablero();
        } else if (ficha.getValorIzquierdo() == extremoDerecho) {
            contadorDerecha++;
             PosicionFichaDomino posicionFichaDomino = new PosicionFichaDomino(ficha.getRutaImagen(), contadorIzquierda, ficha.getValorIzquierdo(), ficha.getValorDerecho(), -90);
                    guardarFicha(posicionFichaDomino);
            extremoDerecho = ficha.getValorDerecho();
            colocarFichaEnTablero();
        } else if (ficha.getValorDerecho() == extremoDerecho) {
            contadorDerecha++;
            PosicionFichaDomino posicionFichaDomino = new PosicionFichaDomino(ficha.getRutaImagen(), contadorIzquierda, ficha.getValorIzquierdo(), ficha.getValorDerecho(), 90);
                    guardarFicha(posicionFichaDomino);
            extremoDerecho = ficha.getValorIzquierdo();
            colocarFichaEnTablero();
        }

        System.out.println("Extremos después de colocar ficha: Izquierdo=" + extremoIzquierdo + ", Derecho=" + extremoDerecho);
    }
    
   public void cargarPartida(String nombreArchivo) {
    File directorio = new File("src/partidasGuardada");
    File archivo = new File(directorio, nombreArchivo);

    List<PosicionFichaDomino> listaFichasJugadas = new ArrayList<>();
    List<String> fichasRestantesJugador1 = new ArrayList<>();
    List<String> fichasRestantesJugador2 = new ArrayList<>();
    String jugador1 = "", jugador2 = "", jugadorConTurno = "";

    if (!archivo.exists()) {
        System.out.println("El archivo no existe: " + archivo.getAbsolutePath());
        return;
    }

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        boolean leyendoFichasJugadas = false;
        boolean leyendoFichasJugador1 = false;
        boolean leyendoFichasJugador2 = false;

        while ((linea = br.readLine()) != null) {
            linea = linea.trim();

            if (linea.startsWith("Jugador 1:")) {
                jugador1 = linea.replace("Jugador 1:", "").trim();
            } else if (linea.startsWith("Jugador 2:")) {
                jugador2 = linea.replace("Jugador 2:", "").trim();
            } else if (linea.startsWith("Turno de:")) {
                jugadorConTurno = linea.replace("Turno de:", "").trim();
            } else if (linea.startsWith("Fichas jugadas en el tablero:")) {
                leyendoFichasJugadas = true;
                leyendoFichasJugador1 = false;
                leyendoFichasJugador2 = false;
            } else if (linea.startsWith("Fichas restantes del Jugador 1:")) {
                leyendoFichasJugadas = false;
                leyendoFichasJugador1 = true;
                leyendoFichasJugador2 = false;
            } else if (linea.startsWith("Fichas restantes del Jugador 2:")) {
                leyendoFichasJugadas = false;
                leyendoFichasJugador1 = false;
                leyendoFichasJugador2 = true;
            } else if (!linea.isEmpty()) {
                if (leyendoFichasJugadas) {
                    String[] partes = linea.replace("Ficha: ", "")
                            .replace(" | Posición: ", ",")
                            .replace(" | Arriba: ", ",")
                            .replace(" | Abajo: ", ",")
                            .replace(" | Rotación: ", ",")
                            .split(",");
                    String ruta = partes[0].trim();
                    int posicion = Integer.parseInt(partes[1].trim());
                    int arriba = Integer.parseInt(partes[2].trim());
                    int abajo = Integer.parseInt(partes[3].trim());
                    int rotacion = Integer.parseInt(partes[4].trim());

                    listaFichasJugadas.add(new PosicionFichaDomino(ruta, posicion, arriba, abajo, rotacion));
                } else if (leyendoFichasJugador1) {
                    fichasRestantesJugador1.add(linea);
                } else if (leyendoFichasJugador2) {
                    fichasRestantesJugador2.add(linea);
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    
    for(PosicionFichaDomino posicionFichaDomino : listaFichasJugadas){
        guardarFicha(posicionFichaDomino);
    }
    colocarFichaEnTablero();
    cargarFichasEnBotones(fichasRestantesJugador1, fichasRestantesJugador2);
    this.jugador1 = jugador1;
    this.jugador2 = jugador2;

    // Muestra los datos cargados
    System.out.println("Jugador 1: " + jugador1);
    System.out.println("Jugador 2: " + jugador2);
    System.out.println("Turno de: " + jugadorConTurno);
    System.out.println("Fichas jugadas: " + listaFichasJugadas.size());
    System.out.println("Fichas restantes Jugador 1: " + fichasRestantesJugador1.size());
    System.out.println("Fichas restantes Jugador 2: " + fichasRestantesJugador2.size());
       
}
   
   private void cargarFichasEnBotones(List<String> fichasJugador1, List<String> fichasJugador2) {
    // Botones del Jugador 1
    JButton[] botonesJugador1 = {
        btn_fichajugadorhumano1, btn_fichajugadorhumano2, btn_fichajugadorhumano3,
        btn_fichajugadorhumano4, btn_fichajugadorhumano5, btn_fichajugadorhumano6, btn_fichajugadorhumano7
    };

    // Botones del Jugador 2
    JButton[] botonesJugador2 = {
        btn_ficha1jugador2, btn_ficha2jugador2, btn_ficha3jugador2,
        btn_ficha4jugador2, btn_ficha5jugador2, btn_ficha6jugador2, btn_ficha7jugador2
    };

    // Asignar fichas al Jugador 1
    for (int i = 0; i < fichasJugador1.size() && i < botonesJugador1.length; i++) {
        String rutaFicha = fichasJugador1.get(i);
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaFicha));
        botonesJugador1[i].setIcon(icono);
    }

    // Asignar fichas al Jugador 2
    for (int i = 0; i < fichasJugador2.size() && i < botonesJugador2.length; i++) {
        String rutaFicha = fichasJugador2.get(i);
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaFicha));
        botonesJugador2[i].setIcon(icono);
}
    
}
    private void cambiarVisibilidadBotonesJugador2(boolean visible) {
    JButton[] botonesJugador2 = {
        btn_ficha1jugador2, btn_ficha2jugador2, btn_ficha3jugador2,
        btn_ficha4jugador2, btn_ficha5jugador2, btn_ficha6jugador2, btn_ficha7jugador2
    };

    for (JButton boton : botonesJugador2) {
        boton.setVisible(visible);
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Tablero;
    private javax.swing.JButton btn_cambiarturno;
    private javax.swing.JButton btn_ficha1jugador2;
    private javax.swing.JButton btn_ficha2jugador2;
    private javax.swing.JButton btn_ficha3jugador2;
    private javax.swing.JButton btn_ficha4jugador2;
    private javax.swing.JButton btn_ficha5jugador2;
    private javax.swing.JButton btn_ficha6jugador2;
    private javax.swing.JButton btn_ficha7jugador2;
    private javax.swing.JButton btn_fichajugadorhumano1;
    private javax.swing.JButton btn_fichajugadorhumano2;
    private javax.swing.JButton btn_fichajugadorhumano3;
    private javax.swing.JButton btn_fichajugadorhumano4;
    private javax.swing.JButton btn_fichajugadorhumano5;
    private javax.swing.JButton btn_fichajugadorhumano6;
    private javax.swing.JButton btn_fichajugadorhumano7;
    private javax.swing.JButton btn_guardarpartida;
    private javax.swing.JButton btn_salirjuego;
    private javax.swing.JButton btntomar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_fichas;
    private javax.swing.JLabel lb_jugador2;
    private javax.swing.JLabel lb_nombre1;
    private javax.swing.JLabel lb_turnoactual;
    // End of variables declaration//GEN-END:variables
}
