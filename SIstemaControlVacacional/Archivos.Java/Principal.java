import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
  private JMenuBar barraMenu;
  private JMenu menuUno, menuDos, menuTres, colorFondo;
  private JMenuItem temaOriginal, temaOscuro, temaClaro, creador, limpiarDatos, salir, vacaciones;
  private JLabel imagenLogo, tituloUno, tituloDos, tituloTres, tituloCuatro, tituloCinco, tituloSeis, tituloSiete, tituloOcho, tituloNueve;
  private JTextField inputUno, inputDos, inputTres;
  private JComboBox comboUno, comboDos;
  private JTextArea resultado;
  private JScrollPane scroll;
  private JButton nuevaConsulta;
  
  String nombreDos = "";
  
  public Principal() {
// Configuracion y titulo de la interfaz
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla Principal");
    getContentPane().setBackground(new Color(255, 0, 0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenidaDos = new Bienvenida();
    
    nombreDos = ventanaBienvenidaDos.nombreUsuario;
    
// Creacion de la barra de menus y los menus
    barraMenu = new JMenuBar();
    barraMenu.setBackground(new Color(255, 0, 0));
    setJMenuBar(barraMenu);
    
// Menu Opciones
    menuUno = new JMenu("Opciones");
    menuUno.setBackground(new Color(0, 0, 0));
    menuUno.setFont(new Font("Andale Mono", 1, 14));
    menuUno.setForeground(new Color(0, 0, 0));
    barraMenu.add(menuUno);
    
    colorFondo = new JMenu("Color de Fondo");
    colorFondo.setFont(new Font("Andale Mono", 1, 14));
    colorFondo.setForeground(new Color(0, 0, 0));
    menuUno.add(colorFondo);
    
// Temas fondo menu colorFondo   
    temaOriginal = new JMenuItem("Tema Original");
    temaOriginal.setFont(new Font("Andale Mono", 1, 14));
    temaOriginal.setForeground(new Color(255, 0, 0));
    colorFondo.add(temaOriginal);
    temaOriginal.addActionListener(this);
    
    temaOscuro = new JMenuItem("Tema Oscuro");
    temaOscuro.setFont(new Font("Andale Mono", 1, 14));
    temaOscuro.setForeground(new Color(0, 0, 0));
    colorFondo.add(temaOscuro);
    temaOscuro.addActionListener(this);
    
    temaClaro = new JMenuItem("Tema Claro");
    temaClaro.setFont(new Font("Andale Mono", 1, 14));
    temaClaro.setForeground(new Color(100, 100, 100));
    colorFondo.add(temaClaro);
    temaClaro.addActionListener(this);

// Limpiar datos    
    limpiarDatos = new JMenuItem("Limpiar Datos");
    limpiarDatos.setFont(new Font("Andale Mono", 1, 14));
    limpiarDatos.setForeground(new Color(0, 0, 0));
    menuUno.add(limpiarDatos);
    limpiarDatos.addActionListener(this);
    
// Salir      
    salir = new JMenuItem("Salir");
    salir.setFont(new Font("Andale Mono", 1, 14));
    salir.setForeground(new Color(0, 0, 0));
    menuUno.add(salir);
    salir.addActionListener(this);
    
// Menu Calcular
    menuDos = new JMenu("Calcular");
    menuDos.setBackground(new Color(0, 0, 0));
    menuDos.setFont(new Font("Andale Mono", 1, 14));
    menuDos.setForeground(new Color(0, 0, 0));
    barraMenu.add(menuDos);
    
    vacaciones = new JMenuItem("Vacaciones");
    vacaciones.setFont(new Font("Andale Mono", 1, 14));
    vacaciones.setForeground(new Color(0, 0, 0));
    menuDos.add(vacaciones);
    vacaciones.addActionListener(this);
    
    nuevaConsulta = new JButton("Nueva Consulta");
    nuevaConsulta.setBounds(480, 280, 130, 30);
    add(nuevaConsulta);
    nuevaConsulta.addActionListener(this);
    
// Menu Acerca de
    menuTres = new JMenu("Acerca de");
    menuTres.setBackground(new Color(0, 0, 0));
    menuTres.setFont(new Font("Andale Mono", 1, 14));
    menuTres.setForeground(new Color(0, 0, 0));
    barraMenu.add(menuTres);
    
    creador = new JMenuItem("Creador del Software");
    creador.setFont(new Font("Andale Mono", 1, 14));
    creador.setForeground(new Color(0, 0, 0));
    menuTres.add(creador);
    creador.addActionListener(this);
    
// Logo de coca-cola
    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    imagenLogo = new JLabel(imagen);
    imagenLogo.setBounds(5, 5, 250, 100);
    add(imagenLogo);
    
//titulo de bienvenida
    tituloUno = new JLabel("Bienvenido " + nombreDos);
    tituloUno.setBounds(280, 30, 300, 50);
    tituloUno.setFont(new Font("Andale Mono", 1, 32));
    tituloUno.setForeground(new Color(255, 255, 255));
    add(tituloUno);
    
// Subtitulo
    tituloDos = new JLabel("Datos del trabajador para el calculo de vacaciones:");
    tituloDos.setBounds(45, 140, 900, 25);
    tituloDos.setFont(new Font("Andale Mono", 0, 24));
    tituloDos.setForeground(new Color(255, 255, 255));
    add(tituloDos);
    
//Titulo y primer campo de ingreso de datos
    tituloTres = new JLabel("Nombres: ");
    tituloTres.setBounds(25, 188, 180, 25);
    tituloTres.setFont(new Font("Andale Mono", 1, 12));
    tituloTres.setForeground(new Color(255, 255, 255));
    add(tituloTres);
    
    inputUno = new JTextField();
    inputUno.setBounds(25, 213, 150, 25);
    inputUno.setBackground(new java.awt.Color(224, 224, 224));
    inputUno.setFont(new java.awt.Font("Andale Mono", 1, 14));
    inputUno.setForeground(new java.awt.Color(0, 0, 0));
    add(inputUno);
    
//Titulo y segundo campo de ingreso de datos
    tituloCuatro = new JLabel("Primer Apellido: ");
    tituloCuatro.setBounds(25, 248, 180, 25);
    tituloCuatro.setFont(new Font("Andale Mono", 1, 12));
    tituloCuatro.setForeground(new Color(255, 255, 255));
    add(tituloCuatro);
    
    inputDos = new JTextField();
    inputDos.setBounds(25, 273, 150, 25);
    inputDos.setBackground(new java.awt.Color(224, 224, 224));
    inputDos.setFont(new java.awt.Font("Andale Mono", 1, 14));
    inputDos.setForeground(new java.awt.Color(0, 0, 0));
    add(inputDos);
    
//Titulo y tercer campo de ingreso de datos
    tituloCinco = new JLabel("Segundo Apellido: ");
    tituloCinco.setBounds(25, 308, 180, 25);
    tituloCinco.setFont(new Font("Andale Mono", 1, 12));
    tituloCinco.setForeground(new Color(255, 255, 255));
    add(tituloCinco);
    
    inputTres = new JTextField();
    inputTres.setBounds(25, 334, 150, 25);
    inputTres.setBackground(new java.awt.Color(224, 224, 224));
    inputTres.setFont(new java.awt.Font("Andale Mono", 1, 14));
    inputTres.setForeground(new java.awt.Color(0, 0, 0));
    add(inputTres);
    
//Titulo y cuarto campo de ingreso de datos
    tituloSeis = new JLabel("Departamento de la empresa:");
    tituloSeis.setBounds(220, 188, 180, 25);
    tituloSeis.setFont(new Font("Andale Mono", 1, 12));
    tituloSeis.setForeground(new Color(255, 255, 255));
    add(tituloSeis);
    
    comboUno = new JComboBox();
    comboUno.setBounds(220, 213, 220, 25);
    comboUno.setBackground(new java.awt.Color(224, 224, 224));
    comboUno.setFont(new java.awt.Font("Andale Mono", 1, 14));
    comboUno.setForeground(new java.awt.Color(0, 0, 0));
    add(comboUno);
    comboUno.addItem("");
    comboUno.addItem("Atencion al cliente");
    comboUno.addItem("Logistica");
    comboUno.addItem("Gerencia");
    
// Titulo y quinto ingreso de datos
    tituloSiete = new JLabel("Selecciona tu antiguedad:");
    tituloSiete.setBounds(220, 248, 180, 25);
    tituloSiete.setFont(new Font("Andale Mono", 1, 12));
    tituloSiete.setForeground(new Color(255, 255, 255));
    add(tituloSiete);
    
    comboDos = new JComboBox();
    comboDos.setBounds(220, 273, 220, 25);
    comboDos.setBackground(new java.awt.Color(224, 224, 224));
    comboDos.setFont(new java.awt.Font("Andale Mono", 1, 14));
    comboDos.setForeground(new java.awt.Color(0, 0, 0));
    add(comboDos);
    comboDos.addItem("");
    comboDos.addItem("1 año de servicio");
    comboDos.addItem("2 a 6 años de servicio");
    comboDos.addItem("7 años o mas de servicio");
    
// Campo donde se muestra el resultado 
    tituloOcho = new JLabel("Resultado:");
    tituloOcho.setBounds(220, 307, 180, 25);
    tituloOcho.setFont(new Font("Andale Mono", 1, 12));
    tituloOcho.setForeground(new Color(255, 255, 255));
    add(tituloOcho);
    
    resultado = new JTextArea();
    resultado.setEditable(false);
    resultado.setBackground(new Color(224, 224, 224));
    resultado.setFont(new Font("Andale Mono", 1, 11));
    resultado.setForeground(new Color(0, 0, 0));
    resultado.setText("");
    scroll = new JScrollPane(resultado);
    scroll.setBounds(220, 333, 385, 90);
    add(scroll);
    
// Leyenda de la empresa
    tituloNueve = new JLabel("© 2024 The Coca-Cola Company | Todos los derechos reservados");
		tituloNueve.setBounds(135, 445, 500, 30);
		tituloNueve.setFont(new Font("Andale Mono", 1, 12));
		tituloNueve.setForeground(new java.awt.Color(255, 255, 255));
		add(tituloNueve);
  }
  
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == temaOriginal) {
      getContentPane().setBackground(new Color(255, 0, 0));
      
    } else if (e.getSource() == temaOscuro) {
      getContentPane().setBackground(new Color(50, 50, 50));
      
    } else if (e.getSource() == temaClaro) {
      getContentPane().setBackground(new Color(140, 0, 75));
      
    } else if (e.getSource() == limpiarDatos) {
      inputUno.setText("");
      inputDos.setText("");
      inputTres.setText("");
      comboUno.setSelectedIndex(0);
      comboDos.setSelectedIndex(0);
      resultado.setText("");
      
    } else if (e.getSource() == salir) {
      System.exit(0);
      
    } else if (e.getSource() == vacaciones) {
    // Variables Locales que recuperan los datos que el usuario ingrese
      String nombreTrabajador = inputUno.getText();
      String primerApellidoTrabajador = inputDos.getText();
      String segundoApellidoTrabajador = inputTres.getText();
      String tipoDepartamento = comboUno.getSelectedItem().toString();
      String antiguedad = comboDos.getSelectedItem().toString();
      
            if (nombreTrabajador.equals("") || primerApellidoTrabajador.equals("") || segundoApellidoTrabajador.equals("") || tipoDepartamento.equals("") ||    antiguedad.equals("")) {
                JOptionPane.showMessageDialog(null, "¡Recuerda que debes llenar todas las casillas!");
          
            } else if (tipoDepartamento.equals("Atencion al cliente")) {
        
                  if (antiguedad.equals("1 año de servicio")) {
                       resultado.setText("\n Hola " + nombreTrabajador + " " + primerApellidoTrabajador + " " + segundoApellidoTrabajador + 
                                  "\n perteneces al departamento de " + tipoDepartamento + " y tienes una antiguedad de " + antiguedad + 
                                  "\n por lo tanto tienes derecho a 6 dias de vacaciones.");
                                  
                   } else if (antiguedad.equals("2 a 6 años de servicio")) {
                       resultado.setText("\n Hola " + nombreTrabajador + " " +  primerApellidoTrabajador + " " + segundoApellidoTrabajador + 
                                  "\n perteneces al departamento de " + tipoDepartamento + " y tienes una antiguedad de " + antiguedad + 
                                  "\n por lo tanto tienes derecho a 14 dias de vacaciones.");
                                  
                   } else if (antiguedad.equals("7 años o mas de servicio")) {
                      resultado.setText("\n Hola " + nombreTrabajador + " " +  primerApellidoTrabajador + " " + segundoApellidoTrabajador + 
                                  "\n perteneces al departamento de " + tipoDepartamento + " y tienes una antiguedad de " + antiguedad + 
                                  "\n por lo tanto tienes derecho a 20 dias de vacaciones.");
                  }
          
            } else if (tipoDepartamento.equals("Logistica")) {
        
                   if (antiguedad.equals("1 año de servicio")) {
                      resultado.setText("\n Hola " + nombreTrabajador + " " +  primerApellidoTrabajador + " " + segundoApellidoTrabajador + 
                                  "\n perteneces al departamento de " + tipoDepartamento + " y tienes una antiguedad de " + antiguedad + 
                                  "\n por lo tanto tienes derecho a 7 dias de vacaciones.");
                                  
                   } else if (antiguedad.equals("2 a 6 años de servicio")) {
                      resultado.setText("\n Hola " + nombreTrabajador + " " +  primerApellidoTrabajador + " " + segundoApellidoTrabajador + 
                                  "\n perteneces al departamento de " + tipoDepartamento + " y tienes una antiguedad de " + antiguedad +
                                  "\n por lo tanto tienes derecho a 15 dias de vacaciones.");
                                  
                    } else if (antiguedad.equals("7 años o mas de servicio")) {
                       resultado.setText("\n Hola " + nombreTrabajador + " " +  primerApellidoTrabajador + " " + segundoApellidoTrabajador +
                                  "\n perteneces al departamento de " + tipoDepartamento + " y tienes una antiguedad de " + antiguedad + 
                                  "\n por lo tanto tienes derecho a 22 dias de vacaciones.");
                   }    
                   
            } else if (tipoDepartamento.equals("Gerencia")) {
          
                    if (antiguedad.equals("1 año de servicio")) {
                        resultado.setText("\n Hola " + nombreTrabajador + " " +  primerApellidoTrabajador + " " + segundoApellidoTrabajador + 
                                  "\n perteneces al departamento de " + tipoDepartamento + " y tienes una antiguedad de " + antiguedad + 
                                  "\n por lo tanto tienes derecho a 10 dias de vacaciones.");
                                  
                    } else if (antiguedad.equals("2 a 6 años de servicio")) {
                         resultado.setText("\n Hola " + nombreTrabajador + " " +  primerApellidoTrabajador + " " + segundoApellidoTrabajador + 
                                  "\n perteneces al departamento de " + tipoDepartamento + " y tienes una antiguedad de " + antiguedad + 
                                  "\n por lo tanto tienes derecho a 20 dias de vacaciones.");
                                  
                    } else if (antiguedad.equals("7 años o mas de servicio")) {
                          resultado.setText("\n Hola " + nombreTrabajador + " " +  primerApellidoTrabajador + " " + segundoApellidoTrabajador + 
                                  "\n perteneces al departamento de " + tipoDepartamento + " y tienes una antiguedad de " + antiguedad + 
                                  "\n por lo tanto tienes derecho a 30 dias de vacaciones.");
                    }
            }
      
    } else if (e.getSource() == creador) {
      JOptionPane.showMessageDialog(null, "Desarrollado por Andres Bermudez\n" +
                                          "   www.AndresBermudez.com.co");
                                          
    } else if (e.getSource() == nuevaConsulta) {
      Bienvenida ventana = new Bienvenida();
		  ventana.setBounds(0, 0, 350, 450);
		  ventana.setResizable(false);
		  ventana.setLocationRelativeTo(null);
		  ventana.setVisible(true);
		  
		  this.setVisible(false);
    }
  }
  
  public static void main (String[] args) {
    Principal ventanaPrincipal = new Principal();
    ventanaPrincipal.setBounds(0, 0, 640, 535);
    ventanaPrincipal.setResizable(false);
    ventanaPrincipal.setLocationRelativeTo(null);
    ventanaPrincipal.setVisible(true);
  }
}
