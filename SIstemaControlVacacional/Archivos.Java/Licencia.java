import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {
  private JLabel titulo, logoCoca;
  private JTextArea terminos;
  private JScrollPane scroll;
  private JCheckBox marcar;
  private JButton acepto, noAcepto;
  
  String nombre = "";
  
  public Licencia() {
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    
  //Recuperamos a esta clase el nombre que ingreso el usuario 
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre = ventanaBienvenida.nombreUsuario;
    
    titulo = new JLabel();
    titulo.setBounds(215, 5, 200, 30);
    titulo.setFont(new Font("Andale Mono", 1, 14));
    titulo.setForeground(new Color(0, 0, 0));
    add(titulo);
    
    terminos = new JTextArea();
    terminos.setEditable(false);
    terminos.setFont(new Font("Andale Mono", 0, 9));
    terminos.setText("\n\n          TERMINOS Y CONDICIONES");
    
    scroll = new JScrollPane(terminos);
    scroll.setBounds(10, 40, 575, 200);
    add(scroll);
    
    marcar = new JCheckBox("Yo " + nombre + " Acepto");
    marcar.setBounds(10, 250, 300, 30);
    marcar.addChangeListener(this);
    add(marcar);
    
    acepto = new JButton("Continuar");
    acepto.setBounds(12, 290, 100, 30);
    acepto.addActionListener(this);
    acepto.setEnabled(false);
    add(acepto);
    
    noAcepto = new JButton("No Acepto");
    noAcepto.setBounds(120, 290, 100, 30);
    noAcepto.addActionListener(this);
    noAcepto.setEnabled(true);
    add(noAcepto);
    
    ImageIcon imagen = new ImageIcon("images/coca-cola.png");
    
    logoCoca = new JLabel(imagen);
    logoCoca.setBounds(315, 135, 300, 300);
    add(logoCoca);
  }
  
  public void stateChanged(ChangeEvent e) {
    if (marcar.isSelected() == true) {
      acepto.setEnabled(true);
      noAcepto.setEnabled(false);
      
    } else {
      acepto.setEnabled(false);
      noAcepto.setEnabled(true);
    }
  }
  
  public void actionPerformed(ActionEvent e ) {
    if (e.getSource() == noAcepto) {
      Bienvenida ventana = new Bienvenida();
		  ventana.setBounds(0, 0, 350, 450);
		  ventana.setResizable(false);
		  ventana.setLocationRelativeTo(null);
		  ventana.setVisible(true);
		  
		  this.setVisible(false);
		  
    } else if (e.getSource() == acepto) {
      Principal ventana = new Principal();
      ventana.setBounds(0, 0, 640, 535);
      ventana.setResizable(false);
      ventana.setLocationRelativeTo(null);
      ventana.setVisible(true);
      
      this.setVisible(false);
    }
  }
  
  public static void main (String[] args) {
    Licencia ventana = new Licencia();
    ventana.setBounds(0, 0, 600, 380);
    ventana.setVisible(true);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
  }
}
