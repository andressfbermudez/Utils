import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener {
	private JLabel tituloUno, tituloDos, tituloTres, tituloCuatro;
	private JTextField entradaUsuario;
	private JButton botonIngresar;
	
	public static String nombreUsuario = "";
	
	public Bienvenida() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(255, 0, 0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		
		ImageIcon imagenUno = new ImageIcon("images/logo-coca.png");
		tituloUno = new JLabel(imagenUno);
		tituloUno.setBounds(25, 15, 300, 150);
		add(tituloUno);
		
		tituloDos = new JLabel("Sistema de Control Vacacional");
		tituloDos.setBounds(35, 135, 300, 30);
		tituloDos.setFont(new Font("Andale Mono", 3, 18));
		tituloDos.setForeground(new Color(0, 0, 0));
		add(tituloDos);
		
		tituloTres = new JLabel("Ingrese su nombre:");
		tituloTres.setBounds(45, 212, 300, 30);
		tituloTres.setFont(new Font("Andale Mono", 3, 18));
		tituloTres.setForeground(new Color(0, 0, 0));
		add(tituloTres);
		
		tituloCuatro = new JLabel("© 2024 The Coca-Cola Company");
		tituloCuatro.setBounds(85, 375, 300, 30);
		tituloCuatro.setFont(new Font("Andale Mono", 3, 12));
		tituloCuatro.setForeground(new Color(0, 0, 0));
		add(tituloCuatro);
		
		entradaUsuario = new JTextField();
		entradaUsuario.setBounds(45, 240, 255, 25);
		entradaUsuario.setBackground(new Color(224, 224, 224));
		entradaUsuario.setFont(new Font("Andale Mono", 1, 14));
		add(entradaUsuario);
		
		botonIngresar = new JButton("Ingresar");
		botonIngresar.setBounds(125, 280, 100, 30);
		botonIngresar.setBackground(new Color(255, 255, 255));
		botonIngresar.setFont(new Font("Andale Mono", 1, 14));
		setForeground(new Color(0, 0, 0));
		add(botonIngresar);
		botonIngresar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
	  if(e.getSource() == botonIngresar) {
	    nombreUsuario = entradaUsuario.getText().trim();
	    
	    if (nombreUsuario.equals("")) {
	      JOptionPane.showMessageDialog(null, "¡Debes ingresar tu nombre!");
	      
	    } else {
	// Este bloque de codigo conecta las interfaces de la aplicacion    
	      Licencia ventana = new Licencia();
        ventana.setBounds(0, 0, 600, 380);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        
    // Esta linea cierra la interfaz grafica donde estamos actualmente    
        this.setVisible(false);
	    }
	  }
	}
	
	public static void main(String[] args) {
		Bienvenida ventana = new Bienvenida();
		ventana.setBounds(0, 0, 350, 450);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
}


